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
import PromoCar from '@/car-image.jpg';

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
}

.map-container {
  margin-top: 15px;
  flex: 1 1 50%;
  min-width: 300px;
  height: 400px;
}
.map-container {
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

@media (max-width: 768px) {
  .map-promo {
    flex-direction: column;
  }

  .map-container {
    width: 100%;
    height: 300px;
  }

  .car-promo img {
    max-width: 100%;
    height: auto;
  }

  .promo-text p {
    font-size: 14px;
  }
}

@media (max-width: 480px) {
  .map-container {
    width: 100%;
    height: 250px;
  }

  .promo-text p {
    font-size: 12px;
  }
}
</style>
