<template>
    <div class="form-image">
        <div class="main">
        <div class="info-words">
            <div class="main-word">
                Контакты:
            </div>
            <div class="enter-info">
                Запиши свой номер зайка!
            </div>
            <div class="info-area">
                <div class="name">
                    Имя*
                </div>
                <div id="model-basic1" class="enter-name-area">
                    <input v-model="name" placeholder="Введите ваше имя" />
                    <p>{{ message }}</p>
                </div>
                <div class="email">
                    Email*
                </div>
                <div id="model-basic2" class="enter-email-area">
                    <input v-model="email" placeholder="Введите вашу почту" />
                    <p>{{ message }}</p>
                </div>
                <div class="number">
                    Телефон*
                </div>
                <div id="model-basic3" class="enter-number-area">
                    <input v-model="number" placeholder="Введите ваш номер телефона" />
                    <p>{{ message }}</p>
                </div>
            </div>
            <div class="confirm">
                <div class="area-confirm">
                    <input type="checkbox" id="confirm-checkbox" v-model="consentGiven" />
                    <label for="confirm-checkbox" class="text-confirm">
                        Даю согласие на обработку личных данных
                    </label>
                </div>
            </div>
            <div class="contact-button">
                    <nav class="button-inside">
                        <router-link to="/contacts">ПОЗВОНИТЬ БОГДАН ДЖАНУ!</router-link>
                    </nav>
                </div>
        </div>
        <div class="avto-image">
            <img :src="CarImage" alt="Main Car" />
        </div>
    </div>
        <div class="text-marketing">
            Лучшие цены во всём Триштатье! Будь ты проклят Перри Утконос
        </div>
    </div>
</template>

<script>
import CarImage from '@/car-image.jpg';

export default {
    name: 'FormContacts',
    data() {
        return {
            CarImage,
            message: '',
            name: '',
            email: '',
            number: '',
            consentGiven: false 
        };
    }
};
</script>


<style>
.main {
    display: flex;
}
.contact-button {
    display: flex;
    justify-content: center;
    align-items: center;
    border-radius: 25px;
    height: 75px;
    width: 400px;
    background-color: #E5B748;
    margin-top: 30px;
}

.button-inside {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 100%;
    font-weight: bold;
    font-size: 18px;
    color: white; 
    text-decoration: none; 
    font-family: 'Oswald',sans-serif;
}

.button-inside a {
    color: inherit; 
    text-decoration: none; 
}


.area-confirm {
    display: flex;
    margin-top: 30px;
}

#confirm-checkbox {
    margin-right: 20px;
}

.text-confirm {
    color: #8D8D8D;
    font-size: 16px;
    margin-left: -280px;
    font-family: 'Roboto' , sans-serif;
}

.name {
    font-family: 'Roboto' , sans-serif;
    color:#8D8D8D;
    margin-top: 47px;
}

.email {
    font-family: 'Roboto' , sans-serif;
    color:#8D8D8D;
}

.number {
    font-family: 'Roboto' , sans-serif;
    color:#8D8D8D;
}

input {
    height: 40px;
    width: 300px;   
    padding: 8px; 
    font-size: 16px;
}

.enter-name-area input,
.enter-email-area input,
.enter-number-area input {
    height: 40px;
    padding: 8px;
    font-size: 16px;
}

.enter-info {
    font-size: 25px;
    font-family: 'Oswald',sans-serif;
}


.text-marketing {
    bottom: 10px;
    text-align: center; 
    font-weight: bold;
    font-size: 36px;
    margin-top: 73px;
    font-weight: 700;
    font-family: 'Oswald',sans-serif;
}

.info-words {
    margin-left: 41px;
    font-family: Oswald,sans-serif;
    font-weight: 700;
    gap: 4px
}   

.main-word {
    margin-top: 46px;
    align-items: center;
    width: 355px;
    height: 59px;
    color: #E5B748;
    font-size: 48px;
    font-family: 'Oswald',sans-serif;
}

.avto-image img {
  margin-top: 100px;
  width: 100%;
  height: auto;
  max-width: 400px;
  margin-left: 150px;
}

.form-image {
    border-bottom: 1px solid #8D8D8D;
}
</style>