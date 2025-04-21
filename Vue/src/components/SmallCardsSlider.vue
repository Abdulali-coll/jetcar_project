<template>
  <section class="small-cards">
    <!-- Add slider-->
    <swiper
      class="swiper-container"
      :slides-per-view="3"
      space-between="20"
      pagination
    >
      <swiper-slide
        v-for="(car, index) in cars"
        :key="index"
        class="car-card"
      >
        <router-link
          :to="{ name: 'CarCardPage', query: { car: JSON.stringify(car) } }"
          @click.native="scrollToHeader"
        >
          <div class="car-image">
            <img :src="car.image" alt="Car Image" />
          </div>
          <h4>{{ car.name }}</h4>
          <p>{{ car.price }}</p>
        </router-link>
      </swiper-slide>
    </swiper>

    <!-- Credit Section -->
    <div class="credit-container">

      <div class="text-container">
        <h2>Расчёт и оформление автокредита</h2>
        <p>
          Мы предлагаем выгодные условия автокредита. Заполните форму ниже, чтобы рассчитать предварительные выплаты и подать заявку.
        </p>

<form @submit.prevent="calculateCredit">
  
  <label for="price">Стоимость автомобиля (руб):</label>
  <span>{{ carPrice.toLocaleString() }} руб</span>
  <br>
  <input
    type="range"
    id="price"
    v-model="carPrice"
    :min="minCarPrice"
    :max="maxCarPrice"
    :step="5000"
  />

  <label for="initialPayment">Первоначальный взнос (руб):</label>
  <span>{{ initialPayment.toLocaleString() }} руб</span>
  <br>
  <input
    type="range"
    id="initialPayment"
    v-model="initialPayment"
    :min="minInitialPayment"
    :max="carPrice"
    :step="500"
  />

  <label for="term">Срок кредита (лет):</label>
  <span>{{ creditTerm }} лет</span>
  <br>
  <input
    type="range"
    id="term"
    v-model="creditTerm"
    :min="1"
    :max="7"
    :step="1"
  />

  <button type="submit">Рассчитать</button>
</form>
        <div v-if="monthlyPayment" class="result">
          <h3>Результат расчёта:</h3>
          <p>Ежемесячный платёж: {{ monthlyPayment.toLocaleString() }} руб</p>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import axios from 'axios'
import creditCar from '@/assets/creditCar.webp';
import creditCar2 from '@/assets/creditCar2.webp';
import { Swiper, SwiperSlide } from 'swiper/vue';
import 'swiper/swiper-bundle.css';

export default {
  name: "CarsSmallCopy",
  components: {
    Swiper,
    SwiperSlide,
  },
  data() {
    return {
      creditCar,
      creditCar2,
      cars: [],
      carPrice: '',
      initialPayment: '',
      creditTerm: '',
      monthlyPayment: null,
      fullName: '',
      phone: '',
      email: '',
      carPrice: 5000000,
      minCarPrice: 1000000,
      maxCarPrice: 10000000,
      initialPayment: 1000000,
      minInitialPayment: 0,
      creditTerm: 3, 
      baseUrl: import.meta.env.VITE_API_BASE_URL || '',
    };
  },
  created() {
    this.fetchCars()
  },
  methods: {
    fetchCars() {
      axios.get(`${this.baseUrl}/api/cars`)
        .then(({ data }) => {
          this.cars = Array.isArray(data) ? data : [data]
        })
        .catch(err => {
          console.error("Ошибка при загрузке машин:", err)
        })
    },

    getImageUrl(path) {
      if (!path) return ''
      return path.startsWith('/')
        ? this.baseUrl + path
        : this.baseUrl + '/' + path
    },
    scrollToHeader() {
      window.scrollTo({ top: 0, behavior: "smooth" });
    },
    calculateCredit() {
      const price = parseFloat(this.carPrice);
      const initial = parseFloat(this.initialPayment);
      const term = parseInt(this.creditTerm);
      const annualRate = 0.12; 

      if (price && initial && term) {
        const loanAmount = price - initial;
        const monthlyRate = annualRate / 12;
        const months = term * 12;

        this.monthlyPayment = Math.round(
          (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months))
        );
      } else {
        alert('Пожалуйста, заполните все поля для расчёта.');
      }
    },
    submitCreditApplication() {
      if (this.fullName && this.phone && this.email) {
        alert(
          `Спасибо, ${this.fullName}! Ваша заявка на кредит отправлена. Мы свяжемся с вами по телефону: ${this.phone}.`
        );
        this.fullName = '';
        this.phone = '';
        this.email = '';
        this.carPrice = '';
        this.initialPayment = '';
        this.creditTerm = '';
        this.monthlyPayment = null;
      } else {
        alert('Пожалуйста, заполните все поля для оформления заявки.');
      }
    },
  }
};
</script>

<style scoped>
/* credit slider */
input[type="range"] {
  width: 100%;
  appearance: none;
  background: white;
  height: 6px;
  border-radius: 3px;
  outline: none;
  cursor: pointer;
  padding-bottom: 25px;
}

input[type="range"]::-webkit-slider-thumb {
  appearance: none;
  width: 20px;
  height: 20px;
  background: #E5B748;
  border-radius: 50%;
  cursor: pointer;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
}

input[type="range"]::-moz-range-thumb {
  width: 20px;
  height: 20px;
  background: #E5B748; 
  border-radius: 50%;
  cursor: pointer;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
}

.credit-container {

  align-items: center;
  margin-right: 100px;
}

.text-container {
  margin-left: 500px;
  width: 60%;
}

.text-container h2 {
  color: #E5B748;
  font-size: 36px;
  text-align: center;
  margin-bottom: 10px;
}

.text-container p {
  margin-bottom: 20px;
  line-height: 1.5;
}

.text-container form {
  margin-bottom: 20px;
}

.text-container label {
  display: block;
  margin-bottom: 5px;
  font-weight: bold;
}

.text-container input {
  width: 100%;
  padding: 10px;
  margin-bottom: 15px;
  border: 1px solid #ccc;
  border-radius: 5px;
  font-size: 14px;
}

.text-container button {
  background-color: #E5B748;
  color: white;
  font-size: 22px;
  border: none;
  border-radius: 5px;
  padding: 10px 15px;
  cursor: pointer;
}

.text-container button:hover {
  background-color: #d4a039;
}

.text-container span {
  display: block;
  color: #E5B748;
  font-weight: bold;
  font-size: 16px;
  margin-top: 5px;
}

.result {
  background-color: #f8f8f8;
  padding: 15px;
  border-radius: 5px;
  margin-top: 10px;
}

.result h3 {
  margin: 0 0 5px;
  color: black;
}

.result p {
  color: black;
  font-weight: bold;
}

.car-card a {
    text-decoration: none;
    color:white;
}

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
  font-size: 20px;
  margin-top: 5px;
}

.car-details li {
  font-size: 16px;
  color: white;
  padding-bottom: 5px;
}

.swiper-container {
  border-bottom: 1px solid #ccc;
}
</style>
