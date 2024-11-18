<template>
    <div class="form-image">
        <div class="main">
        <div class="info-words">
            <div class="main-word">
                Контакты:
            </div>
            <div class="enter-info">
                Запиши Номер!
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
                    main@gmail.com*
                </div>
                <div id="model-basic2" class="enter-email-area">
                    <input v-model="email" placeholder="Введите вашу почту" />
                    <p>{{ message }}</p>
                </div>
                <div class="email">
                    Телефон*
                </div>
                <div id="model-basic3" class="enter-number-area">
                    <input v-model="number" placeholder="Введите ваш номер телефона" />
                    <p>{{ message }}</p>
                </div>
            </div>
           
            <div class="contact-button">
                    <nav class="button-inside">
                        <router-link to="/contacts">Отправить Заявку!</router-link>
                    </nav>
                </div>
        </div>
        <div class="avto-image">
            <img :src="CarImage" alt="Main Car" />
        </div>
    </div>
        <div class="text-marketing">
            Лучшие цены во всём Лос-Сантос!
        </div>
    </div>
</template>

<script>
import CarImage from '@/assets/matiz-img-0.png';

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
    height: 60px;
    width: 300px;
    background-color: #E5B748;
    margin-top: 20px;
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

.name {
    font-family: 'Roboto' , sans-serif;
    color:#8D8D8D;
    margin-top: 50px;
    margin-bottom: 10px;
}

.email {
    font-family: 'Roboto' , sans-serif;
    color:#8D8D8D;
    margin-bottom: 10px;
}

.number {
    font-family: 'Roboto' , sans-serif;
    color:#8D8D8D;
    margin-bottom: 10px;
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
    margin-bottom: 10px;
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
    margin-bottom: 30px;
    font-weight: 700;
    font-family: 'Oswald',sans-serif;
}

.info-words {
    margin-left: 120px;
    font-family: Oswald,sans-serif;
    font-weight: 700;
    width: 600px;
}   

.main-word {
    margin-top: 46px;
    color: #E5B748;
    font-size: 48px;
    font-family: 'Oswald',sans-serif;
}

.avto-image img {
  margin-top: 100px;
  width: 100%;
  height: auto;
  max-width: 500px;
}

.form-image {
    border-bottom: 1px solid #8D8D8D;
}

@media (max-width: 768px) {
    .main {
        flex-direction: column;
        align-items: center;
        align-content: center;
    }

    .contact-button {
        height: 50px;
    }

    .button-inside {
        font-size: 16px;
    }

    .text-marketing {
        font-size: 24px;
        margin-top: 40px;
    }

    .main-word {
        font-size: 32px;
    }

    .info-words {
        width: 100%;
        padding: 0 15px;
    }

    input {
        width: 90%;
        max-width: 300px;
    }
}

/* Adaptive styles 480px */
@media (max-width: 480px) {
    .contact-button {
        margin-left: 13px;
        width: 300px;
        height: 45px;
    }

    .text-marketing {
        font-size: 20px;
        margin-top: 30px;
    }

    .main-word {
        font-size: 28px;
    }

    .info-words {
        margin: 0;
        text-align: center;
    }

    .enter-info {
        font-size: 18px;
    }

    input {
        width: 100%;
        max-width: 280px;
    }

    .avto-image img {
        max-width: 250px;
        margin: 20px auto;
    }
}
</style>