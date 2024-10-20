<template>
    <!-- Header -->
    <header class="header">
      <div class="contact-info">
        <span><div class="number"> 7 988 152-65-67</div></span>
        <span><div class="contact-text">Связаться!</div></span>
      </div>
      <h1 class="logo">JET CAR</h1>
      <div class="company-info">
        <span><div class="adress"> Сыктывкар, ул. Андерграунд </div></span>
        <span>График: с 10:00 до 20:00</span>
      </div>
    </header>
</template>
<script>
export default{
    name: 'CarHeader'
}
</script>
<style>
.header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    border-bottom: 2px solid #e5b748;
    padding-bottom: 8px;
  }
  .logo {
    font-family: 'Oswald', sans-serif;
    font-size: 38px;
    color: #e5b748;
  }
  .contact-text {
  font-size: 15px;
  color: #e5b748;
  padding-top: 5px;
}
.adress {
    font-weight: 500;
    padding-right: 25px;
    padding-bottom: 5px;
  }
  </style>
