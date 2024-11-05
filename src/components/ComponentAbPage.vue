<template>
  <!-- Main Card -->
  <div class="head-words">
            Мы худшие в своём деле!
        </div>
  <section class="main-card">
    <div class="car-image">
      <img :src="mainCarImage" alt="Main Car" />
    </div>
    
    <div class="car-info">
      <div class="descript-text">
        Cемейный катамаран для обыденных поездок за картошкой в деревню.
        Изящные черты заставят вас сожалеть даже о самом небрежном столновении. Если вам 40+ лет и вы одинокий скуф - эта машина для вас!
      </div>
    </div>
    
  </section>
  <hr class="divider">
  <div class="text-marketing">
            Лучшие цены во всём Триштатье! Будь ты проклят Перри Утконос
        </div>
  <section class="main-card">
    <div class="car-info">
      <div class="descript-text">
        Cемейный катамаран для обыденных поездок за картошкой в деревню.
        Изящные черты заставят вас сожалеть даже о самом небрежном столновении. Если вам 40+ лет и вы одинокий скуф - эта машина для вас!
      </div>
    </div>
    <div class="car-image">
      <img :src="mainCarImage" alt="Main Car" />
    </div>
  </section>
  
  <div class="head-words">
            Видео Обзор
  </div>


  <section class="main-card">
    <div class="car-info">
      <div class="descript-text">
        Cемейный катамаран для обыденных поездок за картошкой в деревню.
        Изящные черты заставят вас сожалеть даже о самом небрежном столновении. Если вам 40+ лет и вы одинокий скуф - эта машина для вас!
      </div>
    </div>
    <div class="contact-button">
                    <nav class="button-inside">
                        <router-link to="/contacts">ПОДОЙДИ НЕ БОЙСЯ! Я РОТ ТВОЙ ...</router-link>
                    </nav>
                </div>
  </section>
</template>

<script>
import mainCarImage from '@/assets/car_card_0.jpg';
export default {
  name: 'MainComp',
  data() {
    return {
      mainCarImage,
    };
  }
}
</script>

<style scoped>
.number {
  font-size: 22px;
}

.descript-text {
  color: gray;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
  font-size: 20px;
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
  gap: 40px;
}

.car-image {
  margin-right: 40px;
}

.car-image img {
  width: 500px;
  height: 350px;
  object-fit: cover;
  border-radius: 5px;
}

.car-info {
  max-width: 600px;
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
