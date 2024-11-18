<template>
  <!-- Main Card -->
  <section class="main-card">
    <div class="car-image">
      <img :src="mainCarImage" alt="Main Car" />
    </div>
    <div class="car-info">
      <h2> Pegassi Tempesta V12</h2>
      <h3>12 500 999 ₸</h3>
      <div class="car-spec">
        <div class="spec-name">Пробег:</div>
        <div class="spec-value">1137 км</div>
      </div>
      <hr class="divider">
      <div class="car-spec">
        <div class="spec-name">Мощность:</div>
        <div class="spec-value">525 л.с.</div>
      </div>
      <hr class="divider">
      <div class="descript-text">
        В какой-то момент, спрашивая: «Так как быстро это?» Это как спросить парня, который только что просунил кулаком через твои ребра: «Так насколько ты силен?» 
        Дело больше не в скорости. Дело тоже не в стиле, потому что одно прикосновение газа, и это немного больше, чем размыто. Вы просто знаете, что в глубине души есть зуд, который может поцарапать только этот автомобиль, и вам не хватает каких-либо личных качеств, которым вам придется сопротивляться.
      </div>
    </div>
  </section>
</template>

<script>
import mainCarImage from '@/assets/source-image/Tempesta.webp';
export default {
  name: 'MainComp',
  data() {
    return {
      mainCarImage,
    };
  }
}
</script>

<style scoped>
.number {
  font-size: 22px;
}

.descript-text {
  color: gray;
  font-family: 'Roboto', sans-serif;
  font-weight: 200;
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
  margin: 20px 0;
  margin-bottom: 150px;
}

.car-image {
  margin-right: 40px;
}

.car-image img {
  width: 560px;
  height: 320px;
  object-fit: cover;
  border-radius: 20px;
}

.car-info {
  max-width: 400px;
}

.car-info h2 {
  font-family: 'Oswald', sans-serif;
  font-size: 38px;
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
  .main-card {
    flex-direction: column;
    align-items: flex-start;
  }

  .car-image {
    margin-right: 0;
    margin-bottom: 20px;
  }

  .car-image img {
    width: 100%;
    height: auto;
    border-radius: 15px;
  }

  .car-info {
    max-width: 100%;
  }

  .car-info h2 {
    font-size: 20px;
  }

  .car-info h3 {
    font-size: 24px;
  }

  .spec-value {
    margin-right: 10px;
  }
}

/* Adaptive styles 480px */
@media (max-width: 480px) {
  .main-card {
    margin: 10px 0;
  }

  .car-info h2 {
    font-size: 18px;
  }

  .car-info h3 {
    font-size: 22px;
  }

  .car-spec {
    flex-direction: column;
    align-items: flex-start;
  }

  .spec-value {
    text-align: left;
    margin-right: 0;
  }

  .divider {
    margin: 20px 0;
  }

  .descript-text {
    font-size: 14px;
  }
}
</style>
