<template>
    <NavbarDefault/>
    
    <section>

        <!-- Seletor de Seletor de Tipo de Viagens -->
        <section class="viagem-form w3-mobile" style="margin-top: 120px;">
            <form>
                <div class="w3-row-padding w3-mobile">
                    <div class="w3-half w3-mobile" v-if="this.$route.params.intercidades === 'Intracidade'">
                        <input class="w3-radio w3-mobile" type="radio" name="trip-type" value="Intracidade" id="Intracidade" checked="checked">
                        <label for="Intracidade">Intracidade</label><br>
                    </div>
                    <div class="w3-half w3-mobile" v-else>
                        <input class="w3-radio w3-mobile" type="radio" name="trip-type" value="Intracidade" id="Intracidade">
                        <label for="Intracidade">Intracidade</label><br>
                    </div>
                    <div class="w3-half w3-mobile" v-if="this.$route.params.intercidades === 'Intercidade'">
                        <input class="w3-radio w3-mobile" type="radio" name="trip-type" value="Intercidade" id="Intercidade" checked="checked">
                        <label for="Intercidade">Intercidade</label>
                    </div>
                    <div class="w3-half w3-mobile" v-else>
                        <input class="w3-radio w3-mobile" type="radio" name="trip-type" value="Intercidade" id="Intercidade">
                        <label for="Intercidade">Intercidade</label>
                    </div>
                </div>
            </form>
            
        </section> 

        <section class="viagem-info-form w3-mobile" style="margin-top: -30px;" @submit.prevent="procuraBilhetesForm">
            <form>
                <p v-if="alert" class="alert" style="color: red">{{this.message}}</p>
                <div class="w3-row-padding w3-mobile">
                    <div class="w3-quarter w3-mobile">
                        <label for="partida">Rua de Partida</label>
                        <input list="paragens" id="partida" v-model="partida" type="text" placeholder="Rua de Partida" required>
                    </div>
                    <div class="w3-quarter w3-mobile">
                        <label for="destino">Rua de Destino</label>
                        <input list="paragens" id="destino" v-model="destino" type="text" placeholder="Rua de Destino" required>
                    </div>
                    <div class="w3-quarter w3-mobile">
                        <label for="diaPartida">Dia de Partida</label>
                        <input type="date" id="diaPartida" v-model="diaPartida" required>
                    </div>
                    <div class="w3-quarter w3-mobile">
                        <label for="horaPartida">Hora de Partida</label>
                        <input type="time" id="horaPartida" v-model="horaPartida" required>
                    </div>
                </div>

            <br>

            <a><button class="buttonProcurar">Alterar Pesquisa</button></a>

            </form>
        </section>

    </section>
    


    <section class="favoriteButtonContainer">
        <div v-if="this.isFavorito === false && this.logado" class="favoriteButton" v-on:click="togglePopupAddPercursoFavorito()">
            Adicionar Percurso aos Favoritos <a><img src="../assets/img/star-regular.svg" alt="Lixo"></a>
        </div>
    </section>

    <section class="order-form w3-mobile">
        <form>
            <div class="w3-row-padding w3-mobile">
                <div class="w3-third w3-mobile" v-if="this.$route.params.order === 'default'">
                    <input class="w3-radio w3-mobile" type="radio" name="order-type" value="default" id="default" ref="default" checked="checked">
                    <label v-on:click="mudaOrdemPagina('default')" for="Default">Default</label><br>
                </div>
                <div class="w3-third w3-mobile" v-else>
                    <input class="w3-radio w3-mobile" type="radio" name="order-type" value="default" id="default" ref="default">
                    <label v-on:click="mudaOrdemPagina('default')" for="Default">Default</label><br>
                </div>
                <div class="w3-third w3-mobile" v-if="this.$route.params.order === 'rapidez'">
                    <input class="w3-radio w3-mobile" type="radio" name="order-type" value="rapidez" id="rapidez" ref="rapidez" checked="checked">
                    <label v-on:click="mudaOrdemPagina('rapidez')" for="Rapidez">Rapidez</label>
                </div>
                <div class="w3-third w3-mobile" v-else>
                    <input class="w3-radio w3-mobile" type="radio" name="order-type" value="rapidez" id="rapidez" ref="rapidez">
                    <label v-on:click="mudaOrdemPagina('rapidez')" for="Rapidez">Rapidez</label>
                </div>
                <div class="w3-third w3-mobile" v-if="this.$route.params.order === 'barato'">
                    <input class="w3-radio w3-mobile" type="radio" name="order-type" value="barato" id="barato" ref="barato" checked="checked">
                    <label v-on:click="mudaOrdemPagina('barato')" for="Barato">Barato</label>
                </div>
                <div class="w3-third w3-mobile" v-else>
                    <input class="w3-radio w3-mobile" type="radio" name="order-type" value="barato" id="barato" ref="barato">
                    <label v-on:click="mudaOrdemPagina('barato')" for="Barato">Barato</label>
                </div>
            </div>
        </form>
    </section> 

    <!-- ↓ -->
    <section v-for="bilhete in bilhetesEncontrados">
        <section class="listagemViagens" v-if="bilhete.nBilhetes > 0">
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
                <h4>{{bilhete.nomeEmpresa}} ({{bilhete.autocarro}})</h4>
            </div>
            <div class="precoViagem">
                <h4>{{bilhete.preco}} €</h4>
            </div>
            <div class="buttonComprar" v-on:click="togglePopupBuyTicket(bilhete.idViagem)">
                <a v-if="this.logado">
                    <button class="buttonAccept" >
                        Comprar ({{bilhete.nBilhetes}})
                    </button>
                </a>
            </div>
        </section>
    </section>

    <datalist id="paragens">
        <div v-for="paragem in listaParagens">
            <option v-if="listaParagensFavoritas.includes(paragem)" v-bind:value="paragem" label="Favorito"></option>
            <option v-else v-bind:value="paragem"></option> 
        </div>
    </datalist>


    <!-- Pop-up  -->
    <div class="popup" ref="popupBuyTicket">
        <div class="overlay">
            <div class="overlayContent">
                <h1>Deseja comprar um bilhete para esta viagem?</h1>
                <div class="butoesAcceptBack">
                    <a v-on:click="togglePopupBuyTicket('')"><button class="buttonCancelar" type="button">Não</button></a>
                    <a v-on:click="comprarBilhete()"><button class="buttonAceitar">Sim</button></a>
                </div>
            </div>
        </div>	
    </div>

    <!-- Pop-up  -->
    <div class="popup" ref="popupAddPercursoFavorito">
        <div class="overlay">
            <div class="overlayContent">
                <h1>Deseja adicionar este percurso como favorito?</h1>
                <div class="butoesAcceptBack">
                    <a v-on:click="togglePopupAddPercursoFavorito()"><button class="buttonCancelar" type="button">Não</button></a>
                    <a v-on:click="adicionaPercursoFavorito()"><button class="buttonAceitar">Sim</button></a>
                </div>
            </div>
        </div>	
    </div>


