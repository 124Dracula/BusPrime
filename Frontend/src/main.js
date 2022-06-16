import { createApp } from 'vue';
import App from './App.vue';
import router from './router/index';

import './store/scriptScroll';

import 'w3-css/w3.css';

createApp(App)
    .use(router)
    .mount('#app')
