<template>
  <!-- Footer -->
  <footer class="footer">
    <div class="footer-info">
      <p>Москва, улица Подвойского, 5/19</p>
      <p>+7 (988) 152-65-67 | График: 10:00 - 20:00</p>
    </div>

    <div class="footer-links">
      
    </div>

    <div class="social-icons">
     <!-- <a href="#"><img src="@/assets/telegram.svg" alt="Telegram"></a>-->
    </div>

    <p class="copyright">© 2004-2025 Все права защищены. Abdul & Bogdan Inc.</p>
  </footer>
</template>

<script>
export default {
  name: 'CarFooter'
}
</script>

<style scoped>
.footer {
  margin-top: 20px;
  text-align: center;
  font-size: 14px;
  color: grey;
  border-top: 1px solid #ccc;
  padding: 20px 10px;
  background-color: black; 
}

.footer-info {
  font-size: 16px;
  color: white;
  margin-bottom: 15px;
}

.footer-links {
  display: flex;
  justify-content: center;
  margin-top: 35px;
  gap: 75px;
  margin-bottom: 15px;
}

.column {
  display: flex;
  flex-direction: column;
  gap: 1px;
}

.column p {
  color: white;
  cursor: pointer;
  transition: 0.3s;
}

.column p:hover {
  color: #e5b748; 
}

.social-icons {
  display: flex;
  justify-content: center;
  gap: 15px;
  margin-bottom: 15px;
}

.social-icons img {
  width: 30px;
  height: 30px;
  transition: 0.3s;
}

.social-icons img:hover {
  transform: scale(1.1);
}

.copyright {
  font-size: 12px;
  color: grey;
  margin-top: 10px;
}
</style>
