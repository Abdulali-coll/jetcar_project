<template>
  <!-- Favorite button -->
  <transition name="scale-pulse">
  <button 
    v-if="favorites.length > 0" 
    @click="openFavorites" 
    class="global-favorite-button">
    <img :src="ListIcon" alt="List button">
  </button>
  </transition>

  <section class="small-cards">
    <div v-for="car in cars" :key="car.id" class="car-card">
      <router-link
        :to="{ name: 'CarCardPage', query: { car: JSON.stringify(car) } }"
        @click.native="scrollToHeader"
      >
        <div class="car-image">
          <img
            v-if="car.image"
            :src="getImageUrl(car.image)"
            :alt="car.name"
          />
          <div v-else class="no-image">Нет фото</div>
        </div>
        <h4>{{ car.name }}</h4>
        <p>{{ car.price }}</p>
      </router-link>

      <button @click="toggleFavorite(car)" :class="{'favorite-active' : isFavorite(car)}" class="favorite-button heart-button">
        <img v-if="isFavorite(car)" :src="FavoriteIconActive" />
        <img v-else :src="FavoriteIcon" />
      </button>
      <button @click="addToCompare(car)" :class="{'compare-active': isCompare(car)}" class="favorite-button"> 
        <img v-if="isCompare(car)" :src="CompareIconActive" />
        <img v-else :src="CompareIcon" />
      </button>
      </div>
  </section>

  <!--Modal window for favorite cars-->
  <section class="favorites-modal" v-if="showFavoritesModal">
    <div class="modal-content">
      <h3>Избранные машины</h3>
      <button @click="closeFavorites" class="close-button">Закрыть</button>
      <div v-if="favorites.length > 0">
        <div v-for="(car, index) in favorites" :key="index" class="car-card">
          <router-link :to="{ name: 'CarCardPage', query: { car: JSON.stringify(car) } }" @click.native="scrollToHeader">
          <div class="car-image">
            <img :src="car.image" alt="Car Image" />
          </div>
        </router-link>
          <h4>{{ car.name }}</h4>
          <p>{{ car.price }}</p>
          <button @click="removeFromFavorites(car)" class="remove-button">Удалить</button>
        </div>
      </div>
      <div v-else>
        <p>Нет избранных машин.</p>
      </div>
    </div>
  </section>

<!-- Modal window for comparing cars -->
<section class="compare-modal" v-if="showCompareModal">
  <div class="modal-content">
    <h3>Сравнение машин</h3>
    <button @click="closeCompare" class="close-button">Закрыть</button>
    <div v-if="compareCars.length > 0">
      <div class="compare-cars">
        <!-- car specifications-->
        <div v-for="(car, index) in compareCars" :key="car.id" class="car-card">
          <router-link :to="{ name: 'CarCardPage', query: { car: JSON.stringify(car) } }" @click.native="scrollToHeader">
          <div class="car-image">
            <img :src="car.image" alt="Car Image" />
          </div>
        </router-link>
          <h4>{{ car.name }}</h4>
          <p><strong>Цена:</strong> {{ car.price }}</p>
          <p><strong>Пробег:</strong> {{ car.mileage }}</p>
          <p><strong>Год:</strong> {{ car.year }}</p>
          <p><strong>Двигатель:</strong> {{ car.engineType }}</p>
          <p><strong>Мощность:</strong> {{ car.power }}</p>
          <button @click="removeFromCompares(car)" class="remove-button">Удалить</button>
        </div>
      </div>
    </div>
    <div v-else>
      <p>Добавьте машины для сравнения.</p>
    </div>
  </div>
</section>
</template>

<script>

import FavoriteIcon from '@/assets/Heart.svg';
import CompareIcon from '@/assets/Search.svg';
import FavoriteIconActive from '@/assets/Heart_active.svg';
import ListIcon from '@/assets/List.svg';
import CompareIconActive from '@/assets/cancel.svg';

import axios from 'axios'

