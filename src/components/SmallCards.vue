<template>
  <section class="small-cards">
    <div v-for="(car, index) in cars" :key="index" class="car-card">
      <router-link :to="{ name: 'CarCardPage', query: { car: JSON.stringify(car) } }">
        <div class="car-image">
          <img :src="car.image" alt="Car Image" />
        </div>
        <h4>{{ car.name }}</h4>
        <p>{{ car.price }}</p>
      </router-link>
    </div>
  </section>
</template>

<script>
import benefactor from '@/assets/source-image/benefactor.png';
import bravadoClassic from '@/assets/source-image/bravadoClassic.png';
import brawadoBunshee from '@/assets/source-image/brawadoBunshee.png';
import buccaneer from '@/assets/source-image/buccaneer.png';
import comet from '@/assets/source-image/Comet.png';
import elegyRetroSport from '@/assets/source-image/elegyRetroSport.png';
import elegyRH8 from '@/assets/source-image/elegyRH8.png';
import obeyF8 from '@/assets/source-image/obeyF8.png';
import weevil from '@/assets/source-image/weevil.png';
import buccaneerCustom from '@/assets/source-image/BuccaneerCustom.png';
import cometRetro from '@/assets/source-image/cometRetro.png';
import factionCustom from '@/assets/source-image/BuccaneerCustom.png';
import GauntlelClassic from '@/assets/source-image/GauntletClassic.png';
import italiGTB from '@/assets/source-image/ItaliGTB.png';
import nero from '@/assets/source-image/Nero.png';
import neroCustom from '@/assets/source-image/NeroCustom.png';
import primo from '@/assets/source-image/Primo.png';
import sentimentalClassic from '@/assets/source-image/SentimentalClassic.png';
import specter from '@/assets/source-image/Specter-GTAO.png';
import yosemite from '@/assets/source-image/YosemiteRancher.png';
import yoga from '@/assets/source-image/YougaClassic-GTAO-front.png';

export default {
  name: "CarsSmall",
  data() {
    return {
      cars: [
        { 
          image: benefactor, 
          name: "Benefactor", 
          price: "7 500 999 ₸", 
          mileage: 1137, 
          power: 525, 
          engineType: "Атомный, Уран 238U", 
          year: 2018 
        },
        { 
          image: bravadoClassic, 
          name: "Bravado Classic", 
          price: "6 900 999 ₸", 
          mileage: 15000, 
          power: 350, 
          engineType: "V8, Бензин", 
          year: 2017 
        },
        { 
          image: brawadoBunshee, 
          name: "Brawado Bunshee", 
          price: "8 200 999 ₸", 
          mileage: 2000, 
          power: 600, 
          engineType: "V10, Бензин", 
          year: 2019 
        },
        { 
          image: buccaneer, 
          name: "Buccaneer", 
          price: "7 300 999 ₸", 
          mileage: 50000, 
          power: 450, 
          engineType: "V6, Бензин", 
          year: 2015 
        },
        { 
          image: comet, 
          name: "Comet", 
          price: "6 500 999 ₸", 
          mileage: 7500, 
          power: 380, 
          engineType: "V6, Бензин", 
          year: 2018 
        },
        { 
          image: elegyRetroSport, 
          name: "Elegy Retro Sport", 
          price: "8 000 999 ₸", 
          mileage: 10000, 
          power: 400, 
          engineType: "V6, Бензин", 
          year: 2016 
        },
        { 
          image: elegyRH8, 
          name: "Elegy RH8", 
          price: "7 800 999 ₸", 
          mileage: 8000, 
          power: 420, 
          engineType: "V6, Бензин", 
          year: 2020 
        },
        { 
          image: obeyF8, 
          name: "Obey F8", 
          price: "9 000 999 ₸", 
          mileage: 5000, 
          power: 540, 
          engineType: "V8, Бензин", 
          year: 2021 
        },
        { 
          image: weevil, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: buccaneerCustom, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },{ 
          image: cometRetro, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: factionCustom, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: GauntlelClassic, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: italiGTB, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: nero, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: neroCustom, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: primo, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: sentimentalClassic, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: specter, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: yosemite, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        },
        { 
          image: yoga, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          year: 2014 
        }
      ]
    };
  }
};
</script>

<style scoped>
.car-card a {
    text-decoration: none;
    color:white;
}

.small-cards {
  display: flex;
  justify-content: space-between;
  margin-top: 100px;
  gap: 10px;
  flex-wrap: wrap;
  text-decoration: none;
}

.car-card {
  width: 30%;
  text-align: left;
  text-decoration: none;
}

.car-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  border-radius: 0;
}

.car-card h4 {
  margin: 5px 0;
}

.car-card p {
  color: #e5b748;
  font-family: 'Oswald', sans-serif;
  font-weight: bold;
  font-size: 20px;
  margin-top: 5px;
}

/* Новый стиль для информации о машине */
.car-details {
  list-style: none;
  padding: 0;
  margin-top: 10px;
}

.car-details li {
  font-size: 16px;
  color: white;
  padding-bottom: 5px;
}
</style>
