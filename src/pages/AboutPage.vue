<template>
    <div class="main-about">
    <CarHeader></CarHeader>
    <NavigateButtons></NavigateButtons>
    <CarFooter></CarFooter>
    </div>
</template>

<script>
import CarFooter from '@/components/CarFooter.vue';
import CarHeader from '@/components/CarHeader.vue';
import MainComp from '@/components/MainComponent.vue';
import NavigateButtons from '@/components/NavigateButtons.vue';

export default {

name: 'AboutUsPage',
components:{
    CarHeader,
    MainComp,
    CarFooter,
    NavigateButtons,
},
};
</script>

<style>
.main-about {
  background-color: black;
  color: white;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
  padding: 20px;
}
</style>
