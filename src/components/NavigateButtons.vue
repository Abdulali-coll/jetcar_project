<template>
  <!-- Navigation Btns -->
  <nav class="navigation">
    <router-link to="/">Главная</router-link>
    <router-link to="/card">Купить Авто</router-link>
    <router-link to="/catalog">Каталог</router-link>
    <router-link to="/contacts">Контакты</router-link>
    <router-link to="/about">О нас</router-link>
  </nav>
</template>

<script>
export default {
  name: 'NavigButton'
}
</script>

<style scoped>
/* Main styles */
.navigation {
  background-color: #242424;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 45px;
  margin: 10px 0;
  gap: 100px;
  padding: 0 20px;
}

.navigation a {
  color: #8d8d8d;
  font-weight: 300;
  padding: 8px 12px;
  text-transform: uppercase;
  text-decoration: none;
  font-size: 18px;
  white-space: nowrap;
  border: 1px solid transparent;
  transition: background-color 0.3s, color 0.3s;
}

.navigation a:hover {
  border-color: #e5b748;
  color: #fff;
}

.navigation a.router-link-exact-active {
  color: #fff;
}

/* Adaptive styles 768px */
@media (max-width: 768px) {
  .navigation {
    gap: 9px;
  }
  
  .navigation a {
    font-size: 13px;
    padding: 5px 8px;
  }
}

/* Adaptive styles 480px */
@media (max-width: 480px) {
  .navigation {
    gap: 5px;
    padding: 0 10px;
  }
  
  .navigation a {
    font-size: 10px;
    padding: 4px 6px;
  }
}
</style>
