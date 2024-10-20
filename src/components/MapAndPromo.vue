<template>
    <!-- Map and Promo Image -->
    <section class="map-and-info">
    <div class="map-container"></div>
    <div class="promo-container">
    <div class="car-promo">
      <img :src="PromoCar" alt="Promo car" />
    </div>
    <div class="promo-text">
      <p>Уфф было это что за чёртолет такой... <br>
        Тебя давно не было в уличных гонках! Садись за руль и приезжай к нам в Чайна таун...</p>
    </div>
    </div>
  </section>
</template>
<script>
import PromoCar from '@/car-image.jpg';
export default {
    name: 'MapPromo',
    data() {
      return {
        PromoCar,
      };
    },
}
</script>
<style>
.map-and-info {
    display: flex;
    justify-content: space-between;
    margin-top: 30px;
  }
  /*A temporary map image has been added */
  .map-container {
    width: 40%; 
    height: 300px; 
    background-image: url('@/assets/map.png');
    background-size: cover;
    background-position: center;
    border-radius: 15px;
  }
  /*added new promo contanier and car promo image, edit text
  position  */
  .promo-container{
    background-position: center;
  }
  
  .car-promo img{
    width: 337px;
    height: 195px;
  }
  .promo-text {
    width: 90%;
    text-align: left;
  }
  
  .promo-text p {
    font-family: 'Oswald', sans-serif;
    font-size: 16px;
    color: white;
  }
</style>
