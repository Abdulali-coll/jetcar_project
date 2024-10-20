<template><!-- Brends Btns -->
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
</template>

<script>
import carLogo from '@/assets/mercedes_logo.png';
export default{
    name: 'BrendButs',
    data() {
      return {
        carLogo,
        }
    }
}
</script>
<style scoped>
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
</style>
