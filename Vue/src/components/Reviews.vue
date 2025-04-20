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
                Мы будем благодарны за любые отзывы: положительные, если вы остались довольны, и конструктивные, если у вас есть предложения по улучшению.
                Мы обязательно изучим каждый отзыв и примем меры в соответствии с вашими комментариями. Спасибо за вашу поддержку и интерес к нашему автосалону! Мы ценим ваше мнение и будем рады видеть вас снова у нас.
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


@media (max-width: 1200px) {
    .reviews-essay {
        flex-direction: column;
        align-items: center;
        align-content: center;
        margin-left: 40px;
    }

    .essay {
        font-size: 16px;
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
}
</style>