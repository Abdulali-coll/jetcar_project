<template>
    <div class="catalog-container">
      <CarHeader />
      <NavigateButtons />
      <FilterCatalog @filter="handleFilters" />
      <CatalogOfCars :cars="cars" />
      <CarFooter />
    </div>
  </template>
  
  <script>
  import CarFooter from '@/components/CarFooter.vue';
  import CarHeader from '@/components/CarHeader.vue';
  import CatalogOfCars from '@/components/CatalogOfCars.vue';
  import FilterCatalog from '@/components/FilterCatalog.vue';
  import NavigateButtons from '@/components/NavigateButtons.vue';
  import axios from 'axios';
  
  export default {
    name: 'CatalogPage',
    components: {
      CarHeader,
      CarFooter,
      CatalogOfCars,
      NavigateButtons,
      FilterCatalog,
    },
    data() {
      return {
        cars: [],
      };
    },
    mounted() {
      this.fetchCars();
    },
    methods: {
      async fetchCars(query = '') {
        try {
          const res = await axios.get(`/api/cars${query ? `?${query}` : ''}`);
          this.cars = Array.isArray(res.data) ? res.data : [res.data];
        } catch (err) {
          console.error('Ошибка при получении машин:', err);
        }
      },
      async handleFilters(filters) {
        const query = new URLSearchParams(filters).toString();
        await this.fetchCars(query);
      },
    },
  };
</script>

<style>
.catalog-container {
  background-color: black;
  color: white;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
  padding: 20px;
}
</style>