</template>

<script>
import {BACKEND_IP} from '../store/consts'

import $ from 'jquery'
import axios from 'axios'
import NavbarDefault from '../components/NavbarDefault.vue'

export default {
    name: 'App',

    components: {
        NavbarDefault
    },

    data() {
        return {
            alert: false,
            message: '',
            isFavorito: false,
            tripType: '',
            orderType: '',
            partida: '',
            destino: '',
            diaPartida: '',
            horaPartida: '',
            listaParagens: [],
            listaParagensFavoritas: [],
            dadosBilheteAComprar: null,
            idUser : localStorage.getItem('idUser'),
            token: localStorage.getItem('jwt'),
            logado: false,
            bilhetesEncontrados: []
        }
    },

    created() {
        window.scrollTo(0, 0);

        if (localStorage.getItem('jwt') != 'null')
            this.logado = true

        axios({
                method : "get",
                url: BACKEND_IP + "/paragens"
        })
        .then(data => {
                    for (let i = 0; i < data.data.paragens.length; i++)
                        this.listaParagens[i] = data.data.paragens[i].nome
                })
                .catch(err => {
                    console.log(err)
                })


        if (!(localStorage.getItem('jwt') === 'null')) {
            axios({
                method : "get",
                url: BACKEND_IP + "/utilizador/listparagens/" + this.idUser,
                headers: { "Authorization" : this.token }
            })
            .then(data => {
                for (let i = 0; i < data.data.paragens.length; i++)
                    this.listaParagensFavoritas[i] = data.data.paragens[i].nome
                    
            })
            .catch(err => {
                console.log(err)
            })


        }



        let objetoJson = { }

        objetoJson['paragemInicial'] = this.$route.params.partida
        objetoJson['paragemFinal'] = this.$route.params.destino
        objetoJson['hora'] = this.$route.params.hora
        
        if (this.$route.params.intercidades === "Intercidade") {
            objetoJson['intercidades'] = '1'
        } else {
            objetoJson['intercidades'] = '0'
        }

        objetoJson['filtro'] = this.$route.params.order

        axios({
            method : "post",
            url: BACKEND_IP + "/viagem/filter",
            data: objetoJson
            })
            .then(data => {
                this.bilhetesEncontrados = data.data.viagens
            })
            .catch(err => {
                console.log(err)
            })


        axios({
                method : "get",
                url: BACKEND_IP + "/utilizador/listpercursos/" + this.idUser,
                headers: { "Authorization" : this.token }
            })
            .then(data => {
                for (let i = 0; i<data.data.percursos.length; i++) {
                    if ((data.data.percursos[0].paragemInicial === this.$route.params.partida) && (data.data.percursos[0].paragemFinal === this.$route.params.destino)) 
                        this.isFavorito = true;
                        break;
                }
            })
            .catch(err => {
                console.log(err)
            })
        
            
        let tipoDeOrder  = this.$router.currentRoute.value.params.order
        let tipoDeViagem = this.$router.currentRoute.value.params.intercidades

    },

    methods: {

        togglePopupBuyTicket(idViagemComprar) {

            if(idViagemComprar === '') {
                this.dadosBilheteAComprar = null;
            } 
            else {
                
                for (let i = 0; i < this.bilhetesEncontrados.length; i++) {

                    if (this.bilhetesEncontrados[i].idViagem === idViagemComprar) {
                        this.dadosBilheteAComprar = this.bilhetesEncontrados[i];
                        break;
                    }
                }

            }
            this.$refs.popupBuyTicket.classList.toggle("active");
        },

        togglePopupAddPercursoFavorito() {
            this.$refs.popupAddPercursoFavorito.classList.toggle("active");
        },

        togglePopupAddPercursoFavorito() {
            this.$refs.popupAddPercursoFavorito.classList.toggle("active");
        },

        procuraBilhetesForm() {
            
            console.log(document.querySelector('input[name="trip-type"]:checked').value);

            this.alert = false;
            this.message = "";

            if (!this.listaParagens.includes(this.partida)) {
                this.alert = true;
                this.message = "Partida não existente";
            }
            else if (!this.listaParagens.includes(this.destino)) {
                this.alert = true;
                this.message = "Destino não existente";
            }
            else if (this.destino == this.partida) {
                this.alert = true;
                this.message = "Partida e Destino iguais";
            }
            else {
                this.tripType = (document.querySelector('input[name="trip-type"]:checked').value);
    
                this.$router.push({ name: 'procuraBilhetes',
                                    params: { 
                                        intercidades: this.tripType, 
                                        partida: this.partida,
                                        destino: this.destino,
                                        dia: this.diaPartida,
                                        hora: this.horaPartida,
                                        ordem: "default"
                                        }
                                    });
            
            }

        },

        mudaOrdemPagina(odemLista) {

            var currentRouter = this.$router.currentRoute.value.params

            this.$router.push({ name: 'procuraBilhetes',
                                params: { 
                                    intercidades: currentRouter.intercidades, 
                                    partida: currentRouter.partida,
                                    destino: currentRouter.destino,
                                    dia: currentRouter.dia,
                                    hora: currentRouter.hora,
                                    order: odemLista
                                    }
                                });
            
        },

        comprarBilhete() {

            let objetoJson = { }

            objetoJson['paragemInicial'] = this.dadosBilheteAComprar['paragemInicial']
            objetoJson['horaInicial'] = this.dadosBilheteAComprar['horaInicial']
            objetoJson['paragemFinal'] = this.dadosBilheteAComprar['paragemFinal']
            objetoJson['horaFinal'] = this.dadosBilheteAComprar['horaFinal']
            objetoJson['preco'] = this.dadosBilheteAComprar['preco']
            objetoJson['numeroAutocarro'] = this.dadosBilheteAComprar['autocarro']
            objetoJson['nomeEmpresa'] = this.dadosBilheteAComprar['nomeEmpresa']
            objetoJson['idViagem'] = this.dadosBilheteAComprar['idViagem']

            console.log(objetoJson)

            axios({
                method : "post",
                url: BACKEND_IP + "/utilizador/comprarBilhete/" + this.idUser,
                headers: { "Authorization" : this.token },
                data: objetoJson
            })
            .then(data => {

                for (let i = 0; i < this.bilhetesEncontrados.length; i++) {

                    if (this.bilhetesEncontrados[i].idViagem === data.data.idViagem) {
                        this.bilhetesEncontrados[i].nBilhetes = data.data.nBilhetes;
                        break;
                    }
                }

                this.$refs.popupBuyTicket.classList.toggle("active")
            })
            .catch(err => {
                console.log(err)
            })

        },

        adicionaPercursoFavorito() {
            
            let objetoJson = { }

            objetoJson['paragemInicial'] = this.$route.params.partida
            objetoJson['paragemFinal'] = this.$route.params.destino

            console.log(objetoJson)

            axios({
                method : "post",
                url: BACKEND_IP + "/utilizador/addpercurso/" + this.idUser,
                headers: { "Authorization" : this.token },
                data: objetoJson
            })
            .then(data => {
                this.isFavorito = true

                this.$refs.popupAddPercursoFavorito.classList.toggle("active")
            })
            .catch(err => {
                console.log(err)
            })

        }
    }

    
}

