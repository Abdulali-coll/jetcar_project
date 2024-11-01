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
                Нам есть чем гордится! Список постоянных клиентов: Абдурозик и Хасбик, Цой и Мистер Бист, Уинстон черчилль и Хайзенберг, Гамбол и Дарвин, а так же Крош из смешариков и лысый из Иванушки Интернешнл (Хз кто это)! Нам есть чем гордится! Список постоянных клиентов: Абдурозик и Хасбик, Цой и Мистер Бист, Уинстон черчилль и Хайзенберг, Гамбол и Дарвин, а так же Крош из смешариков и лысый из Иванушки Интернешнл (Хз кто это)!
            </div>
        </div>
        <div class="final-essay">
            Нам есть чем гордится! Список постоянных клиентов: Абдурозик и Хасбик, Цой и Мистер Бист, Уинстон черчилль и Хайзенберг, Гамбол и Дарвин, а так же Крош из смешариков и лысый из Иванушки Интернешнл (Хз кто это)!
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
    margin-left: 150px;
    display: flex;
    gap: 20px;
    margin-bottom: 30px;
    text-align: left;
}

.essay {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 416px;
    height: 397px;
    font-family: 'Roboto', sans-serif;
}

.final-essay {
    display: flex;
    text-align: center;
    font-family: 'Roboto', sans-serif;
}
</style>