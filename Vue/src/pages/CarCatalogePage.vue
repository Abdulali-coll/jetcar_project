<template>
    <div class="catalog-container">
    <CarHeader></CarHeader>
    <NavigateButtons></NavigateButtons>
    <FilterCatalog></FilterCatalog>
    <CatalogOfCars></CatalogOfCars>
    <CarFooter></CarFooter>
</div>
</template>

<script>

import CarFooter from '@/components/CarFooter.vue';
import CarHeader from '@/components/CarHeader.vue';
import CatalogOfCars from '@/components/CatalogOfCars.vue';
import FilterCatalog from '@/components/FilterCatalog.vue';
import NavigateButtons from '@/components/NavigateButtons.vue';

export default {

    name: 'CatalogPage',
    components:{
        CarHeader,
        CarFooter,
        CatalogOfCars,
        NavigateButtons,
        FilterCatalog,
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
