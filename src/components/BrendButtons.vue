<template>
  <!-- Brends Btns -->
  <hr class="divider">
  <section class="brand-buttons">
    <router-link to="/catalog">
    <button>
      <img :src="CarBravado" alt="Mercedes Logo" />
      <span>Bravado</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="CarBenefactor" alt="Mercedes Logo" />
      <span>Benefactor</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="CarGrotti" alt="Mercedes Logo" />
      <span>Grotti</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="CarCommet" alt="Mercedes Logo" />
      <span>Commet</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="CarObey" alt="Mercedes Logo" />
      <span>Obey</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="CarRevolter" alt="Mercedes Logo" />
      <span>Revolter</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="CarVapid" alt="Mercedes Logo" />
      <span>Vapid</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="CarPeggasi" alt="Mercedes Logo" />
      <span>Pegasso</span>
    </button>
  </router-link>
  </section>
  <hr class="divider">
</template>

<script>
import carLogo from '@/assets/mercedes_logo.png';
import CarBravado from '@/assets/car_logos/Banshee_Bravadoo.webp';
import CarBenefactor from '@/assets/car_logos/Benefactor.webp'
import CarGrotti from '@/assets/car_logos/Grotti.webp'
import CarCommet from '@/assets/car_logos/Pfister_Comet.webp'
import CarObey from '@/assets/car_logos/Obey.webp'
import CarRevolter from '@/assets/car_logos/Revolter.webp'
import CarVapid from '@/assets/car_logos/Vapid.webp'
import CarPeggasi from '@/assets/car_logos/Pegassi.webp'

export default {
  name: 'BrendButs',
  data() {
    return {
      carLogo,
      CarBravado,
      CarBenefactor,
      CarGrotti,
      CarCommet,
      CarObey,
      CarRevolter,
      CarVapid,
      CarPeggasi,
    };
  }
};
</script>

<style scoped>
.brand-buttons {
  display: grid;
  grid-template-columns: repeat(4, 1fr); 
  gap: 20px; 
  justify-items: center;
  align-items: center; 
}

.brand-buttons a {
  text-decoration: none;
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

@media (max-width: 1100px) {
  .brand-buttons{
    grid-template-columns: repeat(2, 1fr);
  }
  
}

/* Adaptive 768px */
@media (max-width: 768px) {
  .brand-buttons button {
    width: 180px;
    height: 70px;
  }

  .brand-buttons img {
    width: 35px;
  }

  .brand-buttons span {
    font-size: 13px;
  }
}

/* Adaptive 480px */
@media (max-width: 480px) {
  .brand-buttons {
    grid-template-columns: 1fr; 
  }

  .brand-buttons button {
    width: 200px; 
    max-width: none;
    height: 60px; 
    margin: 0; 
  }

  .brand-buttons img {
    width: 30px; 
  }

  .brand-buttons span {
    font-size: 12px; 
  }
}

</style>
