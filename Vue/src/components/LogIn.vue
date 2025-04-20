<template>
  <div class="page-container">
    <div class="header-bar">
      <router-link to="/" class="back-button">Назад</router-link>
      <h1 class="title">- JET CAR -</h1>
      
    </div>

    <div class="main-wrapper">
      <div class="form-card">
        <h2 class="form-title">Войти</h2>

        <div class="form-group">
          <label for="name">Имя*</label>
          <input id="name" v-model="name" type="text" placeholder="Введите ваше имя" />
        </div>
        <div class="form-group">
          <label for="phone">Пароль</label>
          <input id="phone" v-model="number" type="tel" placeholder="+7 999 123 45 67" />
        </div>

        <div class="buttons-row">
          <button class="main-btn">Войти</button>
          <router-link to="/contacts" class="main-btn secondary">Регистрация</router-link>
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
      name: '',
      email: '',
      number: ''
    };
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
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
}

.title {
  font-family: 'Oswald', sans-serif;
  font-size: 55px;
  color: #e5b748;
  text-align: center;
  flex: 1;
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
  height: 600px;
  max-width: 500px;
  width: 100%;
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
