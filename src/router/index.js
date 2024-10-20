/* vue Router for create new pages and link them */
import * as VueRouter from "vue-router"
import MainPage from "@/pages/mainPage.vue"
import CarCardPage from "@/pages/CarCardPage.vue"

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
        /*{
            path:'/catalog',
            name:'CatalogPage',
            component:CarCataloge
        },
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
