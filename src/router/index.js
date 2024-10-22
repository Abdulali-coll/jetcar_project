import * as VueRouter from "vue-router"
import MainPage from "@/pages/mainPage.vue"
import CarCardPage from "@/pages/CarCardPage.vue"
import CarCatalogePage from "@/pages/CarCatalogePage.vue"

export default VueRouter.createRouter({
    history:VueRouter.createWebHashHistory(),
    routes:[
        {
        path:'/',
        name:'MainPage',
        component:MainPage
        },
        {
        path:'/card',
        name:'CarCardpage',
        component:CarCardPage
        },
        
        {
            path:'/catalog',
            name:'CatalogPage',
            component:CarCatalogePage
        },
        /*
        {
            path:'/contats',
            name:'ContactsPage',
            component:PageContacts
        },
        {
            path:'/about',
            name:'AboutUsPage',
            component:AboutPage
        }*/
    ]
})
