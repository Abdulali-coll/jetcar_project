import * as VueRouter from "vue-router";
import MainPage from "@/pages/mainPage.vue";
import CarCatalogePage from "@/pages/CarCatalogePage.vue";
import ContactsPage from "@/pages/ContactsPage.vue";
import AboutPage from "@/pages/AboutPage.vue";
import CarCardPage from "@/pages/CarCardPage.vue";

export default VueRouter.createRouter({
  history: VueRouter.createWebHashHistory(),
  routes: [
    {
      path: '/',
      name: 'MainPage',
      component: MainPage
    },
    {
      path: '/card',
      name: 'CarCardPage',
      component: CarCardPage,
      props: (route) => ({ car: route.query.car ? JSON.parse(route.query.car) : null })
    },
    {
      path: '/catalog',
      name: 'CatalogPage',
      component: CarCatalogePage
    },
    {
      path: '/contacts',
      name: 'PageContacts',
      component: ContactsPage
    },
    {
      path: '/about',
      name: 'AboutUsPage',
      component: AboutPage
    }
  ]
});
