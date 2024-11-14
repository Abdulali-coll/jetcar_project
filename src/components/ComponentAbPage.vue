<template>
  <!-- Main Card -->
  <div class="head-words">
            Мы худшие в своём деле!
        </div>
  <section class="main-card">
    <div class="car-image">
      <img :src="mainCarImage" alt="Main Car" />
    </div>
    
    <div class="car-info">
      <div class="descript-text">
        Cемейный катамаран для обыденных поездок за картошкой в деревню.
        Изящные черты заставят вас сожалеть даже о самом небрежном столновении. Если вам 40+ лет и вы одинокий скуф - эта машина для вас!
      </div>
    </div>
    
  </section>
  <hr class="divider">
  <div class="text-marketing">
            Лучшие цены во всём Триштатье! Будь ты проклят Перри Утконос
        </div>
  <section class="main-card">
    <div class="car-info">
      <div class="descript-text">
        Cемейный катамаран для обыденных поездок за картошкой в деревню.
        Изящные черты заставят вас сожалеть даже о самом небрежном столновении. Если вам 40+ лет и вы одинокий скуф - эта машина для вас!
      </div>
    </div>
    <div class="car-image">
      <img :src="mainCarImage" alt="Main Car" />
    </div>
  </section>
  
  <div class="head-words">
            Видео Обзор
  </div>

  <div class="video-player">
    <video
      ref="video"
      :src="videoSrc"
      @timeupdate="updateProgress"
      @loadedmetadata="setDuration"
      @play="playing = true"
      @pause="playing = false"
      controls
    ></video>
  </div>

  <section class="main-card">
    <div class="car-info">
      <div class="descript-text">
        Cемейный катамаран для обыденных поездок за картошкой в деревню.
        Изящные черты заставят вас сожалеть даже о самом небрежном столновении. Если вам 40+ лет и вы одинокий скуф - эта машина для вас!
      </div>
    </div>
    <div class="contact-button">
                    <nav class="button-inside">
                        <router-link to="/contacts">БУ! ПОДОЙДИ НЕ БОЙСЯ! Я РОТ ТВОЙ ...</router-link>
                    </nav>
                </div>
  </section>
</template>

<script>
import mainCarImage from '@/assets/car_card_0.jpg';
 import BentlyVideo from '@/assets/Bently.mp4'
export default {
  name: 'MainComp',
  data() {
    return {
      mainCarImage,
      videoSrc: BentlyVideo,
      playing: false,
      currentTime: 0,
      duration: 0,
      progress: 0,
      volume: 1
    };
  }
}


</script>

<style scoped>
.video-player {
  margin-top: 90px;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
}
video{
  width: 1000px;
  height: 700px;
}

.controls {
  
  gap: 8px;
  margin-top: 8px;
}
button {
  padding: 4px 8px;
}

.number {
  font-size: 22px;
}

.descript-text {
  color: gray;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
  font-size: 20px;
}

.car-spec {
  display: flex;
  justify-content: space-between;
  margin-bottom: 10px;
  color: gray;
}

.spec-value {
  text-align: right;
  margin-right: 80px;
}

.contact-info,
.company-info {
  padding-left: 25px;
}

.main-card {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 40px;
}

.car-image {
  margin-right: 40px;
}

.car-image img {
  width: 500px;
  height: 350px;
  object-fit: cover;
  border-radius: 5px;
}

.car-info {
  max-width: 600px;
}

.car-info h2 {
  font-family: 'Oswald', sans-serif;
  font-size: 24px;
}

.car-info h3 {
  font-family: 'Oswald', sans-serif;
  font-weight: bold;
  font-size: 30px;
  color: #e5b748;
}

.divider {
  border: 0;
  height: 2px;
  background-color: grey;
  margin: 35px 0;
}

/* Adaptive styles 768px */
@media (max-width: 768px) {
  .video-player {
    padding: 0 10px; 
  }

  video {
    max-width: 90%; 
    height: auto;
  }

  .main-card {
    flex-direction: column;
    align-items: center;
    gap: 20px;
  }

  .car-image img {
    width: 100%;
    max-width: 400px;
    height: auto;
    border-radius: 10px;
  }

  .descript-text {
    font-size: 18px;
  }

  .contact-button {
    width: 100%;
    text-align: center;
  }

  .divider {
    margin: 30px 0;
  }
}

/* Adaptive styles 480px */
@media (max-width: 480px) {
  .video-player {
    padding: 0 5px;
  }

  video {
    max-width: 100%;
    height: auto;
  }

  .main-card {
    margin: 10px 0;
  }

  .head-words {
    font-size: 24px; 
    padding: 10px;
  }

  .car-image img {
    max-width: 100%;
    height: auto;
  }

  .descript-text {
    font-size: 16px;
  }

  .contact-button .button-inside {
    font-size: 16px;
  }

  .divider {
    margin: 20px 0;
  }
}
</style>
