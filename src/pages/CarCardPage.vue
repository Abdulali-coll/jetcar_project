<template>
  <div class="CarCardMainContainer">
    <CarHeader></CarHeader>
    <NavigButton></NavigButton>
    <router-view></router-view>

    <!-- Share components of Card -->
    <Card v-if="carData" :car="carData" />

    <CarsSmallSlider></CarsSmallSlider>
    <CarFooter></CarFooter>
  </div>
</template>

<script>
import CarHeader from '@/components/CarHeader.vue';
import CarFooter from '@/components/CarFooter.vue';
import NavigButton from '@/components/NavigateButtons.vue';
import CarsSmallSlider from '@/components/SmallCardsSlider.vue';
import Card from '@/components/Card.vue';

export default {
  name: 'CarCardPage',
  components: {
    CarHeader,
    CarFooter,
    NavigButton,
    CarsSmallSlider,
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
    // Check query
    '$route.query.car': 'loadCarData',
  },
  methods: {
    loadCarData() {
      const carQuery = this.$route.query.car;
      if (carQuery) {
        try {
          this.carData = JSON.parse(carQuery);
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
