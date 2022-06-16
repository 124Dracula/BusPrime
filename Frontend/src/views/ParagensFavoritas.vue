<template>
    <NavbarDefault/>
    <section class="login-info-form w3-mobile">
        <h1 style="margin-bottom: 40px;">Paragens Favoritas</h1>

        <div class="paragensFavoritas" v-for="paragemFavorita in listaParagensFavoritas">
            <div class = "informacaoParagem">
                <h3 style="float: left;">{{paragemFavorita}}</h3>
                <a v-on:click="toggleEliminateStation($event)" class="deleteButton"><img src="../assets/img/trash-solid.svg" alt="Lixo"></a>
            </div>
            <hr>
        </div>

        <a style="margin-top: 20px; cursor: pointer;" v-on:click="togglePopupNewFavoriteStation()" class="registerLink">Adicionar nova Paragem Favorita</a>
        <div class="butoesAcceptBack" style="margin-bottom: 50px;">
            <router-link to="/perfil"><button class="buttonFinalizar">Finalizar</button></router-link>
        </div>
    </section>


    <!-- Pop-up ask to leave -->
    <div class="popup" ref="popupNewFavoriteStation">
        <div class="overlay">
            <form class="overlayContent" @submit.prevent="acrescentaParagemFavorita">
                <label for="partida">Nova Paragem Favorita</label>
                <p v-if="alert" class="alert" style="color: red">{{this.message}}</p>
                <input list="paragens" id="novaRuaFavorita" v-model="novaRuaFavorita" type="text" placeholder="Paragem Favorita" required>

                <div class="butoesAcceptBack">
                    <a v-on:click="togglePopupNewFavoriteStation()"><button type="button" class="buttonCancelar">Cancelar</button></a>
                    <a><button class="buttonAceitar">Adicionar</button></a>
                </div>
            
            </form>
        </div>	
    </div>

    <!-- Pop-up ask to leave -->
    <div class="popup" ref="popupDeleteStation">
        <div class="overlay">
            <div class="overlayContent">
                <h1>Deseja eliminar esta paragem favorita?</h1>
                <div class="butoesAcceptBack">
                    <a v-on:click="toggleEliminateStation('')"><button class="buttonCancelar" type="button">Não</button></a>
                    <a v-on:click="eliminarParagemFavorita()"><button class="buttonAceitar">Sim</button></a>
                </div>
            </div>
        </div>	
    </div>

    <datalist id="paragens">
        <option v-for="paragem in listaParagens" v-bind:value="paragem"></option> 
    </datalist>

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
            alert : false,
            message : '',
            listaParagens: [],
            listaParagensFavoritas: [],
            novaRuaFavorita: '',
            paragemAEliminar: '',
            idUser : localStorage.getItem('idUser'),
            token: localStorage.getItem('jwt')
        }
    },
    
    created() {
        window.scrollTo(0, 0);

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
    },
  
    methods: {

        toggleEliminateStation(paragemAEliminarSelecionada) {
            if(paragemAEliminarSelecionada === '') {
                this.paragemAEliminar = ''
                this.alert = false;
            } else {
                this.paragemAEliminar = paragemAEliminarSelecionada.path[2].innerText;
            }
            this.$refs.popupDeleteStation.classList.toggle("active");
        },

        togglePopupNewFavoriteStation() {
            this.alert = false;
            this.message = "";
            this.$refs.popupNewFavoriteStation.classList.toggle("active");
        },

        acrescentaParagemFavorita() {

            if (this.listaParagensFavoritas.includes(this.novaRuaFavorita)) {
                this.alert = true;
                this.message = "Paragem Favorita já existente";
            } 
            else if (!this.listaParagens.includes(this.novaRuaFavorita)) {
                this.alert = true;
                this.message = "Paragem não existente";
            }
            else {
                
                this.alert = false;

                let dataParagem = {}
                dataParagem['nome'] = this.novaRuaFavorita
                dataParagem['id'] = this.idUser
    
                axios({
                    method : "post",
                    url: BACKEND_IP + "/utilizador/addparagem/" + this.idUser,
                    headers: { "Authorization" : this.token },
                    data: dataParagem
                })
                .then(data => {
                    this.$refs.popupNewFavoriteStation.classList.toggle("active")
    
                            this.listaParagensFavoritas = []
                            for (let i = 0; i < data.data.paragens.length; i++)
                                this.listaParagensFavoritas[i] = data.data.paragens[i].nome
                        })
                        .catch((err) => {
                            console.log('Não foi possível adicionar a paragem!');
                            console.log(err);
                        })

            }

        },

        eliminarParagemFavorita() {
            let dataParagem = {}
            dataParagem['nome'] = this.paragemAEliminar
            dataParagem['id'] = this.idUser

            axios({
                method : "post",
                url: BACKEND_IP + "/utilizador/removeparagem/" + this.idUser,
                headers: { "Authorization" : this.token },
                data: dataParagem
            })
            .then(data => {
                        this.$refs.popupDeleteStation.classList.toggle("active")

                        this.paragemAEliminar = ''
                        this.listaParagensFavoritas = []
                        for (let i = 0; i < data.data.paragens.length; i++)
                            this.listaParagensFavoritas[i] = data.data.paragens[i].nome
                    })
                    .catch((err) => {
                        console.log('Não foi possível remover a paragem!');
                        console.log(err);
                    })
        }

    }
}

</script>

<style scoped>

.login-info-form {
    padding-top: 180px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
}

.login-info-form h1 {
    font-size: 55px;
    font-weight: 700;
    text-transform: uppercase;
    letter-spacing: 1px;
}

.login-info-form .campoDados {
    display: inline-block;
    padding: 40px 0px 10px 0px;
}

.login-info-form input {
    font-size: 16px;
    width: 350px;
    padding: 5px 10px;
    margin-bottom: 10px;
    border: 1px solid gray;
    border-radius: 4px;
}

.login-info-form .registerLink {
    font-size: 16px;
    font-weight: bold;
    text-decoration: none;
    padding-bottom: 0.1rem;
    position: relative;
    cursor: pointer;
}

.login-info-form .registerLink::before {
    content: "";
    position: absolute;
    left: 0;
    bottom: 0;
    width: 0;
    height: 2px;
    background-color: black;
    transition: 0.25s ease-out;
}

.login-info-form .registerLink:hover::before {
    width: 100%;
}

.paragensFavoritas {
    text-align: center;
    align-items: center;
    justify-content: center;
}

.paragensFavoritas hr {
    position: relative;
    width: 100%;
    border-width: 3px;
    color: grey;
}

.paragensFavoritas h3 {
    font-size: 16;
    margin: -10px 0px;
}

.paragensFavoritas .informacaoParagem {
    display: inline-block;
}

.paragensFavoritas .informacaoParagem .deleteButton {
    width: 25px;
    height: 25px;
    padding: 5px 5px 5px 5px;
    margin-top: -7px;
    margin-left: 5px;
    text-decoration: none;
}

.paragensFavoritas a {
    float: right;
    cursor: pointer;
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

</style>