<template>
  <section class="small-cards">
    <div v-for="(car, index) in cars" :key="index" class="car-card">
      <router-link :to="{ name: 'CarCardPage', query: { car: JSON.stringify(car) } }" @click.native="scrollToHeader">
        <div class="car-image">
          <img :src="car.image" alt="Car Image" />
        </div>
        <div class="mini-images">

          </div>
        <h4>{{ car.name }}</h4>
        <p>{{ car.price }}</p>
      </router-link>
    </div>
  </section>
</template>

<script>
import glendale from '@/assets/source-image/Glendale.webp';
import glendaleBack from '@/assets/source-image/GlendaleBack.webp';
import glendaleTop from '@/assets/source-image/GlendaleFront.webp';
import gauntletClassicCustom from '@/assets/source-image/GauntletClassicCustom.webp';
import gauntletClassicCustomBack from '@/assets/source-image/GauntletClassicCustomBack.webp';
import gauntletClassicCustomTop from '@/assets/source-image/GauntletClassicCustomTop.webp';
import banshee from '@/assets/source-image/Banshee.webp';
import bansheeBack from '@/assets/source-image/BansheeBack.webp';
import bansheeTop from '@/assets/source-image/BansheeTop.webp';
import buccaneer from '@/assets/source-image/buccaneer.webp';
import buccaneerBack from '@/assets/source-image/buccaneerBack.webp';
import buccaneerAny from '@/assets/source-image/buccaneerEngine.webp';
import comet from '@/assets/source-image/Comet.webp';
import cometBack from '@/assets/source-image/CometBack.webp';
import cometTop from '@/assets/source-image/CometTop.webp';
import elegyRetroSport from '@/assets/source-image/elegyRetroCustom.webp';
import elegyRetroSportBack from '@/assets/source-image/elegyRetroCustomBack.webp';
import elegyRetroSportAny from '@/assets/source-image/elegyRetroCustomEngine.webp';
import elegyRH8 from '@/assets/source-image/elegyRH8.webp';
import elegyRH8Back from '@/assets/source-image/elegyRH8Back.webp';
import elegyRH8Front from '@/assets/source-image/elegyRH8Front.webp';
import F10 from '@/assets/source-image/10F.webp';
import F10Back from '@/assets/source-image/10FBack.webp';
import F10Top from '@/assets/source-image/10FTop.webp';
import weevil from '@/assets/source-image/weevil.webp';
import weevilBack from '@/assets/source-image/weevil.webp';
import weevilTop from '@/assets/source-image/weevil.webp';
import buccaneerCustom from '@/assets/source-image/BuccaneerCustom.webp';
import buccaneerCustomBack from '@/assets/source-image/BuccaneerCustomBack.webp';
import buccaneerCustomEngine from '@/assets/source-image/BuccaneerCustomTop.webp';
import cometRetro from '@/assets/source-image/cometRetroCustom.webp';
import cometRetroBack from '@/assets/source-image/cometRetroCustomBack.webp';
import cometRetroTop from '@/assets/source-image/cometRetroCustomTop.webp';
import factionCustom from '@/assets/source-image/FactionCustomDonk.webp';
import factionCustomBack from '@/assets/source-image/FactionCustomDonkBack.webp';
import factionCustomTop from '@/assets/source-image/FactionCustomDonkTop.webp';
import GauntlelClassic from '@/assets/source-image/GauntletClassic.webp';
import GauntlelClassicBack from '@/assets/source-image/GauntletClassicBack.webp';
import GauntlelClassicTop from '@/assets/source-image/GauntletClassicTop.webp';
import italiGTO from '@/assets/source-image/ItaliGTO.webp';
import italiGTOBack from '@/assets/source-image/ItaliGTOBack.webp';
import italiGTOTop from '@/assets/source-image/ItaliGTOTop.webp';
import nero from '@/assets/source-image/Nero.webp';
import neroBack from '@/assets/source-image/NeroBack.webp';
import neroTop from '@/assets/source-image/NeroTop.webp';
import neroCustom from '@/assets/source-image/NeroCustom.webp';
import neroCustomBack from '@/assets/source-image/NeroCustomBack.webp';
import neroCustomTop from '@/assets/source-image/NeroCustomTop.webp';
import primo from '@/assets/source-image/Primo.webp';
import primoBack from '@/assets/source-image/PrimoBack.webp';
import primoTop from '@/assets/source-image/PrimoTop.webp';
import sentinelClassic from '@/assets/source-image/SentinelClassic.webp';
import sentinelClassicBack from '@/assets/source-image/SentinelClassicBack.webp';
import sentinelClassicTop from '@/assets/source-image/SentinelClassicTop.webp';
import specter from '@/assets/source-image/Specter.webp';
import specterBack from '@/assets/source-image/SpecterBack.webp';
import specterTop from '@/assets/source-image/SpecterTop.webp';
import yosemite from '@/assets/source-image/YosemiteRancher.webp';
import yosemiteBack from '@/assets/source-image/YosemiteRancherBack.webp';
import yosemiteTop from '@/assets/source-image/YosemiteRancherTop.webp';
import yoga from '@/assets/source-image/YougaClassic.webp';
import yogaBack from '@/assets/source-image/YougaClassicBack.webp';
import yogaTop from '@/assets/source-image/YougaClassicTop.webp';

