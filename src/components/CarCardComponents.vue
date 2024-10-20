<template><!--Components for buy page -->
    <section class="Buy-car">
      <div class="content-wrapper">
        <div class="car-image-wrapper">
          <!-- Big image -->
          <div class="car-image">
            <img :src="mainCarImage" alt="Main Car" />
          </div>
  
          <!--Small images -->
          <div class="mini-images">
            <img :src="miniCarImage" alt="Mini Car 1" />
            <img :src="miniCarImage" alt="Mini Car 2" />
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
            <h4>Это транспортное средство представялет из себя своего рода инфернальное деятище лучших инженеров. Пока ты растворялся в катарсисе, они трудились с преобладающим инфернальным поведением, чтобы ты потом говорил всякие скобрёзности в их адрес. И как тебе не стыдно ...</h4>
          </div>
        </div>
      </div>
  
      <!-- Button -->
      <div class="big-button">
        <nav class="buy-button">
          <router-link to="/contacts">КУПИТЬ ЭТУ КОЛЯСКУ!</router-link>
        </nav>
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
      };
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
  }
  
  /* Small images */
  .mini-images {
    display: flex;
    justify-content: space-between;
    gap: 10px;
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
    font-family: 'Roboto', sans-serif;
    font-size: 16px;
    color: #8d8d8d;
    margin-top: 20px;
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
  
