<template>
  <header class="header">
    <div class="contact-info">
      <div class="number">+7 (988) 152-65-67</div>
      <router-link to="/contacts"><div class="contact-text">Связаться!</div></router-link>
    </div>

    <router-link to="/">
      <h1 class="logo">- JET CAR -</h1>
    </router-link>

    <div class="company-info">
      <div class="info-container">
        <div class="text-info">
          <div class="address">Москва, улица Подвойского, 5/19</div>
          <div class="schedule">График: с 10:00 до 20:00</div>
        </div>

        <!-- Кнопка выхода -->
        <button v-if="isLoggedIn" @click="showLogoutModal = true" class="logout-btn">
          Выйти
        </button>

        <!-- Иконка профиля -->
        <router-link v-else to="/login" class="profile-link">
          <img :src="profileIcon" alt="Profile" class="profile-icon">
        </router-link>
      </div>
    </div>

    <!-- Модалка подтверждения выхода -->
    <div v-if="showLogoutModal" class="modal-overlay">
      <div class="modal">
        <p>Вы уверены, что хотите выйти?</p>
        <div class="modal-buttons">
          <button @click="confirmLogout">Да</button>
          <button @click="showLogoutModal = false">Отмена</button>
        </div>
      </div>
    </div>
  </header>
</template>

<script>
import profileIcon from '@/assets/icon_profile_white.png';

export default {
  name: 'CarHeader',
  data() {
    return {
      profileIcon,
      isLoggedIn: false,
      showLogoutModal: false
    };
  },
  methods: {
    checkAuth() {
      this.isLoggedIn = !!localStorage.getItem('user');
    },
    confirmLogout() {
      localStorage.removeItem('user');
      this.checkAuth();
      this.showLogoutModal = false;
      this.$router.push('/login');
    }
  },
  created() {
    this.checkAuth();
  },
  watch: {
    $route() {
      this.checkAuth();
    }
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
  flex-wrap: wrap;
}

.contact-info{
  width: 30%;
  margin-left: 5%;
}
.contact-info a {
  color: #e5b748;
}

.contact-info a:hover {
  color: #fff;
}

.company-info{
  width: 30%;
}

.info-container {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  margin-right: 50px;
}

.text-info {
  text-align: right;
  margin-right: 20px; 
}

.profile-link {
  display: inline-block;
  cursor: pointer;
  transition: transform 0.2s;
}

.profile-link:hover {
  transform: scale(1.1);
}

.profile-icon {
  width: 50px;
  height: 50px;
}

.logo {
  font-family: 'Oswald', sans-serif;
  font-size: 55px;
  color: #e5b748;
  text-decoration: none;
}

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
  font-size: 24px;
  margin-left: 10px;
  padding-top: 5px;
}

.number {
  font-size: 22px;
  margin-left: 10px;
  font-family: 'Roboto', sans-serif;
  font-weight: 500;
}
.number a{
  color: white;
}

.address {
  font-family: 'Roboto', sans-serif;
  color: white;
  font-weight: 500;
  margin-bottom: 5px;
  font-size: 22px;
}

.schedule {
  font-size: 15px;
  font-family: 'Roboto', sans-serif;
  color: gray;
  font-weight: 400;
}

.logout-btn {
  background: transparent;
  border: none;
  color: white;
  font-size: 1rem;
  cursor: pointer;
  text-decoration: underline;
}

.modal-overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.6);
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 999;
}

.modal {
  background: white;
  padding: 20px 30px;
  border-radius: 10px;
  text-align: center;
}

.modal p{
  color: black;
  font-family: 'Roboto', sans-serif;
  font-weight: 500;
}

.modal-buttons {
  margin-top: 15px;
  display: flex;
  justify-content: space-around;
}

.modal-buttons button {
  padding: 8px 16px;
  font-size: 14px;
  cursor: pointer;
}

@media (max-width: 700px) {
  .header {
    flex-direction: column;
    align-items: center;
    text-align: center;
  }

  .logo {
    font-size: 28px;
    margin-bottom: 8px;
    width: 100%;
  }

  .contact-info, .company-info {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-bottom: 10px;
    width: 100%;
  }

  .info-container {
    justify-content: center;
    flex-direction: column;
  }

  .text-info {
    text-align: center;
    margin-right: 0;
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
    color: white;
  }

  .profile-icon {
    width: 30px;
    height: 30px;
    margin-top: 10px;
  }
}
</style>