export default {
  name: "CarsSmall",
  data() {
    return {
      cars: [],
      favorites: [],
      compareCars: [],
      showFavoritesModal: false,
      showCompareModal: false,
      FavoriteIcon ,
      CompareIcon ,
      FavoriteIconActive ,
      ListIcon ,
      CompareIconActive ,
      baseUrl: import.meta.env.VITE_API_BASE_URL || ''
    };
  },
  created() {
    this.fetchCars();
  },
  methods: {
    fetchCars() {
      axios.get(`${this.baseUrl}/api/cars`)
    .then(resp => {
      console.log("got cars:", resp.data)
      this.cars = resp.data
    })
        .catch(error => {
          console.error('Ошибка при загрузке данных автомобилей:', error);
      });
  },
  getImageUrl(path) {
    if (path.startsWith('/')) {
        return this.baseUrl + path
      }
      return this.baseUrl + '/' + path
    },
  /* Add to favorite method */
  toggleFavorite(car) {
    const index = this.favorites.findIndex((favorite) => favorite.name === car.name);
    if (index !== -1) {
      this.favorites.splice(index, 1); 
    } else {
      this.favorites.push(car);
      this.animatePulse(); 
    }
    this.saveFavorites(); 
  },

  animatePulse() {
    const button = document.querySelector('.global-favorite-button');
    if (button) {
      button.classList.add('scale-pulse-pulse');
      setTimeout(() => {
        button.classList.remove('scale-pulse-pulse');
      }, 1000); 
    }
    },
    isFavorite(car) {
      return this.favorites.some((favorite) => favorite.name === car.name);
    },
    scrollToHeader() {
      window.scrollTo({ top: 0, behavior: "smooth" });
    },
    openFavorites() {
      this.showFavoritesModal = true;
    },
    closeFavorites() {
      this.showFavoritesModal = false;
    },
    removeFromFavorites(car) {
      this.favorites = this.favorites.filter((fav) => fav.name !== car.name);
      this.saveFavorites(); 
    },

  /* Compare methods */
  addToCompare(car) {
  if (!this.isCompare(car)) {
    if (this.compareCars.length >= 3) {
      alert("Можно сравнить не более 3 машин.");
      return;
    }
    this.compareCars.push(car);
    this.saveCompareCars(); 
  }
  this.showCompareModal = true;
  },
  isCompare(car) {
    return this.compareCars.some((compares) => compares.name === car.name);
  },
  closeCompare() {
    this.showCompareModal = false;
  },
  compare() {
    console.log("Сравнение машин", this.compareCars);
    this.showCompareModal = true;
  },
  removeFromCompares(car) {
    this.compareCars = this.compareCars.filter((com) => com.name !== car.name);
    this.saveCompareCars();
  },

    /* LocalStorage Methods */
    saveFavorites() {
      localStorage.setItem("favorites", JSON.stringify(this.favorites));
    },
    loadFavorites() {
      const storedFavorites = localStorage.getItem("favorites");
      if (storedFavorites) {
        this.favorites = JSON.parse(storedFavorites);
      }
    },
    saveCompareCars() {
      localStorage.setItem("compareCars", JSON.stringify(this.compareCars));
    },
    loadCompareCars() {
      const storedCompareCars = localStorage.getItem("compareCars");
      if (storedCompareCars) {
        this.compareCars = JSON.parse(storedCompareCars);
      }
    },
  },
  mounted() {
    this.loadFavorites();
    this.loadCompareCars();
  },
};
</script>

<style scoped>

.small-cards {
  display: flex;
  justify-content: space-between;
  margin-top: 100px;
  gap: 10px;
  flex-wrap: wrap;
  text-decoration: none;
}

.car-card {
  width: 30%;
  text-align: left;
  text-decoration: none;
  margin-bottom: 15px;
  margin-top: 10px
}

.car-card a {
  text-decoration: none;
  color:white;
}

.car-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  border-radius: 0;
}

.car-card h4 {
  margin: 5px 0;
}

