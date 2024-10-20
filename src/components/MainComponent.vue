<template><!-- Main Card -->
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
</template>
<script>

import mainCarImage from '@/assets/car_card_0.jpg';
export default{
    name: 'MainComp',
    data(){
        return{
            mainCarImage,
        }
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
</style>
