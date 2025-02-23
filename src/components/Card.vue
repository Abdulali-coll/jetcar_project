<template>
  <section class="Buy-car">
    <div class="content-wrapper">
      <div class="car-image-wrapper">
        <!-- Big picture -->
        <div class="car-image" @click="openModal(car.image)">
          <img :src="car.image" alt="Main Car" />
        </div>
        <!-- Small pictures -->
        <div class="mini-images">
          <img :src="car.imageAny" alt="Mini Car 1" @click="openModal(car.imageAny)" />
          <img :src="car.imageBack" alt="Mini Car 2" @click="openModal(car.imageBack)" />
        </div>
        <div class="Buttons">
        <!--Modal window for favorite cars-->
      <button @click="toggleFavorite(car)" class="favorite-button">
        {{ isFavorite(car) ? 'Убрать из избранного' : 'Добавить в избранное' }}
      </button>
      <button @click="openFavorites" class="favorite-button">Показать избранное</button>
      <button @click="addToCompare(car)" class="favorite-button">Сравнить</button>
    </div>
      </div>
      <!-- Info about car -->
      <div class="car-info" v-if="car">
        <h2>{{ car.name }}</h2>
        <h1>{{ car.price }}</h1>
        <ul class="car-details">
          <li><strong>Пробег:</strong> {{ car.mileage }} км</li>
          <li><strong>Мощность:</strong> {{ car.power }} л.с.</li>
          <li><strong>Тип Двигателя:</strong> {{ car.engineType }}</li>
          <li><strong>Год выпуска:</strong> {{ car.year }}</li>
        </ul>
        <div class="car-text">
          <h4>{{ car.description }}</h4>
        </div>
      </div>
    </div>

    <!-- button buy -->
    <div class="big-button">
      <nav class="buy-button">
        <router-link to="/contacts">Купить!</router-link>
      </nav>
    </div>

    <!-- Modal picture -->
    <div v-if="isModalOpen" class="modal" @click="closeModal">
      <span class="close">&times;</span>
      <img class="modal-content" :src="currentImage" alt="Zoomed Car Image" />
      <!-- navigate arrows -->
      <div class="navigation">
        <button @click.stop="prevImage" class="prev">&lt;</button>
        <button @click.stop="nextImage" class="next">&gt;</button>
      </div>
    </div>
  </section>

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
          <!-- Remove favorite car button -->
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
          <p><strong>пробег:</strong> {{ car.mileage }}</p>
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
export default {
  name: 'Card',
  props: {
    car: {
      type: Object,
      required: true,
    },
  },
  data() {
    return {
      isModalOpen: false,
      currentImage: '',
      images: [], 
      currentIndex: 0, 
      favorites: [],
      compareCars: [],
      showFavoritesModal: false,
      showCompareModal: false,
    };
  },
  watch: {
    car: {
      immediate: true, 
      handler(newCar) {
        this.images = [newCar.image, newCar.imageAny, newCar.imageBack];
        this.currentIndex = 0; 
        this.currentImage = this.images[0];
      },
    },
  },
  methods: {
    openModal(image) {
      this.currentIndex = this.images.indexOf(image);
      this.currentImage = image;
      this.isModalOpen = true;
    },
    closeModal() {
      this.isModalOpen = false;
    },
    nextImage() {
      this.currentIndex = (this.currentIndex + 1) % this.images.length;
      this.currentImage = this.images[this.currentIndex];
    },
    prevImage() {
      this.currentIndex =
        (this.currentIndex - 1 + this.images.length) % this.images.length;
      this.currentImage = this.images[this.currentIndex];
    },
    toggleFavorite(car) {
      const index = this.favorites.findIndex((favorite) => favorite.name === car.name);
      if (index !== -1) {
        this.favorites.splice(index, 1); 
      } else {
        this.favorites.push(car);
      }
      this.saveFavorites();
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
.car-card p {
  font-family: 'Oswald', sans-serif;
  font-weight: bold;
  color: #e5b748;
}

.Buttons {
  display:flex;
}

/* Compare styles */
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

.compare-modal .modal-content {
  background: black;
  padding: 20px;
  border-radius: 10px;
  width: 100%;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
  text-align: center;
  overflow-y: auto;
  max-height: 80%;
}

.favorites-modal .modal-content .car-card{
  width: 300px
}

.compare-modal .modal-content .car-card {
  width: 300px;
}

/* Стили для модальных окон */
.compare-modal .car-image img{
  max-width: 300px; /* Увеличить размер для сравнения машин */
}

.favorites-modal .car-image img{
  max-width: 300px; /* Размер для избранных машин */
}

.compare-cars {
  display: flex;
  justify-content: space-around;
  gap: 20px;
}

.remove-button {
  background-color: #ff0000;
  color: white;
  border: none;
  padding: 12px 16px;
  border-radius: 10px;
  cursor: pointer;
  font-size: 14px;
  margin-top: 10px;
  margin-bottom: 10px;
}

.remove-button:hover {
  background-color: #ff3333;
}

/*Styles for modal window*/
.favorites-modal {
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

.modal-content {
  background: black;
  padding: 20px;
  border-radius: 10px;
  width: 80%;
  max-width: 600px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
  overflow-y: auto;
  max-height: 80%; 
  display: flex;
  flex-direction: column; 
  align-items: center; 
}

.close-button {
  background: red;
  width: 120px;
  height: 40px;
  color: white;
  font-size: 18px;
  padding: 10px;
  border: none;
  border-radius: 5px;
  margin-bottom: 30px;
  cursor: pointer;
}

.modal-content h3{
  font-size: 25px;
  color: #e5b748;
}

/* cars list */
.modal-car-list {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(150px, 1fr)); 
  gap: 15px; 
  margin-top: 20px;
  justify-content: center; 
}

.modal-car-item {
  background-color: #222; 
  color: white;
  padding: 10px;
  border-radius: 5px;
  text-align: center;
}

.favorite-button {
  background-color: #f0c14b;
  border: 1px solid #a88734;
  color: white;
  font-family: 'Oswald', sans-serif;
  font-weight: bold;
  font-size: 19px;
  padding: 8px 12px;
  cursor: pointer;
  border-radius: 3px;
  margin: 10px;
}

.favorite-button:hover {
  background-color: #ddb347;
}
/* styles to navigate arrows */
.navigation {
  display: flex;
  justify-content: space-between;
  position: absolute;
  top: 50%;
  width: 100%;
  transform: translateY(-50%);
}

.prev,
.next {
  background-color: rgba(0, 0, 0, 0.5);
  color: white;
  border: none;
  font-size: 2rem;
  cursor: pointer;
  padding: 10px;
}

.Buy-car {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 20px;
  gap: 20px;
  border-bottom: 1px solid #ccc;
}

.modal {
  display: flex;
  justify-content: center;
  align-items: center;
  position: fixed;
  z-index: 1000;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.8);
}

.modal-content {
  max-width: 90%;
  max-height: 90%;
  object-fit: contain;
}

.close {
  position: absolute;
  top: 20px;
  right: 35px;
  color: white;
  font-size: 40px;
  font-weight: bold;
  cursor: pointer;
}

.close:hover,
.close:focus {
  color: #ccc;
  text-decoration: none;
  cursor: pointer;
}

.content-wrapper {
  display: flex;
  flex-direction: row;
  gap: 30px;
  justify-content: center;
  align-items: flex-start;
  width: 100%;
}

.car-image-wrapper {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 15px;
}

.car-image img {
  width: 500px;
  height: auto;
  object-fit: cover;
  cursor: pointer;
}

.mini-images {
  display: flex;
  justify-content: space-between;
  gap: 10px;
  cursor: pointer;
}

.mini-images img {
  width: 245px;
  height: 185px;
  object-fit: cover;
}

.car-info {
  font-family: 'Oswald', sans-serif;
  width: 400px;
  text-align: left;
}

.car-info h2 {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 10px;
}

.car-info h1 {
  font-size: 45px;
  color: #e5b748;
  margin-bottom: 20px;
}

.car-text {
 color: gray;
 font-family: 'Roboto', sans-serif;
 font-weight: 200;
 word-wrap: break-word;
}

.car-details {
  list-style: none;
  justify-content: space-between;
  padding: 0;
  font-family: 'Roboto', sans-serif;
  font-weight: 700;
  margin-bottom: 20px;
}

.car-details li {
  font-size: 20px;
  padding-bottom: 40px;
  border-bottom: 1px solid #ccc;
}

.car-details li:last-child {
  border-bottom: none;
}

.big-button {
  margin-top: 100px;
  display: flex;
  justify-content: center;
  width: 100%;
  margin-bottom: 50px;
}

.Buy-car a {
  text-decoration: none;
}

.buy-button a {
  background-color: #e5b748;
  color: white;
  padding: 15px 50px;
  text-align: center;
  border-radius: 10px;
  text-decoration: none;
  font-size: 35px;
  font-weight: bold;
  display: inline-block;
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

/* Adaptive styles 768px */
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
  .content-wrapper {
    flex-direction: column;
    align-items: center;
  }

  .car-image img {
    width: 350px;
  }

  .mini-images img {
    width: 160px;
    height: auto;
  }

  .car-info {
    text-align: center;
  }

  .buy-button a {
    font-size: 28px; 
    padding: 12px 30px;
  }
}

/* Adaptive styles 480px */
@media (max-width: 480px) {
  .modal-content {
  width: 100%;
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

.car-image img {
  width: 250px; 
}

.mini-images img {
  width: 120px; 
  height: auto;
}

.buy-button a {
  font-size: 24px; 
  padding: 10px 25px;
}
}
</style>
