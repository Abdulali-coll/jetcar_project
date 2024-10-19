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
          <div class="descript-text"> Cемейный катамаран для обыденых поездок за картошкой в деревню.
           Изящные черты заставят вас сожалеть даже о самом небрежном столновении. Если вам 40+ лет и вы одинокий скуф - эта машина для вас!
          </div>
      </div>
    </section>

    <!-- Brends Btns -->
    <section class="brand-buttons">
      <button>Майбах</button>
      <button>Ауби</button>
      <button>Какделак</button>
      <button>Чехословацкий Автопром</button>
      <button>Мохентохен Моторспорт</button>
      <button>Чингизхан Inc</button>
      <button>ГАЗ</button>
      <button>МММ</button>
    </section>

    <!-- Small Cards -->
    <section class="small-cards">
      <div class="car-card">
        <div class="car-image">
        </div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image"></div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image"></div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
    </section>

    <section class="small-cards">
      <div class="car-card">
        <div class="car-image"></div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image"></div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image"></div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
    </section>

    <section class="small-cards">
      <div class="car-card">
        <div class="car-image"></div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image"></div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
      <div class="car-card">
        <div class="car-image"></div>
        <h4>Гоночная Спортивная Коляска (F77)</h4>
        <p>7 500 999 ₸</p>
      </div>
    </section>

    <!-- Map and Img-->
    <section class="map-and-info">
      <div class="map-container"></div>
      <div class="promo-text">
        <!--<img src="car-image.png" alt="Car Promo">-->
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

export default {
  name: 'App',
  data() {
    return {
      mainCarImage
    };
  }
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
.number{
  font-size: 22px;
}

.descript-text{
  color: gray;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
}

.adress{
  font-weight: 500;
  padding-right: 25px;
  padding-bottom: 5px;
}
.contact-text{
  font-size: 15px;
  color: #E5B748;
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
  border-bottom: 2px solid #E5B748;
  padding-bottom: 8px;
}

.contact-info, .company-info {
  padding-left: 25px;
}

.logo {
  font-family: 'Oswald', sans-serif;
  font-size: 38px;
  color: #E5B748;
}

.navigation {
  display: flex;
  justify-content: center;
  margin: 10px 0;
}

.navigation a {
  color: white;
  margin: 0 15px;
  text-transform: uppercase;
  text-decoration: none;
  font-size: 16px;
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
  color: #E5B748;
}

.divider {
  border: 0;
  height: 1px;
  background-color: grey;
  margin: 20px 0;
}

.brand-buttons {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 10px;
  margin: 20px 0;
}

.brand-buttons button {
  background-color: transparent;
  border: 1px solid white;
  color: white;
  padding: 10px;
  font-family: 'Oswald', sans-serif;
  text-transform: uppercase;
}

.small-cards {
  display: flex;
  justify-content: space-between;
  margin-top: 20px;
}

.car-card {
  width: 30%;
  text-align: center;
}

.car-card .car-image {
  width: 100%;
  height: 150px;
  background-color: white;
}

.car-card h4 {
  margin: 10px 0;
}

.car-card p {
  color: #E5B748;
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

.promo-text img {
  max-width: 100%;
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
