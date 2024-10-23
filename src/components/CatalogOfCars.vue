<template>
  <!-- Small Cards -->
  <section class="small-cards">
    <div v-for="(car, index) in cars" :key="index" class="car-card">
      <router-link to="/card">
      <div class="car-image">
        <img :src="car.image" alt="Car Image" />
      </div>
    </router-link>
      <h4>{{ car.name }}</h4>
      <p>{{ car.price }}</p>
    </div>
  </section>
</template>

<script>
import benefactor from '@/assets/source-image/benefactor.png';
import bravadoClassic from '@/assets/source-image/bravadoClassic.png';
import brawadoBunshee from '@/assets/source-image/brawadoBunshee.png';
import buccaneer from '@/assets/source-image/buccaneer.png';
import comet from '@/assets/source-image/Comet.png';
import elegyRetroSport from '@/assets/source-image/elegyRetroSport.png';
import elegyRH8 from '@/assets/source-image/elegyRH8.png';
import obeyF8 from '@/assets/source-image/obeyF8.png';
import weevil from '@/assets/source-image/weevil.png';

export default {
  name: "CarsSmall",
  data() {
    return {
      cars: [
        { image: benefactor, name: "Benefactor", price: "7 500 999 ₸" },
        { image: bravadoClassic, name: "Bravado Classic", price: "6 900 999 ₸" },
        { image: brawadoBunshee, name: "Brawado Bunshee", price: "8 200 999 ₸" },
        { image: buccaneer, name: "Buccaneer", price: "7 300 999 ₸" },
        { image: comet, name: "Comet", price: "6 500 999 ₸" },
        { image: elegyRetroSport, name: "Elegy Retro Sport", price: "8 000 999 ₸" },
        { image: elegyRH8, name: "Elegy RH8", price: "7 800 999 ₸" },
        { image: obeyF8, name: "Obey F8", price: "9 000 999 ₸" },
        { image: weevil, name: "Weevil", price: "5 500 999 ₸" }
      ]
    };
  }
};

</script>
  
<style scoped>

  .small-cards {
    display: flex;
    justify-content: space-between;
    margin-top: 100px;
    gap: 10px;
    flex-wrap: wrap;
  }
  
  .small-cards li :last-child{
    border-bottom: 1px solid #ccc;
  }

  .car-card {
    width: 30%;
    text-align: left;
  }
  
  .car-card .car-image {
    width: 100%; 
    height: 200px;
  }
  
  .car-image img {
    width: 100%;
    height: 100%;
  }
  .car-card img {
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
  /*Adaptive styles*/
  @media (max-width: 768px) {
    .car-card {
      width: 45%;
    }
  
    .car-card p {
      font-size: 18px;
    }
  }

  @media (max-width: 480px) {
    .small-cards {
      justify-content: space-between;
      gap: 10px;
    }
  
    .car-card {
      width: 48%;
    }
  
    .car-card .car-image {
      width: 100%;
      height: 100%;
    }
  
    .car-card h4 {
      font-size: 16px;
    }
  
    .car-card p {
      font-size: 16px;
    }
  }
  </style>

  
