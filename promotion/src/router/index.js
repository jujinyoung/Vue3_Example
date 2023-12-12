import { createRouter, createWebHistory } from "vue-router";
import HomeView from "@/views/HomeView.vue";
import LoginView from "@/views/member/LoginView.vue";
import MyPageView from "@/views/mypage/MyPageView.vue";
import CartView from "@/views/mypage/CartView.vue";
import EventView from "@/views/event/EventView.vue";

const routes = [
    {
        path: '/',
        name: 'Home',
        component: HomeView
    },
    {
        path: '/login',
        name: 'login',
        component: LoginView
    },
    {
        path: '/myPage',
        name: 'myPage',
        component: MyPageView
    },
    {
        path: '/cart',
        name: 'cart',
        component: CartView
    },
    {
        path: '/event',
        name: 'event',
        component: EventView
    }
];

const router = createRouter({
    history: createWebHistory('/'),
    routes
})

export default router;