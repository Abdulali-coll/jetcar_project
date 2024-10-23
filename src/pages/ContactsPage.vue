<template>
    <div class="main-contacts">
    <CarHeader></CarHeader>
    <NavigateButtons></NavigateButtons>
    <ContactsForm></ContactsForm>
    <CarFooter></CarFooter>
</div>
</template>

<script>
import CarFooter from '@/components/CarFooter.vue';
import CarHeader from '@/components/CarHeader.vue';
import ContactsForm from '@/components/ContactsForm.vue';
import NavigateButtons from '@/components/NavigateButtons.vue';

export default {

name: 'ContactsPage',
components:{
    CarHeader,
    CarFooter,
    NavigateButtons,
    ContactsForm,
},
};

</script>

<style>
.main-contacts {
  background-color: black;
  color: white;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
  padding: 20px;
}
</style>