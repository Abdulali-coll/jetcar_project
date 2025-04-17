<template>
    <div class="not-found-container">
      <h1>404</h1>
      <p>Упс! Страница не найдена.</p>
      <router-link to="/">Вернуться на главную</router-link>
    </div>
  </template>
  
  <script>
  export default {
    name: 'NotFoundPage',
  };
  </script>
  
  <style scoped>
  .not-found-container {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 100vh;
    text-align: center;
    background-color: black;
    color: white;
  }
  
  .not-found-container h1 {
    font-size: 6rem;
    margin: 0;
    color: #E5B748;
  }
  
  .not-found-container p {
    font-size: 1.5rem;
    margin: 1rem 0;
  }
  
  .not-found-container a {
    margin-top: 1rem;
    color: #007bff;
    text-decoration: none;
  }
  
  .not-found-container a:hover {
    text-decoration: underline;
  }
  </style>
  