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
          description: "По бокам есть две небольшие пластиковые панели на передних крыльях с серебряной надписью Supercharged, а также плоские юбки с ребристыми деталями над ними. В теплице есть пластиковая отделка вокруг окон и два зеркала заднего вида, размещенных в оболочках, верхняя половина окрашена, а нижняя половина отделана пластиком.", 
          year: 2018 
        },
        { 
          image: bravadoClassic, 
          name: "Bravado Classic", 
          price: "6 900 999 ₸", 
          mileage: 15000, 
          power: 350, 
          engineType: "V8, Бензин", 
          description: "Боковые стороны обозначают изогнутый профиль автомобиля, слегка расклешенные арки и изогнутые двери. Черные юбки видны внизу, а также изогнутые выхлопные трубы возле задних колес. Зеркала заднего вида прикреплены к краям капота, а лобовое стекло окружено черной рамой.",
          year: 2017 
        },
        { 
          image: brawadoBunshee, 
          name: "Brawado Bunshee", 
          price: "8 200 999 ₸", 
          mileage: 2000, 
          power: 600, 
          engineType: "V10, Бензин", 
          description: "Задняя часть автомобиля очень стильная, с небольшим удлинителем, иммулирующим спойлер Ducktail, черной полосой в центре и двумя задними фонарями, которые следуют форме задней части. Видн большой бампер с диффузором из углеродного волокна.",
          year: 2019 
        },
        { 
          image: buccaneer, 
          name: "Buccaneer", 
          price: "7 300 999 ₸", 
          mileage: 50000, 
          power: 450, 
          engineType: "V6, Бензин", 
          description: "Banshee может появиться с одним цветом или, как модель GTA III, двухцветным цветом, где вторичный наносится в виде полосы. Он оснащен 10-спицевыми сплит-колесами, обернутыми низкопрофильными шинами",
          year: 2015 
        },
        { 
          image: comet, 
          name: "Comet", 
          price: "6 500 999 ₸", 
          mileage: 7500, 
          power: 380, 
          engineType: "V6, Бензин",
          description: "Banshee в GTA IV очень быстрый, благодаря своему 300ci (4,9L), с двойным турбонаддувом V8, соединяему с 5-ступенчатой коробкой передач с конфигурацией FR. Ускорение и верхняя скорость аналогичны у большинства экзотических спортивных автомобилей в игре", 
          year: 2018 
        },
        { 
          image: elegyRetroSport, 
          name: "Elegy Retro Sport", 
          price: "8 000 999 ₸", 
          mileage: 10000, 
          power: 400, 
          engineType: "V6, Бензин", 
          description: "Автомобиль имеет четкую управляемость за счет устойчивости. Мощный двигатель, соединенный с приводом заднего колеса, приводит к тому, что задние колеса легко теряют сцепление. К счастью, распределение мощности плавное, что облегчает управление",
          year: 2016 
        },
        { 
          image: elegyRH8, 
          name: "Elegy RH8", 
          price: "7 800 999 ₸", 
          mileage: 8000, 
          power: 420, 
          engineType: "V6, Бензин", 
          description: "Основной корпус автомобиля имеет высокую преобладаность изгибов. На передних квартальных панелях преобладает наличие большого воздухозаборника с хромированной полосой вблизи его верхнего края. А-стойки автомобиля покрыты черным полимером.",
          year: 2020 
        },
        { 
          image: obeyF8, 
          name: "Obey F8", 
          price: "9 000 999 ₸", 
          mileage: 5000, 
          power: 540, 
          engineType: "V8, Бензин", 
          description: "Задняя часть гладкая и острая в местах. В верхней части задней панели автомобиля, на поворотах, находятся блоки заднего фонаря, которые вырезаны почти как полукруг. В вырезе вырезаны две круглые лампы.",
          year: 2021 
        },
        { 
          image: weevil, 
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин",
          description: " Формирование разделено на два уровня, верхний уровень имеет круглые выхлопные наконечники, по одной стороне номерного знака. На нижнем уровне есть большой семилопастный, шестиэлементный диффузор из углеродного волокна.", 
          year: 2014 
        },
        { 
          image: buccaneerCustom, 
          name: "Buccaneer", 
          price: "3 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: " Его управление очень хорошо сбалансировано между подвероуленным и овертером, что облегчает его в управлении и трудно выкручивать. Understeer более выражен на более высоких скоростях, но с ним легко управлять.",
          year: 2014 
        },{ 
          image: cometRetro, 
          name: "Comet Retro", 
          price: "1 500 999 ₸", 
          mileage: 30000, 
          power: 350, 
          engineType: "I4, Бензин", 
          description: "Этот автомобиль оснащен передним модельным двухкулачковым двигателем inline-4 с цилиндрическим воздушным фильтром, установленным на впускном коллекторе. Несмотря на то, что он смоделирован как inline-4, он больше похож на высокооборотный V12 с высокой оборотами",
          year: 2004 
        },
        { 
          image: factionCustom, 
          name: "Faction Custom", 
          price: "9 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Двухдверный седан, созданный для величайшего поколения и жаждутого их уставшими детьми. Дешево сделать, и один из самых продаваемых новых автомобилей в американской истории - это то, чем когда-то были классические американские автомобили",
          year: 2017 
        },
        { 
          image: GauntlelClassic, 
          name: "Gauntlel", 
          price: "7 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Автомобиль принимает дизайн мускул-кара с постоянной твердой крышей и стилем «газер». Передняя часть имеет традиционный бампер с хромированной отделкой и номерным знаком в центре, в то время как в верхней части преобладают двойные впускные отверстия,",
          year: 2001 
        },
        { 
          image: italiGTB, 
          name: "Itali GTB", 
          price: "1 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Задняя часть автомобиля отличается панелью, которая является частью боковых, также имеет хромированную отделку в центре. Края автомобиля имеют пять вертикальных задних фонарей с хромированной отделкой вокруг каждого блока, в то время как в центре есть широкая хромированная секция с эмблемой производителя. ",
          year: 2014 
        },
        { 
          image: nero, 
          name: "Nero", 
          price: "13 500 999 ₸", 
          mileage: 39000, 
          power: 750, 
          engineType: "I4, Бензин", 
          description: "В верхней части есть небольшая решетка радиатора с значком Annis, централизованным на автомобиле, и L-образными корпусами фар, каждый из которых содержит круглые лампы с квадратными указателями поворот",
          year: 2017 
        },
        { 
          image: neroCustom, 
          name: "Nero Custom", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Боковые стороны автомобиля имеют вставные панели вокруг дверей, с наклонными секциями на передних крыльях и ведущих к вентиляционным отверстиям заднего крыла, направляя поток воздуха к задним тормозам. ",
          year: 2014 
        },
        { 
          image: primo, 
          name: "Primo", 
          price: "150 999 ₸", 
          mileage: 30000, 
          power: 90, 
          engineType: "I4, Бензин", 
          description: "Рожденный во время пожара горы Фудзи и испытанный на какой-то немецкой дорожке, вы, наконец, можете законно владеть этим легендарным суперкаром, не опасаясь, что ваша дверь будет пинаться FIB, потому что они скорее раздавят импортные автомобили, чем поймают террористов",
          year: 2001 
        },
        { 
          image: sentimentalClassic, 
          name: "Sentimental Classic", 
          price: "16 500 999 ₸", 
          mileage: 30000, 
          power: 650, 
          engineType: "I4, Бензин", 
          description: "Автомобиль относительно хорошо разгоняется от остановки и достигает хорошей максимальной скорости. Он также имеет очень мало вращения колеса благодаря системе полного привода. Автомобиль имеет хорошее распределение веса, а также имеет хороший баланс при поворотах, включая высокоскоростной поворот. Поворотная хода большую часть времени кажется отзывчивой, с хорошей стабильностью, предоставляемой водителю, даже на высоких скоростях, дождем или снегом.",
          year: 2025 
        },
        { 
          image: specter, 
          name: "Specter", 
          price: "8 500 999 ₸", 
          mileage: 30000, 
          power: 190, 
          engineType: "I4, Бензин", 
          description: "Распределение цветов такое же, как и в GTA IV, но третичный цвет отсутствует, его заменяют ржавые хромированные детали на оконной отделке, бамперах и деталях. Колеса сохраняют тот же дизайн колес, явясь меньшим производным от дисков Big Worm lowrider",
          year: 2019 
        },
        { 
          image: yosemite, 
          name: "Yosemite", 
          price: "2 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Voodoo виден как в монотонных, так и в двухцветных цветах кузова, с основным на капоте, колоннах, крыше и багажнике, а вторичным на нижних частях автомобиля. Дополнительный третический цвет наносится на детали автомобиля, в том числе бамперы, решетка радиатора, зеркала, ручки, отделка и колесные диски.",
          year: 2010 
        },
        { 
          image: yoga, 
          name: "Yoga", 
          price: "2 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Voodoo оснащен V8 среднего смещения в компоновке FR, соединенном с 5-ступенчатой автоматической коробкой передач. В отличие от своего предыдущего внешнего вида, автомобиль очень тяжелый, что дает ему очень низкий центр тяжести, но ценой вялой скорости ускорения.",
          year: 2012 
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
