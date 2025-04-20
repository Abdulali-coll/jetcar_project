<template>
  <div class="page-container">
    <div class="header-bar">
      <router-link to="/" class="back-button">Назад</router-link>
      <h1 class="title">- JET CAR -</h1>
    </div>

    <div class="main-wrapper">
      <div class="form-card">
        <h2 class="form-title">{{ isLogin ? 'Войти' : 'Регистрация' }}</h2>

        <div class="form-group">
          <label for="name">Имя*</label>
          <input id="name" v-model="name" type="text" placeholder="Введите ваше имя" />
        </div>

        <div class="form-group">
          <label for="password">Пароль</label>
          <input id="password" v-model="password" type="password" placeholder="Введите пароль" />
        </div>

        <div v-if="!isLogin" class="form-group">
          <label for="confirmPassword">Повторите пароль</label>
          <input id="confirmPassword" v-model="confirmPassword" type="password" placeholder="Повторите пароль" />
        </div>

        <div class="buttons-row">
          <button class="main-btn">
            {{ isLogin ? 'Войти' : 'Зарегистрироваться' }}
          </button>
          <button class="main-btn secondary" @click="toggleForm">
            {{ isLogin ? 'Регистрация' : 'Назад ко входу' }}
          </button>
        </div>
      </div>
    </div>
  </div>
</template>


<script>
export default {
  name: 'MainComp',
  data() {
    return {
      isLogin: true,
      name: '',
      password: '',
      confirmPassword: ''
    };
  },
  methods: {
    toggleForm() {
      this.isLogin = !this.isLogin;
      // Можно очистить поля при переключении, если нужно
      // this.name = '';
      // this.password = '';
      // this.confirmPassword = '';
    }
  }
}
</script>

<style scoped>

.page-container {
  background-color: black;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
}

.header-bar {
  position: relative;
  height: 80px;
}

.title {
  position: absolute;
  left: 50%;
  transform: translateX(-50%);
  font-family: 'Oswald', sans-serif;
  font-size: 55px;
  color: #e5b748;
  margin: 0;
}


.back-button {
  font-family: 'Oswald', sans-serif;
  font-size: 24px;
  margin-left: 20px;
  color: #ffffff;
  text-decoration: none;
  background: transparent;
  border: none;
  cursor: pointer;
  transition: color 0.3s;
}

.back-button:hover {
  color: #fff;
}

.main-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 800px;
  background-color: black;
}

.form-card {
  background-color: black;
  border-radius: 20px;
  padding: 40px;
  box-shadow: 0 15px 40px rgba(255, 255, 255, 0.5);
  min-height: 400px; 
  max-width: 500px;
  width: 100%;
  transition: all 0.3s ease;
}

.form-title {
  font-family: 'Oswald', sans-serif;
  font-size: 55px;
  color: #e5b748;
  text-decoration: none;

}

.form-subtitle {
  font-size: 18px;
  color: #888;
  margin-bottom: 30px;
  font-family: 'Roboto', sans-serif;
}

.form-group {
  margin-bottom: 25px;
}

label {
  display: block;
  font-weight: 500;
  font-size: 16px;
  color: #555;
  margin-bottom: 8px;
  font-family: 'Roboto', sans-serif;
}

input {
  width: 100%;
  padding: 10px 14px;
  border: 1px solid #ccc;
  border-radius: 8px;
  font-size: 16px;
  font-family: 'Roboto', sans-serif;
}

.buttons-row {
  display: flex;
  flex-direction: column;
  gap: 20px; 
  align-items: center; 
  margin-top: 60px;
}

.main-btn {
  flex: 1;
  background-color: #E5B748;
  color: white;
  border: none;
  padding: 14px;
  font-size: 18px;
  font-weight: bold;
  border-radius: 10px;
  cursor: pointer;
  text-align: center;
  width: 300px;
  font-family: 'Oswald', sans-serif;
  transition: background-color 0.3s;
  text-decoration: none;
}

.main-btn:hover {
  background-color: #d3a93c;
}

.secondary {
  background-color: #333;
}

.secondary:hover {
  background-color: #424242;
}
</style>
