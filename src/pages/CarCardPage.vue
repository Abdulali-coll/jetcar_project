<template>
  <div class="CarCardMainContainer">
      <CarHeader></CarHeader>
      <NavigButton></NavigButton>
      <CardComp></CardComp>
      <CarsSmall></CarsSmall>
      <CarFooter></CarFooter>
  </div>
</template>

<script>
import CarHeader from '@/components/CarHeader.vue';
import CarFooter from '@/components/CarFooter.vue';
import NavigButton from '@/components/NavigateButtons.vue';
import CardComp from '@/components/CarCardComponents.vue';
import CarsSmall from '@/components/SmallCards.vue';

export default {
  name: 'CarCardpage',
  components:{
      CarHeader,
      CarFooter,
      NavigButton,
      CardComp,
      CarsSmall,
  },
};
</script>

<style>
.CarCardMainContainer {
  background-color: black;
  color: white;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
  padding: 20px;
}
</style>
