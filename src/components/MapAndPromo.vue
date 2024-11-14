<template>
  <section class="map-and-info">
    <div class="map-promo">
      <div id="map" class="map-container"></div>
      <div class="promo-container">
        <div class="car-promo">
          <img :src="PromoCar" alt="Promo car" />
        </div>
        <div class="promo-text">
          <p>Уфф, было это что за чёртолет такой... <br>
            Тебя давно не было в уличных гонках! Садись за руль и приезжай к нам в Чайна таун...</p>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
import PromoCar from '@/assets/priora_img-0.png';

export default {
  name: 'MapPromo',
  data() {
    return {
      PromoCar,
    };
  },
  mounted() {
    this.loadMap();
  },
  methods: {
    loadMap() {
      const script = document.createElement('script');
      script.src = "https://api-maps.yandex.ru/2.1/?apikey=78436aa4-9eaa-430e-84a3-60b947d3a445&lang=ru_RU";
      script.type = "text/javascript";
      script.onload = () => this.initMap();
      document.head.appendChild(script);
    },
    initMap() {
      ymaps.ready(() => {
        var myMap = new ymaps.Map("map", {
          center: [55.759681, 37.535023],
          zoom: 10
        });
        var myPlacemark = new ymaps.Placemark([55.759681, 37.535023], {
          hintContent: 'Богдан Джан IND!',
          balloonContent: 'Это JET CAR!'
        });
        myMap.geoObjects.add(myPlacemark);
      });
    }
  }
}
</script>

<style scoped>
.map-promo {
  border-top: 1px solid #ccc;
  width: 100%;
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
  gap: 20px;
  padding: 20px 0;
}

.map-container {
  margin-top: 15px;
  flex: 1 1 50%;
  min-width: 300px;
  height: 400px;
  border-radius: 15px;
}

.promo-container {
  flex: 1 1 40%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.car-promo img {
  width: 100%;
  height: auto;
  max-width: 400px;
  margin-bottom: 20px;
}

.promo-text {
  text-align: center;
}

.promo-text p {
  font-family: 'Oswald', sans-serif;
  font-size: 16px;
  color: white;
}

/* Adaptive styles for tablets and smaller screens */
@media (max-width: 768px) {
  .map-promo {
    flex-direction: column;
    align-items: center;
    padding: 15px;
  }

  .map-container {
    width: 100%;
    height: 300px;
  }

  .promo-container {
    width: 100%;
    padding: 0 20px;
  }

  .promo-text p {
    font-size: 14px;
  }
}

/* Adaptive styles for small mobile screens */
@media (max-width: 480px) {
  .map-container {
    width: 100%;
    height: 250px;
  }

  .car-promo img {
    max-width: 90%; 
  }

  .promo-text p {
    font-size: 12px;
  }
}
</style>
