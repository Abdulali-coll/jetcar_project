<template>
  <nav class="main-filter-container">
    <!-- Filter by mark -->
    <div class="filter-group">
      <label for="brand-filter">Бренд:</label>
      <select
        id="brand-filter"
        @change="handleFilterChange('brand', $event.target.value)"
        :value="filters.brand"
      >
        <option value="">Выбрать</option>
        <option value="Obey">Obey</option>
        <option value="Bravado">Bravado</option>
        <option value="Pegassi">Pegassi</option>
        <option value="Cavalcade">Cavalcade</option>
        <option value="Elegy">Elegy</option>
        <option value="Dominator">Dominator</option>
        <option value="Itali">Itali</option>
        <option value="Comet">Comet</option>
      </select>
    </div>

    <!-- filter by price -->
    <div class="filter-group">
      <label for="price-filter">Стоимость:</label>
      <select
        id="price-filter"
        @change="handleFilterChange('price', $event.target.value)"
        :value="filters.price"
      >
        <option value="">Выбрать</option>
        <option value="asc">По Возрастанию + </option>
        <option value="desc">По Убыванию - </option>
      </select>
    </div>

    <!-- filter by year -->
    <div class="filter-group">
      <label for="year-filter">Год Выпуска:</label>
      <select
        id="year-filter"
        @change="handleFilterChange('year', $event.target.value)"
        :value="filters.year"
      >
        <option value="">Выбрать</option>
        <option value="asc">Б\У</option>
        <option value="desc">Новые</option>
      </select>
    </div>
  </nav>
</template>

<script>
export default {
  name: 'filterButton',
  data() {
    return {
      filters: {
        brand: '',
        price: '',
        year: '',
      },
    };
  },
  methods: {
    handleFilterChange(filterType, value) {
      this.filters[filterType] = value;

      // Обновляем query-параметры
      this.updateQueryParams();
      
      // Передаем изменения фильтра через emit
      this.$emit('filter', { ...this.filters });
    },
    updateQueryParams() {
      const query = { ...this.$route.query, ...this.filters };

      // Убираем пустые параметры из URL
      Object.keys(query).forEach((key) => {
        if (!query[key]) {
          delete query[key];
        }
      });

      this.$router.push({ query });
    },
    setFiltersFromQuery() {
      const { brand, price, year } = this.$route.query;

      // Устанавливаем фильтры из query
      this.filters = {
        brand: brand || '',
        price: price || '',
        year: year || '',
      };

      // Вызываем emit для синхронизации с родительским компонентом
      this.$emit('filter', { ...this.filters });
    },
  },
  mounted() {
    this.setFiltersFromQuery();
  },
  watch: {
    // Обновляем фильтры при изменении query-параметров
    '$route.query': {
      handler() {
        this.setFiltersFromQuery();
      },
      immediate: true,
    },
  },
};
</script>


<style scoped>
.main-filter-container {
  font-family: 'Roboto', sans-serif;
  background-color: black;
  display: flex;
  justify-content: center;
  height: 45px;
  align-items: center;
  margin: 10px 0;
  gap: 50px;
  flex-wrap: wrap;
}

.filter-group {
  display: flex;
  flex-direction: column;
  align-items: center;
  color: #8d8d8d;
}

.filter-group label {
  font-size: 14px;
  margin-bottom: 5px;
  color: #fff;
}

.filter-group select {
  background-color: #2b2b2b;
  color: #fff;
  font-weight: 300;
  padding: 8px 10px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  transition: background-color 0.3s, color 0.3s;
}

.filter-group select:hover {
  background-color: #444444;
}

.filter-group select:focus {
  outline: none;
  background-color: #e5b748;
}
/*Adaptive styles*/
@media (max-width: 768px) {
  .main-filter-container {
    gap: 20px;
  }

  .filter-group select {
    font-size: 14px;
    padding: 6px 8px;
  }
}

@media (max-width: 480px) {
  .main-filter-container {
    flex-direction: column;
    height: auto;
  }

  .filter-group {
    width: 100%;
    margin-bottom: 10px;
  }

  .filter-group select {
    width: 90%;
    font-size: 14px;
  }

  .filter-group label {
    font-size: 12px;
  }
}
</style>