export default {
  name: "CarsSmall",
  data() {
    return {
      cars: [
        { 
          image: glendale,
          imageAny: glendaleTop,
          imageBack: glendaleBack,
          name: "Glendale", 
          price: "7 500 999 ₸", 
          mileage: 1137, 
          power: 525, 
          engineType: "Атомный, Уран 238U",
          description: "Передняя часть автомобиля выполнена в классическом стиле и отличается хромированным бампером и решеткой радиатора, на последней нанесен значок производителя. По краям автомобиля расположены хромированные панели, на которых расположены две желтые фары и поворотники меньшего размера.", 
          year: 2018 
        },
        { 
          image: gauntletClassicCustom,
          imageAny: gauntletClassicCustomTop,
          imageBack: gauntletClassicCustomBack, 
          name: "Gauntlet Classic", 
          price: "6 900 999 ₸", 
          mileage: 15000, 
          power: 350, 
          engineType: "V8, Бензин", 
          description: "Gauntlet Classic Custom сильно напоминает Dodge Charger Daytona 1969 года выпуска, хотя плавная форма носовой части делает его похожим на Plymouth Superbird 1970 года выпуска. Таким образом, автомобиль вдохновлен недолговечным поколением NASCAR 'aero-warrior' начала 1970-х годов, когда производители Dodge и, впоследствии, его суббренд Plymouth экспериментировали с аэродинамически наклонными версиями своих моделей Charger и Road Runner соответственно.",
          year: 2017 
        },
        { 
          image: banshee,
          imageAny: bansheeTop,
          imageBack: bansheeBack, 
          name: "Banshee", 
          price: "8 200 999 ₸", 
          mileage: 2000, 
          power: 600, 
          engineType: "V10, Бензин", 
          description: "Bravado Banshee напоминает Dodge Viper SR второго поколения (хотя у Banshee двигатель V8 вместо V10), но имеет выхлопную трубу с боковыми патрубками и более короткую линию крыши, напоминающую Dodge Viper ZB третьего или четвертого поколения. Передняя панель напоминает модифицированную Mazda RX-7 третьего поколения с измененными фарами. Передний бампер, похоже, вдохновлен Honda S2000, а задние фонари напоминают Aston Martin DB9.",
          year: 2019 
        },
        { 
          image: buccaneer, 
          imageBack: buccaneerBack,
          imageAny: buccaneerAny,
          name: "Buccaneer", 
          price: "7 300 999 ₸", 
          mileage: 50000, 
          power: 450, 
          engineType: "V6, Бензин", 
          description: "Дизайн Buccaneer полностью изменился по сравнению с GTA IV, он имеет более старый внешний вид и приподнятую заднюю подвеску, что придает ему стиль драгстера. В передней части автомобиля преобладает разделенная по центру решетка радиатора с расположенными по краям круглыми фарами, окруженными хромированными деталями и размещенными в черных корпусах. Хромированный бампер занимает всю ширину автомобиля и повторяет изгиб внешних краев.",
          year: 2015 
        },
        { 
          image: comet, 
          imageBack: cometBack, 
          imageAny: cometTop,
          name: "Comet", 
          price: "6 500 999 ₸", 
          mileage: 7500, 
          power: 380, 
          engineType: "V6, Бензин",
          description: "Прохождение поворотов на высокой скорости приводит к существенной потере поворачиваемости Comet, но у автомобиля есть потенциальная избыточная поворачиваемость при отрыве от земли или на более низких скоростях. Comet также страдает из-за слабой конструкции подвески. Колеса могут врезаться в шасси после бокового удара о бордюр с меньшей силой, чем ожидалось, что делает Comet одним из самых хрупких спортивных автомобилей.", 
          year: 2018 
        },
        { 
          image: elegyRetroSport, 
          imageAny: elegyRetroSportAny,
          imageBack: elegyRetroSportBack,
          name: "Elegy Retro Sport", 
          price: "8 000 999 ₸", 
          mileage: 10000, 
          power: 400, 
          engineType: "V6, Бензин", 
          description: "Модель Elegy Retro Custom создана на основе нескольких поколений Nissan Skyline GT-R. На его боковой профиль, дизайн задней части и общий силуэт повлияло третье поколение Nissan Skyline GT-R (R32), в то время как передняя часть выполнена по образцу четвертого поколения Nissan Skyline GT-R (R33). Фары, по-видимому, представляют собой комбинацию R33 и R32 (N1).",
          year: 2016 
        },
        { 
          image: elegyRH8, 
          imageAny: elegyRH8Front,
          imageBack: elegyRH8Back,
          name: "Elegy RH8", 
          price: "7 800 999 ₸", 
          mileage: 8000, 
          power: 420, 
          engineType: "V6, Бензин", 
          description: "Автомобиль относительно хорошо разгоняется с места и развивает хорошую максимальную скорость. Благодаря системе полного привода колеса практически не пробуксовывают. Автомобиль обладает хорошей развесовкой, а также хорошим балансом при прохождении поворотов, в том числе на высокой скорости. Большую часть времени машина легко проходит повороты, обеспечивая водителю хорошую устойчивость даже на высоких скоростях, в дождь или снег.",
          year: 2020 
        },
        { 
          image: F10,
          imageAny: F10Top,
          imageBack: F10Back,  
          name: "10F", 
          price: "9 000 999 ₸", 
          mileage: 5000, 
          power: 540, 
          engineType: "V8, Бензин", 
          description: "10F имеет изящный аэродинамический кузов, похожий на свою старую версию, но с модернизированными элементами, такими как светодиодная подсветка и угловатые, подчеркнутые акценты и дополнительные панели. Передняя часть состоит из изящного капота со значком Obey, крупной решетки радиатора, светодиодных фар и вентиляционных отверстий. Боковой профиль имеет пластиковые боковые юбки и воздухозаборники, ведущие к задним колесам и моторному отсеку.",
          year: 2021 
        },
        { 
          image: weevil, 
          imageAny: weevilTop,
          imageBack: weevilBack,
          name: "Weevil", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин",
          description: "Weevil в значительной степени создан на основе Volkswagen Type 1 'Beetle', сочетая в себе элементы, использовавшиеся на протяжении всего периода производства Beetle, с минимальными отклонениями от оригинального дизайна и унаследовав влияние оригинального инжектора. Передняя панель автомобиля основана на моделях Beetle, выпущенных до 1954 года, в то время как вентилируемый капот и интерьер основаны на моделях 1950-60-х годов[1]. Его фары и заднее раздельное стекло, похоже, позаимствованы у DKW F9/IFA F9, расположение и форма указателей поворота - у Subaru 360, а задние фонари, возможно, были позаимствованы у Tatra 87.", 
          year: 2014 
        },
        { 
          image: buccaneerCustom, 
          imageAny: buccaneerCustomEngine,
          imageBack: buccaneerCustomBack,
          name: "Buccaneer Custom", 
          price: "3 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Buccaneer Custom - это вариант Buccaneer для лоурайдеров, в который по умолчанию вносятся лишь незначительные изменения. Автомобиль сохранил оригинальный дизайн стандартной модели, сохранив переднюю и заднюю панели. Однако автомобиль претерпел лишь незначительные изменения, в частности, хромированные детали, присутствующие вокруг автомобиля, были заменены на цветную отделку.",
          year: 2014 
        },{ 
          image: cometRetro, 
          imageAny: cometRetroTop,
          imageBack: cometRetroBack,
          name: "Comet Retro", 
          price: "1 500 999 ₸", 
          mileage: 30000, 
          power: 350, 
          engineType: "I4, Бензин", 
          description: "Ретро-кастом Comet во многом основан на Porsche 964, оснащенном широкофюзеляжным комплектом RAUH-Welt Begriff (RWB). Некоторые элементы, такие как фары и боковые борты, позаимствованы у Porsche 993. Передний бампер, похоже, позаимствован непосредственно у Porsche 930 серии Yoshida Special. Спойлер в виде 'утиного хвоста', возможно, создан на основе Porsche Carrera RSR 1973 года выпуска, хотя и в уменьшенном виде. Задние фонари также могут быть созданы на основе более поздних модификаций Porsche 928.",
          year: 2004 
        },
        { 
          image: factionCustom, 
          imageAny: factionCustomTop,
          imageBack: factionCustomBack,
          name: "Faction Custom", 
          price: "9 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "faction custom - это вариант фракции для хай-райдеров, который имеет гораздо большую высоту подъема, чем у стандартной faction (или ее пользовательского варианта). Основной корпус сохранил свой оригинальный дизайн стандартной модели и нестандартного варианта, хотя были внесены незначительные изменения в текстуру и маркировку, в частности, на передней решетке радиатора больше нет значка 'Turbo', а по бокам также отсутствуют некоторые косметические детали.",
          year: 2017 
        },
        { 
          image: GauntlelClassic, 
          imageAny: GauntlelClassicTop,
          imageBack: GauntlelClassicBack,
          name: "Gauntlet", 
          price: "7 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Gauntlet Classic создан на базе Dodge Challenger первого поколения, с горизонтально разделенной решеткой радиатора, позаимствованной у Dodge Charger 1970 года выпуска, а боковой профиль позаимствован у Plymouth Barracuda 1970-1972 годов выпуска. Квадратные задние фонари, похоже, навеяны теми, что были на Ford Torino 1970-1971 годов выпуска.",
          year: 2001 
        },
        { 
          image: italiGTO, 
          imageAny: italiGTOTop,
          imageBack: italiGTOBack,
          name: "Itali GTO", 
          price: "1 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Передняя часть автомобиля отличается сплиттером из углеродного волокна, двумя большими воздухозаборниками в центре и двумя меньшими по краям, а также значком с названием компании в левом нижнем углу. Передние фары автомобиля состоят из двух круглых ламп и расширяющихся кверху светодиодных световых полос, на пластиковых корпусах которых расположены элементы, напоминающие указатели поворота. На капоте имеются два воздухозаборника, а на передней части - значок производителя.",
          year: 2014 
        },
        { 
          image: nero, 
          imageAny: neroTop,
          imageBack: neroBack,
          name: "Nero", 
          price: "13 500 999 ₸", 
          mileage: 39000, 
          power: 750, 
          engineType: "I4, Бензин", 
          description: "Nero, являющийся модернизированной версией Adder, в чем-то схож с вышеупомянутым автомобилем, имеет схожий объемный профиль и характерные черты. Передняя часть имеет ту же решетку радиатора и расположение воздухозаборников, что и Adder, но над воздухозаборниками видны двойные перегородки. Расположение и форма корпусов фар аналогичны расположению и форме фар Adder, но в них используется набор квадратных ламп с небольшими световыми полосками внизу.",
          year: 2017 
        },
        { 
          image: neroCustom,
          imageAny: neroCustomTop,
          imageBack: neroCustomBack, 
          name: "Nero Custom", 
          price: "5 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Передняя часть оснащена разделителем из углепластика по всей ширине автомобиля, который поддерживается двумя небольшими стойками, а также небольшими выступами по внешним краям и оранжевым гоночным буксирным крюком под решеткой радиатора. В области капота были внесены значительные изменения: появились защитные планки, более крупная панель из углеродного волокна и решетчатые воздухозаборники на крыльях. Детали, связанные с болтами и заклепками, также можно увидеть на ветровом стекле.",
          year: 2014 
        },
        { 
          image: primo, 
          imageAny: primoTop,
          imageBack: primoBack,
          name: "Primo", 
          price: "150 999 ₸", 
          mileage: 30000, 
          power: 90, 
          engineType: "I4, Бензин", 
          description: "Primo - один из лучших седанов, доступных в игре, хотя его дизайн менее примечателен и, следовательно, в дорожном движении он выглядит более обыденно. У него квадратные фары, небольшая решетка радиатора, бамперы среднего размера и черные внутренние стойки. Primo будут выпускаться в одноцветном исполнении.",
          year: 2001 
        },
        { 
          image: sentinelClassic, 
          imageAny: sentinelClassicTop,
          imageBack: sentinelClassicBack,
          name: "Sentinel Classic", 
          price: "16 500 999 ₸", 
          mileage: 30000, 
          power: 650, 
          engineType: "I4, Бензин", 
          description: "Как и в обычной версии, основной цвет автомобиля нанесен на кузов, в то время как второстепенный цвет нанесен на решетку радиатора, выступы на бампере и по бокам, разделительные полосы на небольших отверстиях крыльев и часть моторного отсека. Также доступен цвет отделки приборной панели, дверей и сидений, а также цвет циферблата. Автомобиль также получил специальные 10-спицевые колесные диски с заклепками на внешней кромке и низкопрофильными шинами.",
          year: 2025 
        },
        { 
          image: specter, 
          imageAny: specterTop,
          imageBack: specterBack,
          name: "Specter", 
          price: "8 500 999 ₸", 
          mileage: 30000, 
          power: 190, 
          engineType: "I4, Бензин", 
          description: "Модель Spectre в основном основана на Aston Martin DB10, что заметно по общей форме, площади теплицы и форме задней части. Передний бампер, похоже, создан по образцу Porsche 918, а вентиляционные отверстия капота, похоже, позаимствованы у Mercedes-McLaren SLR. Форма задних фонарей, по-видимому, представляет собой комбинацию огней Aston Martin One-77 и вышеупомянутого Aston Martin DB10.",
          year: 2019 
        },
        { 
          image: yosemite, 
          imageAny: yosemiteTop,
          imageBack: yosemiteBack,
          name: "Yosemite", 
          price: "2 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Грузовик отличается упрощенным дизайном, хромированными бамперами, зеркалами заднего вида и накладками по бокам и вокруг окон, а также надписью на лобовом стекле. Его передняя часть очень похожа на переднюю часть тягача, но с указателями поворота. Задняя часть автомобиля украшена прямоугольными задними фонарями и дверью багажника с тиснением 'DECLASSE', выполненным из хрома и окруженным прямоугольником.",
          year: 2010 
        },
        { 
          image: yoga, 
          imageAny: yogaTop,
          imageBack: yogaBack,
          name: "Youga", 
          price: "2 500 999 ₸", 
          mileage: 30000, 
          power: 150, 
          engineType: "I4, Бензин", 
          description: "Боковые части фургона выделяются небольшими выступами на колесных арках и оснащены функциональными раздвижными дверями для доступа сзади, а также горизонтальными хромированными ручками. Передние двери украшены надписями 'Youga Classic' и прямоугольными зеркалами заднего вида, отделанными хромом. Над дверными стеклами можно увидеть набор солнцезащитных козырьков/ветроотражателей.",
          year: 2012 
        }
      ]
    };
  },
  methods: {
    scrollToHeader() {
      window.scrollTo({ top: 0, behavior: "smooth" });
    }
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
  font-size: 18px;
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
