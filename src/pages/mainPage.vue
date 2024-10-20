<template><!-- Main Page -->
    <<div class="main-container">
    <CarHeader></CarHeader>
    <NavigButton></NavigButton>
    <MainComp></MainComp>
    <BrendButs></BrendButs>
    <CarsSmall></CarsSmall>
    <MapPromo></MapPromo>
    <CarFooter></CarFooter>
    </div>>
  </template>
  
  <script>
  
  import CarHeader from '@/components/Header.vue';
  import CarFooter from '@/components/Footer.vue';
  import NavigButton from '@/components/NavigateButtons.vue';
  import MainComp from '@/components/MainComponent.vue';
  import BrendButs from '@/components/BrendButtons.vue';
  import CarsSmall from '@/components/SmallCards.vue';
  import MapPromo from '@/components/MapAndPromo.vue';

  export default {
    name: 'MainPage',
    components:{
        CarHeader,
        CarFooter,
        NavigButton,
        MainComp,
        BrendButs,
        CarsSmall,
        MapPromo
    },
  };
  </script>
  
  <style scoped>
  .main-container {
    background-color: black;
    color: white;
    font-family: 'Roboto', sans-serif;
    font-weight: 200;
    padding: 20px;
  }
  </style>
