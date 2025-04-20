<template>
  <section class="small-cards">
    <div v-for="(car, index) in cars" :key="car.id || index" class="car-card">
      <router-link
        :to="{ name: 'CarCardPage', query: { car: JSON.stringify(car) } }"
        @click.native="scrollToHeader"
      >
        <div class="car-image">
          <img
            v-if="car.image"
            :src="getImageUrl(car.image)"
            :alt="car.name"
          />
          <div v-else class="no-image">Нет фото</div>
        </div>
      </router-link>
      <h4>{{ car.name }}</h4>
      <p>{{ car.price }}</p>
    </div>
  </section>
</template>

<script>
import axios from 'axios'

export default {
  name: "CarsSmall",
  data() {
    return {
      cars: [],
      baseUrl: import.meta.env.VITE_API_BASE_URL || '', // Подгружается из .env
    }
  },
  created() {
    this.fetchCars()
  },
  methods: {
    scrollToHeader() {
      window.scrollTo({ top: 0, behavior: "smooth" })
    },
    fetchCars() {
      axios.get(`${this.baseUrl}/api/cars`)
        .then(({ data }) => {
          this.cars = Array.isArray(data) ? data : [data]
        })
        .catch(err => {
          console.error('Ошибка при получении машин:', err)
        })
    },
    getImageUrl(path) {
      if (!path) return ''
      return path.startsWith('/')
        ? this.baseUrl + path
        : this.baseUrl + '/' + path
    }
  }
}
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
  
  .car-image {
  width: 100%; 
  height: 200px;
  overflow: hidden; 
}
  .car-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  border-radius: 10px;
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
  /*Adaptive styles 768px*/
  @media (max-width: 768px) {
    .car-card {
      width: 45%;
    }
  
    .car-card p {
      font-size: 18px;
    }

    .car-image {
    height: 180px;
  }

  }
  /*Adaptive styles 480px*/
  @media (max-width: 480px) {
  .small-cards {
    justify-content: center;
    gap: 10px;
  }

  .car-card {
    width: 100%; 
    margin-bottom: 15px;
  }

  .car-image {
    height: 150px; 
  }

  .car-card h4 {
    font-size: 16px;
  }

  .car-card p {
    font-size: 16px;
  }
}
  </style>

  
