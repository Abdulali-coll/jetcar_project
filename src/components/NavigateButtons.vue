<template><!-- Navigation Btns -->
<nav class="navigation">
    <router-link to="/card">Купить Авто</router-link>
    <router-link to="/catalog">Каталог</router-link>
    <router-link to="/contacts">Контакты</router-link>
    <router-link to="/about">О нас</router-link>
  </nav>
</template>
<script>
export default{
    name: 'NavigButton'
}
</script>
<style scoped>
.navigation {
    background-color: #242424;
    display: flex;
    justify-content: center;
    height: 45px;
    align-items: center;
    margin: 10px 0;
    gap: 150px;
  }
  
  .navigation a {
    color: #8d8d8d;
    font-weight: 300;
    margin: 0 15px;
    text-transform: uppercase;
    text-decoration: none;
    font-size: 20px;
  }
  .navigation a.router-link-exact-active {
  color: #fff;
}
</style>
