<template>
  <!-- Components for buy page -->
  <section class="Buy-car">
    <div class="content-wrapper">
      <div class="car-image-wrapper">
        <!-- Big image -->
        <div class="car-image" @click="openModal(mainCarImage)">
          <img :src="mainCarImage" alt="Main Car" />
        </div>

        <!-- Small images -->
        <div class="mini-images">
          <img :src="miniCarImage" alt="Mini Car 1" @click="openModal(miniCarImage)" />
          <img :src="miniCarImage" alt="Mini Car 2" @click="openModal(miniCarImage)" />
        </div>
      </div>

      <!-- Info about avto -->
      <div class="car-info">
        <h2>Черноморский катамаран с забугорья IV Рестайлинг</h2>
        <h1>12 500 999 ₸</h1>
        <ul class="car-details">
          <li><strong>Пробег:</strong> 1137 км</li>
          <li><strong>Мощность:</strong> 525 л.с.</li>
          <li><strong>Тип Двигателя:</strong> Атомный, Уран 238U</li>
          <li><strong>Год выпуска:</strong> 2018</li>
        </ul>
        <div class="car-text">
          <h4>Это транспортное средство представляет собой своего рода инфернальное деятище лучших инженеров...</h4>
        </div>
      </div>
    </div>

    <!-- Button -->
    <div class="big-button">
      <nav class="buy-button">
        <router-link to="/contacts">КУПИТЬ ЭТУ КОЛЯСКУ!</router-link>
      </nav>
    </div>

    <!-- Modal for zoomed image -->
    <div v-if="isModalOpen" class="modal" @click="closeModal">
      <span class="close">&times;</span>
      <img class="modal-content" :src="currentImage" alt="Zoomed Car Image" />
    </div>
  </section>
</template>

<script>
import mainCarImage from '@/assets/car_card_0.jpg';
import miniCarImage from '@/assets/car_card_0.jpg';

export default {
  name: 'CardComp',
  data() {
    return {
      mainCarImage,
      miniCarImage,
      isModalOpen: false,
      currentImage: '',
    };
  },
  methods: {
    openModal(image) {
      this.currentImage = image; 
      this.isModalOpen = true;
    },
    closeModal() {
      this.isModalOpen = false;
    }
  }
};
</script>

<style scoped>
.Buy-car {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 20px;
  gap: 20px;
  border-bottom: 1px solid #ccc;
}
/*Modal image properties*/
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

/* Big image */
.car-image img {
  width: 500px;
  height: auto;
  object-fit: cover;
  cursor: pointer;
}

/* Small images */
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
/*Info about car */
.car-info {
  font-family:'Oswald', sans-serif;;
  max-width: 500px;
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
}

/*Properties avto*/
.car-details {
  list-style: none;
  padding: 0;
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

/* Button block */
.big-button {
  margin-top: 100px;
  display: flex;
  justify-content: center;
  width: 100%;
  margin-bottom: 50px;
}

.buy-button a {
  background-color: #e5b748;
  color: white;
  padding: 15px 40px;
  text-align: center;
  border-radius: 50px;
  text-decoration: none;
  font-size: 35px;
  font-weight: bold;
  display: inline-block;
}

/* Adaptive from mobile */
@media (max-width: 768px) {
  .content-wrapper {
    flex-direction: column;
    align-items: center;
  }

  .car-info {
    text-align: center;
  }

  .buy-button a {
    width: 100%;
  }
}
</style>

