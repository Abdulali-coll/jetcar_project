<template>
    <!-- Small Cards -->
    <section class="small-cards">
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
      </section>
  
      <section class="small-cards">
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
      </section>
  
      <section class="small-cards">
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
        <div class="car-card">
          <div class="car-image">
            <img :src="bmwImage" alt="Car Image" />
          </div>
          <h4>Гоночная Спортивная Коляска (F77)</h4>
          <p>7 500 999 ₸</p>
        </div>
      </section>
</template>
<script>

import bmwImage from '@/assets/bmw-image_0.jpg';

export default{
    name: 'CarsSmall',
    data() {
      return {
        bmwImage,
        }
    }
}
</script>

<style scoped>
  .small-cards {
    display: flex;
    justify-content: space-between;
    margin-top: 20px;
    gap: 10px;
  }
  
  .car-card {
    width: 30%;
    text-align: left; 
  }
  
  .car-card .car-image {
    width: 350px;
    height: 200px;
  }
  
  .car-card img {
    width: 100%;
    height: 200px;
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
  </style>
