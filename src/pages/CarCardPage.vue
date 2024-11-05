<template>
  <div class="CarCardMainContainer">
    <CarHeader></CarHeader>
    <NavigButton></NavigButton>
    <router-view></router-view>

    <!-- Передача пропсов компоненту Card -->
    <Card v-if="carData" :car="carData" />

    <CarsSmall></CarsSmall>
    <CarFooter></CarFooter>
  </div>
</template>

<script>
import CarHeader from '@/components/CarHeader.vue';
import CarFooter from '@/components/CarFooter.vue';
import NavigButton from '@/components/NavigateButtons.vue';
import CarsSmall from '@/components/SmallCards.vue';
import Card from '@/components/Card.vue';

export default {
  name: 'CarCardPage',
  components: {
    CarHeader,
    CarFooter,
    NavigButton,
    CarsSmall,
    Card,
  },
  data() {
    return {
      carData: null,
    };
  },
  mounted() {
    this.loadCarData();
  },
  watch: {
    // Наблюдаем за изменением query параметров в маршруте
    '$route.query.car': 'loadCarData',
  },
  methods: {
    loadCarData() {
      const carQuery = this.$route.query.car;
      if (carQuery) {
        try {
          this.carData = JSON.parse(carQuery); // Парсим строку JSON
        } catch (error) {
          console.error('Ошибка при разборе данных о машине:', error);
        }
      }
    },
  },
};
</script>

<style scoped>
.CarCardMainContainer {
  background-color: black;
  color: white;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
  padding: 20px;
}
</style>
