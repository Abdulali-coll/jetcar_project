<template>
    <nav class="main-filter-container">

      <!-- Filter by mark -->
      <div class="filter-group">
        <label for="brand-filter">Brand:</label>
        <select id="brand-filter" @change="handleFilterChange('brand', $event.target.value)">
          <option value="">Select</option>
          <option value="maibax">Майбах(бенбен)</option>
          <option value="aubi">Ауби</option>
          <option value="kadilak">Какделак</option>
          <option value="сzhech">Чехословацкий автопром</option>
          <option value="mohentohen">Мохентохен моторспорт</option>
          <option value="chingizhan">Чингизхан INC</option>
          <option value="gaz">ГАЗ</option>
          <option value="mmm">МММ</option>
        </select>
      </div>
  
      <!-- filter by price -->
      <div class="filter-group">
        <label for="price-filter">Price:</label>
        <select id="price-filter" @change="handleFilterChange('price', $event.target.value)">
          <option value="">Select</option>
          <option value="asc">Low to High</option>
          <option value="desc">High to Low</option>
        </select>
      </div>
  
      <!-- filter by year -->
      <div class="filter-group">
        <label for="year-filter">Year:</label>
        <select id="year-filter" @change="handleFilterChange('year', $event.target.value)">
          <option value="">Select</option>
          <option value="asc">Old to New</option>
          <option value="desc">New to Old</option>
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
        }
      };
    },
    methods: {
      handleFilterChange(filterType, order) {
        this.filters[filterType] = order;
        this.$emit('filter', { ...this.filters });
      }
    }
  }
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
