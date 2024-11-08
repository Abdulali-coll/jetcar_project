<template>
  <!-- Components for buy page -->
  <section class="Buy-car">
    <div class="content-wrapper">
      <div class="car-image-wrapper">
        <!-- Большое изображение -->
        <div class="car-image" @click="openModal(car.image)">
          <img :src="car.image" alt="Main Car" />
        </div>

        <!-- Миниатюрные изображения -->
        <div class="mini-images">
          <img :src="car.image" alt="Mini Car 1" @click="openModal(car.image)" />
          <img :src="car.image" alt="Mini Car 2" @click="openModal(car.image)" />
        </div>
      </div>

      <!-- Информация о машине -->
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

    <!-- Кнопка "КУПИТЬ" -->
    <div class="big-button">
      <nav class="buy-button">
        <router-link to="/contacts">КУПИТЬ ЭТУ КОЛЯСКУ!</router-link>
      </nav>
    </div>

    <!-- Модальное окно для увеличенного изображения -->
    <div v-if="isModalOpen" class="modal" @click="closeModal">
      <span class="close">&times;</span>
      <img class="modal-content" :src="currentImage" alt="Zoomed Car Image" />
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
    };
  },
  methods: {
    openModal(image) {
      this.currentImage = image;
      this.isModalOpen = true;
    },
    closeModal() {
      this.isModalOpen = false;
    },
  },
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
  max-width: 600px;
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
  padding: 15px 40px;
  text-align: center;
  border-radius: 50px;
  text-decoration: none;
  font-size: 35px;
  font-weight: bold;
  display: inline-block;
}

/* Adaptive styles 768px */
@media (max-width: 768px) {
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