</script>

<style scoped>

.viagem-form {
    display: block;
    text-align: center;
    padding: 50px 0px 0px 0px;
}

.viagem-form h2 {
    font-size: 35px;
    font-weight: 700;
}

.viagem-form form {
    padding-top: 20px;
}

.viagem-form input[type="radio"] {
    display: none;
}

.viagem-form label {
    position: relative;
    color: #304536;
    font-size: 25px;
    border: 2px solid #304536;
    border-radius: 5px;
    padding: 10px 30px;
    display: flex;
    align-items: center;
    cursor: pointer;
    margin-bottom: 20px;
    float: right;
}

.viagem-form form label:last-child {
    float: left;
}

.viagem-form label:before {
    content: "";
    height: 25px;
    width: 25px;
    border: 3px solid #304536;
    border-radius: 50%;
    margin-right: 20px;
}

.viagem-form input[type="radio"]:checked + label {
    background-color: #304536;
    color: white;

    transition: background-color .7s ease;
    transition: color .7s ease;
}

.viagem-form input[type="radio"]:checked + label:before {
    height: 25px;
    width: 25px;
    border: 8px solid white;
    background-color: #304536;
    transition: border .3s ease-in;
}

.order-form {
    display: block;
    text-align: center;
    padding-top: 50px;
    width: 60%;
    margin-left: 20%;
}

