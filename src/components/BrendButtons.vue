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
      <img :src="carLogo" alt="Mercedes Logo" />
      <span>Ауби</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="carLogo" alt="Mercedes Logo" />
      <span>Какделак</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="carLogo" alt="Mercedes Logo" />
      <span>Чехословацкий Автопром</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="carLogo" alt="Mercedes Logo" />
      <span>Мохентохен Моторспорт</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="carLogo" alt="Mercedes Logo" />
      <span>Чингизхан Inc</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="carLogo" alt="Mercedes Logo" />
      <span>ГАЗ</span>
    </button>
  </router-link>
  <router-link to="/catalog">
    <button>
      <img :src="carLogo" alt="Mercedes Logo" />
      <span>МММ</span>
    </button>
  </router-link>
  </section>
  <hr class="divider">
</template>

<script>
import carLogo from '@/assets/mercedes_logo.png';
import CarBravado from '@/assets/car_logos/Banshee_Bravadoo.webp';
export default {
  name: 'BrendButs',
  data() {
    return {
      carLogo,
      CarBravado,
    };
  }
};
</script>

<style scoped>
.brand-buttons {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 20px;
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
  .brand-buttons {
    grid-template-columns: repeat(2, 1fr);
  }

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
    grid-template-columns: repeat(1, 1fr);
  }

  .brand-buttons button {
    width: 95%;
    height: 60px;
  }

  .brand-buttons img {
    width: 30px;
  }

  .brand-buttons span {
    font-size: 12px;
  }
}
</style>
