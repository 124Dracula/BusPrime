import { createWebHistory, createRouter } from "vue-router";

import Home from "@/views/Home.vue";
import AboutUs from "@/views/AboutUs.vue";
import Bilhetes from "@/views/Bilhetes.vue";
import Carteira from "@/views/Carteira.vue";
import Login from "@/views/Login.vue";
import Register from "@/views/Register.vue";
import ParagensFavoritas from "@/views/ParagensFavoritas.vue";
import PercursosFavoritos from "@/views/PercursosFavoritos.vue";
import Perfil from "@/views/Perfil.vue";
import PerguntasFrequentes from "@/views/PerguntasFrequentes.vue";
import ProcuraBilhetes from "@/views/ProcuraBilhetes.vue";

const routes = [
    {
        name: "home",
        path: "/",
        component: Home
    }
    ,
    {
        name: "aboutUs",
        path: "/aboutUs",
        component: AboutUs
    }
    ,
    {
        name: "bilhetes",
        path: "/bilhetes",
        component: Bilhetes
    }
    ,
    {
        name: "carteira",
        path: "/carteira",
        component: Carteira
    }
    ,
    {
        name: "login",
        path: "/login",
        component: Login
    }
    ,
    {
        name: "register",
        path: "/register",
        component: Register
    }
    ,
    {
        name: "paragensFavoritas",
        path: "/paragensFavoritas",
        component: ParagensFavoritas
    }
    ,
    {
        name: "percursosFavoritos",
        path: "/percursosFavoritos",
        component: PercursosFavoritos
    }
    ,
    {
        name: "perfil",
        path: "/perfil",
        component: Perfil
    }
    ,
    {
        name: "perguntasFrequentes",
        path: "/perguntasFrequentes",
        component: PerguntasFrequentes
    }
    ,
    {
        name: "procuraBilhetes",
        path: "/procuraBilhetes/:intercidades/:partida/:destino/:dia/:hora/:order",
        component: ProcuraBilhetes
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
});
  
export default router;