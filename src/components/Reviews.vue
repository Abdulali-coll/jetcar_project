<template>
    <div class="main-reviews">
        <div class="head-words">
            Отзывы наших клиентов
        </div>
        <div class="reviews-essay">
            <div class="image-reviews">
                <img :src="ReviewImage" alt="Main reviews" />
            </div>
            <div class="essay">
                Нам есть чем гордится! Список постоянных клиентов: Абдурозик и Хасбик, Цой и Мистер Бист, Уинстон черчилль и Хайзенберг, Гамбол и Дарвин, а так же Крош из смешариков и лысый из Иванушки Интернешнл (Хз кто это)!
            </div>
        </div>
        
    </div>
</template>

<script>
import ReviewImage from "@/assets/Reviews.png"

export default {
    name: 'Reviews',
    data() {
        return {
            ReviewImage
        };
    }
};
</script>

<style>
.head-words {
    font-family: 'Oswald',sans-serif;
    margin-top: 24px;
    width: 100%;
    height: 73px;
    display: flex;
    justify-content: center;
    font-weight: 700;
    align-items: center;
    text-align: center; 
    font-size: 48px; 
    font-weight: bold; 
    color: #E5B748; 
}

.reviews-essay {
    margin-top: 40px;
    margin-left: 150px;
    display: flex;
    gap: 50px;
    text-align: left;
}

.essay {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 600px;
    height: 200px;
    font-size: 24px; 
    font-family: 'Roboto', sans-serif;
}


@media (max-width: 1050px) {
    .reviews-essay {
        flex-direction: column;
        align-items: center;
        align-content: center;
        margin-left: 40px;
    }

    .essay {
        font-size: 20px;
        max-width: 100%;
    }
}

/* Adaptive styles  768px */
@media (max-width: 768px) {
    .head-words {
        font-size: 32px; 
    }

    .image-reviews {
        height: 100%;
        width: 100%;
    }
}

/* Adaptive styles 480px */
@media (max-width: 480px) {
    .head-words {
        font-size: 24px;
        padding: 10px;
    }

    .image-reviews img {
        max-width: 280px; 
    }

    .essay {
        font-size: 16px; 
    }
}
</style>