<template>
  <div class="main-container">
    <!-- Header -->
    <header class="header">
      <div class="contact-info">
        <span><div class="number"> 7 988 152-65-67</div></span>
        <span><div class="contact-text">Связаться!</div></span>
      </div>
      <h1 class="logo">JET CAR</h1>
      <div class="company-info">
        <span><div class="adress"> Сыктывкар, ул. Андерграунд </div></span>
        <span>График: с 10:00 до 20:00</span>
      </div>
    </header>

    <!-- Navigation Btns -->
    <nav class="navigation">
      <a href="#">Купить Авто</a>
      <a href="#">Каталог</a>
      <a href="#">Контакты</a>
      <a href="#">О нас</a>
    </nav>

    <!-- Main Card -->
    <section class="main-card">
      <div class="car-image">
        <img :src="mainCarImage" alt="Main Car" />
      </div>
      <div class="car-info">
        <h2>Черноморский катамаран с забугорья IV Рестайлинг</h2>
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
          <div class="descript-text"> Cемейный катамаран для обыденных поездок за картошкой в деревню.
           Изящные черты заставят вас сожалеть даже о самом небрежном столновении. Если вам 40+ лет и вы одинокий скуф - эта машина для вас!
          </div>
      </div>
    </section>

    <!-- Brends Btns -->
    <hr class="divider">
    <section class="brand-buttons">
      <button>
        <img :src="carLogo" alt="Mercedes Logo" />
        <span>Майбах</span>
      </button>
      <button>
        <img :src="carLogo" alt="Mercedes Logo" />
        <span>Ауби</span>
      </button>
      <button>
        <img :src="carLogo" alt="Mercedes Logo" />
        <span>Какделак</span>
      </button>
      <button>
        <img :src="carLogo" alt="Mercedes Logo" />
        <span>Чехословацкий Автопром</span>
      </button>
      <button>
        <img :src="carLogo" alt="Mercedes Logo" />
        <span>Мохентохен Моторспорт</span>
      </button>
      <button>
        <img :src="carLogo" alt="Mercedes Logo" />
        <span>Чингизхан Inc</span>
      </button>
      <button>
        <img :src="carLogo" alt="Mercedes Logo" />
        <span>ГАЗ</span>
      </button>
      <button>
        <img :src="carLogo" alt="Mercedes Logo" />
        <span>МММ</span>
      </button>
    </section>

    <hr class="divider">


    <!-- Small Cards -->
    
    <section class="small-cards">
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
    </section>

    <section class="small-cards">
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
    </section>

    <section class="small-cards">
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image">
          <img :src="bmwImage" alt="Car Image" />
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
    </section>

    <!-- Map and Promo Image -->
    <section class="map-and-info">
      <div class="map-container"></div>
      <div class="promo-text">
        <p>Уфф было это что за чёртолет такой... <br>
          Тебя давно не было в уличных гонках! Садись за руль и приезжай к нам в Чайна таун...</p>
      </div>
    </section>

    <!-- Footer -->
    <footer class="footer">
      <p>© 2004-2024 Все права были защищены JetCar. <br> не лом немного похуй AbdulDian Inc.</p>
    </footer>
  </div>
</template>

<script>
import mainCarImage from '@/assets/car_card_0.jpg';
import carLogo from '@/assets/mercedes_logo.png';
import bmwImage from '@/assets/bmw-image_0.jpg';

export default {
  name: 'App',
  data() {
    return {
      mainCarImage,
      carLogo,
      bmwImage,
    };
  },
};
</script>

<style scoped>
.main-container {
  background-color: black;
  color: white;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
  padding: 20px;
}

.number {
  font-size: 22px;
}

.descript-text {
  color: gray;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
}

.adress {
  font-weight: 500;
  padding-right: 25px;
  padding-bottom: 5px;
}

.contact-text {
  font-size: 15px;
  color: #e5b748;
  padding-top: 5px;
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

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 2px solid #e5b748;
  padding-bottom: 8px;
}

.contact-info,
.company-info {
  padding-left: 25px;
}

.logo {
  font-family: 'Oswald', sans-serif;
  font-size: 38px;
  color: #e5b748;
}

.navigation {
  background-color: #242424;
  display: flex;
  justify-content: center;
  height: 45px;
  align-items: center;
  margin: 10px 0;
  gap: 150px;
}

.navigation a {
  color: #8d8d8d;
  font-weight: 300;
  margin: 0 15px;
  text-transform: uppercase;
  text-decoration: none;
  font-size: 20px;
}

.main-card {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 20px 0;
}

.car-image {
  margin-right: 40px;
}

.car-image img {
  width: 460px;
  height: 300px;
  object-fit: cover;
  border-radius: 35px;
}

.car-info {
  max-width: 400px;
}

.car-info h2 {
  font-family: 'Oswald', sans-serif;
  font-size: 24px;
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

/* Сетки и кнопки */
.brand-buttons {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 20px;
  margin: 20px 0;
}

.brand-buttons button {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 240px;
  height: 80px;
  background-color: #333;
  color: white;
  border: 1px solid white;
  font-family: 'Oswald', sans-serif;
  text-transform: uppercase;
  margin: 10px;
  padding: 10px;
}

.brand-buttons img {
  width: 40px;
  height: auto;
  margin-bottom: 5px;
}

.brand-buttons span {
  font-size: 14px;
  text-align: center;
}

.small-cards {
  display: flex;
  justify-content: space-between;
  margin-top: 20px;
  gap: 10px; 
}

.car-card {
  width: 30%;
  text-align: left; 
}

.car-card .car-image {
  width: 350px;
  height: 200px;
}

.car-card img {
  width: 100%;
  height: 200px;
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

.map-and-info {
  display: flex;
  justify-content: space-between;
  margin-top: 30px;
}

.map-container {
  width: 60%;
  height: 300px;
  background-color: grey;
}

.promo-text {
  width: 35%;
  text-align: right;
}

.promo-text p {
  font-family: 'Oswald', sans-serif;
  font-size: 16px;
  color: white;
}

.footer {
  margin-top: 20px;
  text-align: center;
  font-size: 12px;
  color: grey;
}
</style>
