<template>
    <!-- Navbar -->
    <header id="navBar">
        <div class="w3-top">
            <div class="w3-bar w3-mobile">
                <router-link to="/" class="w3-bar-item w3-hover-none w3-mobile">
                    <img src="../assets/img/logoPreto.png" alt="BusPrime" id="imageLogo">
                </router-link>
                <span class = "nav-vertical-align-center w3-mobile">
                    <a v-on:click="togglePopupTerminateSession()" style="cursor: pointer;" class="w3-bar-item w3-hover-none w3-right w3-mobile">Terminar Sessão</a>
                </span>
            </div>
        </div>
    </header>

    <section class="profile-info w3-mobile" style="margin-top: -30px;">
        <h1>Perfil de Utilizador</h1>
        <img src="../assets/img/profilePic.png" alt="Profile Pic">

        <h2>Username:</h2>
        <h3>{{this.username}}</h3>

        <h2>E-mail:</h2>
        <h3>{{this.email}}</h3>

        <div class="butoesAcceptBack" style="margin-top: -20px;">
            <router-link to="/carteira"><button class="buttonParagens">Consultar/Adicionar Dinheiro</button></router-link>
        </div>

        <div class="butoesAcceptBack" style="margin-top: -20px;">
            <router-link to="/bilhetes"><button class="buttonParagens">Consultar Bilhetes</button></router-link>
        </div>

        <div class="butoesAcceptBack" style="margin-top: -20px; margin-bottom: 50px;">
            <router-link to="/paragensFavoritas"><button class="buttonParagens">Paragens Favoritas</button></router-link>
            <router-link to="/percursosFavoritos"><button class="buttonPercursos">Percursos Favoritos</button></router-link>
        </div>
    </section>


    <!-- Pop-up ask to leave -->
    <div class="popup" ref="popupSession">
        <div class="overlay">
            <div class="overlayContent">
                
                <h1>Deseja terminar sessão?</h1>
                <div class="butoesAcceptBack">
                    <a v-on:click="togglePopupTerminateSession()"><button class="buttonCancelar">Não</button></a>
                    <a v-on:click="terminateSession()"><button class="buttonAceitar">Sim</button></a>
                </div>
            
            </div>
        </div>	
    </div>
    
</template>



<script>

import axios from 'axios'
import { ref } from 'vue';

export default {

    name: 'App',

    data() {
        return {
            email: '',
            username: '',
            token: localStorage.getItem('jwt')
        }
    },

    created() {
        window.scrollTo(0, 0);

        axios.post("http://localhost:8080/utilizador/token", this.token)
        .then(data => {
                        this.email = data.data.email
                        this.username = data.data.username
                        localStorage.setItem('idUser', data.data.id)
                    })
                    .catch(err => {
                        console.log(err)
                    })
    },


    methods: {

        togglePopupTerminateSession() {
            this.$refs.popupSession.classList.toggle("active");
        },

        terminateSession() {
            localStorage.setItem('jwt', null);
            localStorage.setItem('idUser', null);
            this.$router.push({ name: 'home' });
        }

    }

}


</script>



<style scoped>

.profile-info {
    padding-top: 180px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
}

.profile-info h1 {
    font-size: 55px;
    font-weight: 700;
    text-transform: uppercase;
    letter-spacing: 1px;
}

.profile-info img {
    margin-top: 30px;
    margin-bottom: 10px;
    height: 150px;
    width: 150px;
}

.profile-info h2 {
    font-weight: bold;
    padding: 10px 0px;
}

.profile-info h3 {
    font-size: 16;
    margin-top: -30px;
}


.butoesAcceptBack button {
    border: 1px solid black;
    color: black;
    background: none;
    padding: 10px 20px;
    font-size: 18px;
    cursor: pointer;
    margin: 50px 60px 0px 60px;
    transition: 0.8s;
    position: relative;
    overflow: hidden;
    text-transform: uppercase;
    letter-spacing: 1px;
    border-radius: 8px;
}

.popup .overlay {
    position: fixed;
    top: 0px;
    left: 0px;
    width: 100vw;
    height: 100vh;
    background: rgba(0, 0, 0, 0.7);
    z-index: 1;
    display: none;
}

.popup .overlayContent {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) scale(0);
    background: #fff;
    width: 450px;
    height: 260px;
    z-index: 2;
    text-align: center;
    padding: 20px;
    box-sizing: border-box;
    border-radius: 8px;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
}

.popup .butoesAcceptBack button {
    margin: 20px 10px 0px 10px;
}

.popup img {
    padding: 20px;
    max-width: 300px;
    max-height: 300px;
}

.popup h1 {
    font-size: 30px;
    font-weight: 700;
}

.popup.active .overlay {
    display: block;
}

.popup.active .overlayContent {
    transition: all 300ms ease-in-out;
    transform: translate(-50%, -50%) scale(1);
}

.popup label {
    display: block;
    text-transform: uppercase;
    letter-spacing: 1px;
    font-size: 16px;
    margin: 4px 0 8px 0;
}
  
.popup input {
    padding: 0.7em 1em;
    border-radius: 4px;
    border: 1px solid black;
    width: 360px;
    margin-bottom: 20px;
}

.butoesAcceptBack button:hover {
    color: #fff;
}

.butoesAcceptBack button::before {
    content: "";
    position: absolute;
    left: 0;
    width: 100%;
    height: 0%;
    background: black;
    z-index: -1;
    transition: 0.8s;
    bottom: 0;
    border-radius: 50% 50% 0 0;
}

.butoesAcceptBack button:hover::before{
    height: 180%;
}

</style>