.car-card p {
  color: #e5b748;
  font-family: 'Oswald', sans-serif;
  font-weight: bold;
  font-size: 18px;
  margin-top: 5px;
  margin-bottom: 5px;
}

.car-details li {
  font-size: 16px;
  color: white;
  padding-bottom: 5px;
}

.compare-modal {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 1000;
}

.compare-modal .modal-content .car-card {
  width: 300px;
}

.compare-modal .modal-content {
  background: black;
  padding: 20px;
  border-radius: 10px;
  width: 80%;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
  text-align: center;
  overflow-y: auto;
  max-height: 80%;
}

.compare-cars {
  display: flex;
  justify-content: space-around;
  gap: 20px;
}

.remove-button {
  background: red;
  width: 100px;
  color: white;
  padding: 10px;
  border: none;
  border-radius: 5px;
  margin-bottom: 30px;
  margin-top: 20px ;
  cursor: pointer;
}

.remove-button:hover {
  background-color: #ff3333;
}

.compare-modal .car-image {
  width: 300px;
}

/*Styles for modal window*/
.favorites-modal {
  position: fixed;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: center;
  align-items: center;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 1050;
  padding: 20px;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
}

.modal-content {
  background: black;
  padding: 20px;
  border-radius: 12px;
  width: 60%;
  border-style: 4px;
  box-shadow: 0 25px 35px rgba(255, 255, 255, 0.3);
  text-align: center;
  overflow-y: auto;
  max-height: 80%;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.close-button {
  width: 120px;
  background: red;
  color: white;
  padding: 10px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

.close-button:hover {
  color: #333;
}

.favorite-button {
  width: 40px;
  height: 40px;
  background-color: black;
  box-shadow: none;
  border: none;
  outline: none;
  padding: 0;
  margin-right: 5px;
}

.favorite-button img{
  width: 30px;
  height: 30px;
}

.favorites-modal .car-image {
  width: 300px;
}

.favorites-modal .modal-content .car-card{
  width: 300px
}

@keyframes pulse {
  0% {
    transform: scale(1);
  }
  50% {
    transform: scale(2);
  }
  100% {
    transform: scale(1); 
  }
}

/* Global button styles */
.global-favorite-button {
  width:60px;
  height: 60px;
  position: fixed;
  top: 300px;
  right: 20px; 
  z-index: 1000; 
  box-shadow: none; 
  background-color: black;
  border: none; 
  outline: none; 
  padding: 0;
  border-radius: 5px;
}

.global-favorite-button img{
  width:60px;
  height: 60px;
}

@media (max-width: 1108px) {
.compare-modal .car-image {
width: 200px;
}

.favorites-modal .car-image {
  width: 200px;
}

.compare-cars {
  gap: 5px;
}

.favorites-modal .modal-content .car-card{
  width: 200px
}

.compare-modal .modal-content .car-card {
  width: 200px;
}
}

@media (max-width: 768px) {
.compare-modal .car-image {
width: 100px;
}

.favorites-modal .car-image {
  width: 100px;
}

.compare-cars {
  gap: 5px;
}

.favorites-modal .modal-content .car-card{
  width: 100px
}

.compare-modal .modal-content .car-card {
  width: 100px;
}
}

@media (max-width: 468px) {
.modal-content {
  width: 100%;
}

.modal-content::-webkit-scrollbar {
  width: 12px; /* Сделаем шире */
}

.modal-content::-webkit-scrollbar-thumb {
  background-color: #FFD700; 
  border-radius: 6px;
}

.modal-content::-webkit-scrollbar-track {
  background-color: rgba(255, 255, 255, 0.3);
}

.car-card p {
  color: #e5b748;
  font-family: 'Oswald', sans-serif;
  font-weight: bold;
  font-size: 12px;
  margin-top: 5px;
  margin-bottom: 5px;
}

.global-favorite-button img{
  width:30px;
  height: 30px;
}

.global-favorite-button {
  width:30px;
  height: 30px;
}
}
</style>
