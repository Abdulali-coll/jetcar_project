<template>
  <div class="main-container">
    <!-- Верхняя панель с информацией -->
    <header class="header">
      <div class="contact-info">
        <span>+ 7 988 152-65-67</span>
        <a href="#">Связаться!</a>
      </div>
      <h1 class="logo">JET CAR</h1>
      <div class="company-info">
        <span>г. Сыктывкар, ул. Андерграунд</span>
        <span>График: с 10:00 до 20:00</span>
      </div>
    </header>

    <!-- Навигация -->
    <nav class="navigation">
      <a href="#">Купить Авто</a>
      <a href="#">Каталог</a>
      <a href="#">Контакты</a>
      <a href="#">О нас</a>
    </nav>

    <!-- Главная карточка -->
    <section class="main-card">
      <div class="car-image"></div>
      <div class="car-info">
        <h2>Черноморский катамаран с забугорья IV Рестайлинг</h2>
        <h3>12 500 999 ₸</h3>
        <p><strong>Пробег:</strong> 1137 км</p>
        <hr class="divider">
        <p><strong>Мощность:</strong> 525 л.с.</p>
        <hr class="divider">
        <p>Прекрасный семейный катамаран для обыденных поездок за картошкой в деревню...</p>
      </div>
    </section>

    <!-- Кнопки брендов -->
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

    <!-- Мелкие карточки машин -->
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

    <!-- Ещё два ряда мелких карточек -->
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

    <!-- Блок с картой и изображением -->
    <section class="map-and-info">
      <div class="map-container"></div>
      <div class="promo-text">
        <!--<img src="car-image.png" alt="Car Promo">-->
        <p>Уфф было это что за чёртолет такой... <br>
          Тебя давно не было в уличных гонках! Садись за руль и приезжай к нам в Чайна таун...</p>
      </div>
    </section>

    <!-- Футер -->
    <footer class="footer">
      <p>© 2004-2024 Все права были защищены JetCar. <br> не лом немного похуй AbdulDian Inc.</p>
    </footer>
  </div>
</template>

<script>
export default {
  name: 'App',
};
</script>

<style scoped>
/* Общие стили */
.main-container {
  background-color: black;
  color: white;
  font-family: 'Roboto', sans-serif;
  padding: 20px;
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 2px solid #E5B748;
  padding-bottom: 8px;
}

.contact-info, .company-info {
  font-size: 12px;
}

.logo {
  font-family: 'Oswald', sans-serif;
  font-size: 32px;
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

/* Главная карточка */
.main-card {
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 20px 0;
}

.car-image {
  width: 460px;
  height: 300px;
  background-color: white;
  border-radius: 8px;
  margin-right: 20px;
}

.car-info {
  max-width: 400px;
}

.car-info h2 {
  font-family: 'Oswald', sans-serif;
  font-size: 24px;
}

.car-info h3 {
  font-size: 28px;
  color: #E5B748;
}

.divider {
  border: 0;
  height: 1px;
  background-color: grey;
  margin: 10px 0;
}

/* Кнопки брендов */
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

/* Мелкие карточки машин */
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

/* Блок карты и текста */
.map-and-info {
  display: flex;
  justify-content: space-between;
  margin-top: 30px;
}

.map-container {
  width: 60%;
  height: 300px;
  background-color: grey; /* Под карту */
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

/* Футер */
.footer {
  margin-top: 20px;
  text-align: center;
  font-size: 12px;
  color: grey;
}
</style>