.order-form input[type="radio"] {
    display: none;
}

.order-form label {
    position: relative;
    color: #304536;
    font-size: 25px;
    border: 2px solid #304536;
    border-radius: 5px;
    padding: 10px 30px;
    display: flex;
    align-items: center;
    text-align: center;
    justify-content: center;
    cursor: pointer;
    margin-bottom: 20px;
    float: none;
}
.order-form label:before {
    content: "";
    height: 25px;
    width: 25px;
    border: 3px solid #304536;
    border-radius: 50%;
    margin-right: 20px;
}

.order-form input[type="radio"]:checked + label {
    background-color: #304536;
    color: white;

    transition: background-color .7s ease;
    transition: color .7s ease;
}

.order-form input[type="radio"]:checked + label:before {
    height: 25px;
    width: 25px;
    border: 8px solid white;
    background-color: #304536;
    transition: border .3s ease-in;
}


.buttonProcurarContainer {
    display: flex;
    justify-content: center;
    align-items: center;
    margin-left: auto;
    padding-right: 15px;
}


.buttonProcurar {
    border: 2px solid #304536;
    color: #304536;
    background: none;
    padding: 10px;
    font-size: 20px;
    cursor: pointer;
    transition: 0.8s;
    position: relative;
    overflow: hidden;
    text-transform: uppercase;
    text-decoration: none;
    letter-spacing: 1px;
    border-radius: 8px;
}

