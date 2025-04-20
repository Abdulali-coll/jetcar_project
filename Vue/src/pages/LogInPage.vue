<template>
    <div class="main-about">
    <LogIn></LogIn>
    <CarFooter></CarFooter>
    </div>
</template>

<script>
import CarFooter from '@/components/CarFooter.vue';
import LogIn from '@/components/LogIn.vue';

export default {

name: 'AboutUsPage',
components:{
    CarFooter,
    LogIn
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
