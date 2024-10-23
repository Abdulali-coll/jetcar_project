<template>
    <div class="form-image">
        <div class="info-words">
        <div class="main-word">
            Контакты:
        </div>
        <div class="enter-info">
            Запиши свой номер зайка!
        </div>
    </div>
    <div class="avto-image">
        <img :src="CarImage" alt="Main Car" />
    </div>
        <div class="info-area">
            <div class="name">
                Имя
            </div>
            <div class="enter-name-area">
                Email
            </div>
            <div class="email area">

            </div>
            <div class="enter-email-area">

            </div>
            <div class="number">
                Телефон
            </div>
            <div class="enter-number-area">

            </div>
        </div>
        <div class="confirm">
            <div class="area-confirm">

            </div>
            <div class="text-confirm">

            </div>
        </div>
        <div class="contact-button">
      <nav class="button-inside">
        <router-link to="/contacts">ПОЗВОНИТЬ БОГДАН ДЖАНУ!</router-link>
      </nav>
    </div>
    <div class="text-marketing">

    </div>
</div>
</template>

<script>
import CarImage from "@/assets/car-image.png";

export default {

name: 'FormContacts',
};
</script>

<style>
.info-words {
    margin-left: 41px;
    font-family: Oswald;
    font-weight: 700;
    gap: 4px
}
.main-word {
    align-items: center;
    width: 355px;
    height: 59px;
    color: #E5B748;
    font-size: 48px;
}

.avto-image img {
  width: 100%;
  height: auto;
  max-width: 400px;
}


</style>