.buttonProcurar:hover {
    color: #fff;
}

.buttonProcurar::before {
    content: "";
    position: absolute;
    left: 0;
    width: 100%;
    height: 0%;
    background: #304536;
    z-index: -1;
    transition: 0.8s;
    bottom: 0;
    border-radius: 50% 50% 0 0;
}

.buttonProcurar:hover::before{
    height: 180%;
}

.viagem-info-form {
    text-align: center;
    padding: 50px 0px;
}

.viagem-info-form form {
    width: 80%;
    margin-left: 10%;
}


.viagem-info-form label {
    display: block;
    text-transform: uppercase;
    letter-spacing: 1px;
    font-size: 16px;
    margin: 4px 0 8px 0;
}
  
.viagem-info-form input {
    padding: 0.7em 1em;
    border-radius: 4px;
    border: 1px solid black;
    width: 100%;
}

.favoriteButtonContainer {
    display: flex;
    justify-content: center;
    padding: 20px 0px 0px 0;
}

.favoriteButtonContainer .favoriteButton a {
    width: 25px;
    height: 25px;
    margin-top: -3px;
    margin-left: 10px;
}

.favoriteButton {
    font-size: 20px;
    font-weight: bold;
    text-transform: uppercase;
    text-decoration: none;
    padding-bottom: 0.1rem;
    position: relative;
    cursor: pointer;
}

.favoriteButton::before {
    content: "";
    position: absolute;
    left: 0;
    bottom: 0;
    width: 0;
    height: 2px;
    background-color: black;
    transition: 0.25s ease-out;
}

.favoriteButton:hover::before {
    width: 100%;
}

.favoriteButton {
    display: flex;
    justify-content: center;
    text-align: center;
    font-size: 20px;
    letter-spacing: 1.5px;
    text-decoration: none;
    padding-bottom: 0.1rem;
    position: relative;
    cursor: pointer;
}

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

@media only screen and (max-width:1200px) {
    .listagemViagens {
        width: 80%;
        margin-left: 10%;
    }

    .order-form {
        width: 80%;
        margin-left: 10%;
    }       
}

@media only screen and (max-width:800px) {
    .listagemViagens {
        width: 96%;
        margin-left: 2%;
    }
    .order-form {
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