<template>
  <!-- Main Card -->
  <section class="main-card">
    <div class="car-image">
      <img :src="mainCarImage" alt="Main Car" />
    </div>
    <div class="car-info">
      <h2>Pegassi Tempesta V12</h2>
      <h3>12 500 999 ₸</h3>
      <div class="car-spec">
        <div class="spec-name">Пробег:</div>
        <div class="spec-value">1137 км</div>
      </div>
      <hr class="divider">
      <div class="car-spec">
        <div class="spec-name">Мощность:</div>
        <div class="spec-value">525 л.с.</div>
      </div>
      <hr class="divider">
      <div class="descript-text">
        В какой-то момент, спрашивая: «Так как быстро это?» Это как спросить парня, который только что просунил кулаком через твои ребра: «Так насколько ты силен?» 
        Дело больше не в скорости. Дело тоже не в стиле, потому что одно прикосновение газа, и это немного больше, чем размыто. Вы просто знаете, что в глубине души есть зуд, который может поцарапать только этот автомобиль, и вам не хватает каких-либо личных качеств, которым вам придется сопротивляться.
      </div>
      <div class="contact-button">
      <button class="button-inside" @click="openModal">ТЕСТ ДРАЙВ!</button>
    </div>
    </div>

    <!-- test drive Modal window -->
<div v-if="isModalOpen" class="modal-overlay" @click="closeModal">
  <div class="modal-content" @click.stop>
    <h3>Записаться на тест-драйв</h3>
    <p>Выберите модель автомобиля и оставьте свои контактные данные.</p>
    <form @submit.prevent="submitForm">
      <!-- Choose Panel -->
      <select v-model="selectedModel" required>
        <option disabled value="">Выберите модель</option>
        <option v-for="model in carModels" :key="model" :value="model">
          {{ model }}
        </option>
      </select>

      <!-- input data -->
      <input type="text" v-model="name" placeholder="Ваше имя" required />
      <input type="tel" v-model="phone" placeholder="Телефон" required />
      <input type="email" v-model="email" placeholder="Email" required />

      <button type="submit">Отправить</button>
    </form>
    <button class="close-button" @click="closeModal">Закрыть</button>
  </div>
</div>

  </section>
</template>

<script>
import mainCarImage from '@/assets/source-image/Tempesta.webp';

export default {
  name: 'MainComp',
  data() {
    return {
      mainCarImage,
      isModalOpen: false,
      name: '',
      phone: '',
      selectedModel: '', 
      carModels: ['glendale', 'gauntletClassicCustom', 'banshee', 'buccaneer', 'comet',
                  'elegyRetroSport', 'elegyRH8', 'F10', 'weevil', 'buccaneerCustom', 'cometRetro', 'factionCustom',
                  'GauntlelClassic','italiGTO','nero','neroCustom','primo','sentinelClassic','specter','yosemite','yoga'], 
    };
  },
  methods: {
    openModal() {
      this.isModalOpen = true;
    },
    closeModal() {
      this.isModalOpen = false;
    },
    submitForm() {
      if (!this.selectedModel) {
        alert('Пожалуйста, выберите модель автомобиля.');
        return;
      }

      alert(`Спасибо, ${this.name}! Вы записаны на тест-драйв модели ${this.selectedModel}. Мы свяжемся с вами по телефону: ${this.phone}.`);
      this.closeModal();
      this.name = '';
      this.phone = '';
      this.selectedModel = '';
    },
  },
};
</script>


<style scoped>
.contact-button {
  display: flex;
  justify-content: center;
  align-items: center;
  border-radius: 25px;
  height: 60px;
  width: 300px;
  margin-top: 20px;
}

.button-inside {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100%;
  font-weight: bold;
  font-size: 18px;
  color: black;
  text-decoration: none;
  font-family: 'Oswald', sans-serif;
  cursor: pointer;
}

.number {
  font-size: 22px;
}

.descript-text {
  color: gray;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
}

.car-spec {
  display: flex;
  justify-content: space-between;
  margin-bottom: 10px;
  color: gray;
}

.spec-value {
  text-align: right;
  margin-right: 80px;
}

.contact-info,
.company-info {
  padding-left: 25px;
}

.main-card {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 20px 0;
  margin-bottom: 150px;
}

.car-image {
  margin-right: 40px;
}

.car-image img {
  width: 560px;
  height: 320px;
  object-fit: cover;
  border-radius: 20px;
}

.car-info {
  max-width: 400px;
}

.car-info h2 {
  font-family: 'Oswald', sans-serif;
  font-size: 38px;
}

.car-info h3 {
  font-family: 'Oswald', sans-serif;
  font-weight: bold;
  font-size: 30px;
  color: #e5b748;
}

.divider {
  border: 0;
  height: 2px;
  background-color: grey;
  margin: 35px 0;
}
/*Styles for the test drive pop-up window*/
.modal-overlay {
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
  background: white;
  padding: 20px;
  border-radius: 10px;
  text-align: center;
  width: 90%;
  max-width: 400px;
}

.modal-content h3 {
  margin-bottom: 15px;
  color: black;
}

.modal-content p {
  color: black;
}

.modal-content form {
  display: flex;
  flex-direction: column;
}

.modal-content input {
  margin-bottom: 10px;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  font-size: 16px;
}

.modal-content button {
  background-color: #E5B748;
  color: white;
  font-size: 16px;
  border: none;
  border-radius: 5px;
  padding: 10px;
  cursor: pointer;
}

.modal-content select {
  width: 100%;
  padding: 10px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  font-size: 16px;
}


.close-button {
  margin-top: 10px;
  background: transparent;
  color: #e74c3c;
  border: none;
  font-size: 14px;
  cursor: pointer;
}

/* Adaptive styles 768px */
@media (max-width: 768px) {
  .main-card {
    flex-direction: column;
    align-items: flex-start;
  }

  .car-image {
    margin-right: 0;
    margin-bottom: 20px;
  }

  .car-image img {
    width: 100%;
    height: auto;
    border-radius: 15px;
  }

  .car-info {
    max-width: 100%;
  }

  .car-info h2 {
    font-size: 20px;
  }

  .car-info h3 {
    font-size: 24px;
  }

  .spec-value {
    margin-right: 10px;
  }
}

/* Adaptive styles 480px */
@media (max-width: 480px) {
  .main-card {
    margin: 10px 0;
  }

  .car-info h2 {
    font-size: 18px;
  }

  .car-info h3 {
    font-size: 22px;
  }

  .car-spec {
    flex-direction: column;
    align-items: flex-start;
  }

  .spec-value {
    text-align: left;
    margin-right: 0;
  }

  .divider {
    margin: 20px 0;
  }

  .descript-text {
    font-size: 14px;
  }
}
</style>
