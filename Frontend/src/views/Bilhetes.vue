<template>
    <NavbarDefault/>
    <section class="carteiraBilhetes w3-mobile">
        <h1>Carteira de Bilhetes</h1>
    </section>

    <section v-for="bilhete in bilhetesUtilizador">
        <section class="listagemViagens" v-on:click="togglePopupQrCode()" style="cursor: pointer;">
            <div class="arrow">
                <img src="../assets/img/down-arrow.png" alt="↓">
            </div>
            <div class="ruaPartida">
                <h4>{{bilhete.paragemInicial}} ({{bilhete.horaInicial}})</h4>
            </div>
            <div class="ruaDestino">
                <h4>{{bilhete.paragemFinal}} ({{bilhete.horaFinal}})</h4>
            </div>
            <div class="empresaViagem">
                <h4>{{bilhete.nomeEmpresa}} ({{bilhete.nAutocarro}})</h4>
            </div>
            <div class="precoViagem">
                <h4>{{bilhete.preco}} €</h4>
            </div>
        </section>
    </section>


    <div class="popup" ref="popupQrCode">
        <div class="overlay">
            <div class="overlayContent" style="width: 300px; height: 350px;">
                
                <img src="../assets/img/qrCode.png" alt="qrCode">
                <div class="butoesAcceptBack" style="margin-top: -25px; padding-bottom: 20px;">
                    <a v-on:click="togglePopupQrCode()"><button class="buttonCancelar">Finalizar</button></a>
                </div>
            
            </div>
        </div>	
    </div>

    <div class="butoesAcceptBack" style="margin-bottom: 50px; margin-top: -50px; text-align: center;">
        <router-link to="/perfil"><button class="buttonVoltarPerfil">Voltar ao Perfil</button></router-link>
    </div>

</template>

<script>
import {BACKEND_IP} from '../store/consts'

import axios from 'axios'
import NavbarDefault from '../components/NavbarDefault.vue'

export default {
    name: 'App',

    components: {
        NavbarDefault
    },

    data() {
        return {
            idUser : localStorage.getItem('idUser'),
            token: localStorage.getItem('jwt'),
            bilhetesUtilizador: []
        }
    },

    created() {
        window.scrollTo(0, 0);

        axios({
                method : "get",
                url: BACKEND_IP + "/utilizador/listarbilhetes/" + this.idUser,
                headers: { "Authorization" : this.token }
            })
            .then(data => {
                this.bilhetesUtilizador = data.data.bilhetes
            })
            .catch(err => {
                console.log(err)
            })
    },

    methods: {
        togglePopupQrCode() {
            this.$refs.popupQrCode.classList.toggle("active");
        }
    }
}

</script>

<style scoped>
.listagemViagens {
    display: grid;
    width: 60%;
    margin-left: 20%;
    margin-bottom: 50px;

    grid-template-columns: 7% 70% 23%;
    grid-template-areas: 
        "arrow ruaPartida empresaViagem"
        "arrow blankRuas precoViagem"
        "arrow ruaDestino buttonComprar";

    border: 3px solid black;
    border-radius: 8px;
}

.arrow {
    grid-area: arrow;
    grid-column: 1/2;
    grid-row: 1/4;

    display: flex;
    align-items: center;
    justify-content: center;
    align-content: stretch;
}

.arrow img {
    max-height: 120px;
    font-size: 80px;
    color: gray;
    margin-top: 10px; 
    margin-bottom: 10px;
}


.ruaPartida {
    grid-area: ruaPartida;
    grid-column: 2/3;
    grid-row: 1/2;

    display: flex;
    align-items: center;
}

.ruaPartida h4 {
    font-size: 22px;
    padding-left: 10px;
}

.ruaDestino {
    grid-area: ruaDestino;
    grid-column: 2/3;
    grid-row: 3/4;

    display: flex;
    align-items: center;
}

.ruaDestino h4 {
    font-size: 22px;
    padding-left: 10px;
}

.empresaViagem {
    grid-area: empresaViagem;
    grid-column: 3/4;
    grid-row: 1/2;

    display: flex;
    align-items: center;
}

.empresaViagem h4 {
    font-size: 24px;
    margin-left: auto; 
    margin-right: 30px;
}

.precoViagem {
    grid-area: precoViagem;
    grid-column: 3/4;
    grid-row: 2/3;

    display: flex;
    align-items: center;
}

.precoViagem h4 {
    font-size: 24px;
    margin-left: auto; 
    margin-right: 30px;
    font-weight: bold;
}

.buttonComprar {
    grid-area: precoViagem;
    grid-column: 3/4;
    grid-row: 3/4;

    display: flex;
    align-items: center;
    justify-content: center;
    margin-right: 30px;
    margin-left: auto;
}

.buttonComprar button {
    border: 1px solid black;
    color: black;
    background: none;
    padding: 5px 10px;
    font-size: 16px;
    font-weight: bold;
    cursor: pointer;
    transition: 0.8s;
    position: relative;
    overflow: hidden;
    text-transform: uppercase;
    letter-spacing: 1px;
    border-radius: 8px;
}

.buttonComprar button:hover {
    color: #fff;
}

.buttonComprar button::before {
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

.buttonComprar button:hover::before{
    height: 180%;
}

.carteiraBilhetes {
    padding-top: 180px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
}

.carteiraBilhetes h1 {
    font-size: 55px;
    font-weight: 700;
    text-transform: uppercase;
    letter-spacing: 1px;
    padding-bottom: 50px;
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

@media only screen and (max-width:1200px) {
    .listagemViagens {
        width: 80%;
        margin-left: 10%;
    }
}

@media only screen and (max-width:800px) {
    .listagemViagens {
        width: 96%;
        margin-left: 2%;
    }
}

@media only screen and (max-width:650px) {
    .listagemViagens {
        grid-template-columns: 10% 63% 22%;
    }
}
</style>