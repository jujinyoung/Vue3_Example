import 'bootstrap/dist/css/bootstrap.min.css';
import { createApp } from 'vue';
import App from './App.vue';

const app = createApp(App);

// app.component('AppCard', AppCard);

app.provide('app-message', 'Hello app message');
app.mount('#app');
import 'bootstrap/dist/js/bootstrap';
