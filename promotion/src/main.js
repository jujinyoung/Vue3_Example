import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.css';
import { createApp } from 'vue';
import { createPinia } from "pinia";
import router from "@/router/index.js";
import App from './App.vue';

createApp(App).use(router).use(createPinia()).mount('#app')
import 'bootstrap/dist/js/bootstrap';
