<template>
  <!-- Header -->
  <header class="header">
    <div class="contact-info">
      <div class="number">7 988 152-65-67</div>
      <router-link to="/contacts"><div class="contact-text">Связаться!</div></router-link>
    </div>
    <!-- Added link in logo to main page--> 
    <router-link to="/">
      <h1 class="logo">JET CAR</h1>
    </router-link>
    <div class="company-info">
      <div class="address">Сыктывкар, ул. Андерграунд</div>
      <div class="schedule">График: с 10:00 до 20:00</div>
    </div>
  </header>
</template>

<script>
import phone from '@/assets/icon-phone.png';
export default {
  name: 'CarHeader',
  data() {
    return {
      phone,
    };
  }
}
</script>

<style>
.header {
  width: 100%;
  height: auto;
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 2px solid #e5b748;
  padding: 8px 20px;
  flex-wrap: wrap;
}

.logo {
  font-family: 'Oswald', sans-serif;
  font-size: 38px;
  color: #e5b748;
  text-decoration: none;
}

/* Mini style fixes */
.header a {
  text-decoration: none;
}

.header a:hover {
  text-decoration: none;
}

.contact-text {
  font-family: 'Roboto', sans-serif;
  color: #e5b748;
  font-weight: 500;
  font-size: 15px;
  padding-top: 5px;
}

.contact-info a {
  color: #e5b748;
}

.contact-info a:hover {
  color: #fff;
}

.number {
  color: white;
  margin-bottom: 5px;
  font-family: 'Roboto', sans-serif;
  font-weight: 500;
}

.address {
  font-family: 'Roboto', sans-serif;
  color: white;
  font-weight: 500;
  margin-bottom: 5px;
}

.schedule {
  font-size: 15px;
  font-family: 'Roboto', sans-serif;
  color: gray;
  font-weight: 400;
}

/* Adaptive styles */
@media (max-width: 600px) {
  .header {
    flex-direction: column;
    align-items: center;
    text-align: center;
    padding: 10px 15px;
  }

  .logo {
    font-size: 28px;
    margin-bottom: 8px;
  }

  .contact-info, .company-info {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-bottom: 10px;
  }

  .number, .contact-text, .address, .schedule {
    font-size: 13px;
  }
  
  .contact-text {
    font-size: 13px;
  }

  .schedule {
    font-size: 12px;
    color: lightgray;
  }
}
</style>
