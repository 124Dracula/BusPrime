<template>
    <NavbarDefault/>

    <section class="login-info-form w3-mobile">
        <h1 style="margin-bottom: 40px;">Percursos Favoritos</h1>

        <div class="percursosFavoritos">
            <table class="w3-table w3-bordered w3-border w3-mobile">
                <thead>
                    <tr class="w3-light-gray">
                        <th>Paragem Partida</th>
                        <th>Paragem Destino</th>
                        <th class="removeCollmun"></th>
                    </tr>
                </thead>
                
                <tbody v-for="percurso in listaPercursos">
                    <tr>
                        <td class="w3-left-align">{{percurso.paragemInicial}}</td>
                        <td class="w3-left-align">{{percurso.paragemFinal}}</td>
                        <td class="w3-right-align">
                            <a v-on:click="toggleEliminatePercurso(percurso.id)" class="optionButton"><img src="../assets/img/trash-solid.svg" alt="Lixo"></a>
                            <a v-on:click="toggleGoToPrecurso(percurso.paragemInicial, percurso.paragemFinal)" class="optionButton"><img src="../assets/img/circle-arrow-right-solid.svg" alt="Lixo"></a>
                        </td>
                    </tr>
                </tbody>

            </table>
        </div>

        <div class="butoesAcceptBack" style="margin-bottom: 50px;">
            <router-link to="/perfil"><button class="buttonVoltarPerfil">Voltar ao Perfil</button></router-link>
        </div>
        
    </section>

    <!-- Pop-up ask to delete -->
    <div class="popup" ref="popupDeletePrecurso">
        <div class="overlay">
            <div class="overlayContent">
                <h1>Deseja eliminar este percurso?</h1>
                <div class="butoesAcceptBack">
                    <a v-on:click="toggleEliminatePercurso('','')"><button class="buttonCancelar">Não</button></a>
                    <a v-on:click="eliminatePercurso()"><button class="buttonAceitar">Sim</button></a>
                </div>
            </div>
        </div>	
    </div>

    <!-- Pop-up go to percurso -->
    <div class="popup" ref="popupGoToPrecurso">
        <div class="overlay">
            <div class="overlayContent">
                <h1>Deseja procurar viagens para este percurso?</h1>
                <div class="butoesAcceptBack">
                    <a v-on:click="toggleGoToPrecurso('')"><button class="buttonCancelar">Não</button></a>
                    <a v-on:click="goToPrecurso()"><button class="buttonAceitar">Sim</button></a>
                </div>
            </div>
        </div>	
    </div>

</template>

<script>

import axios from 'axios'
import NavbarDefault from '../components/NavbarDefault.vue'

export default {
    name: 'App',

    components: {
        NavbarDefault
    },

    data() {
        return {
            listaPercursos : [],
            idPercursoEliminar: '',
            partidaPercurso: '',
            destinoPercurso: '',
            idUser : localStorage.getItem('idUser'),
            token: localStorage.getItem('jwt')
        }
    },
    
    methods: {

        toggleGoToPrecurso(paragemInicial, paragemFinal) {
            if((paragemInicial === '') || (paragemFinal === '')) {
                this.partidaPercurso = ''
                this.destinoPercurso = ''
            } else {
                this.partidaPercurso = paragemInicial
                this.destinoPercurso = paragemFinal
            }
            this.$refs.popupGoToPrecurso.classList.toggle("active");
        },


        toggleEliminatePercurso(idPercurso) {
            if (idPercurso === '') {
                this.idPercursoEliminar = '';
            } else {
                this.idPercursoEliminar = idPercurso;
            }
            this.$refs.popupDeletePrecurso.classList.toggle("active");
        },

        eliminatePercurso() {

            let objetoJson = { }

            objetoJson['id'] = this.idPercursoEliminar
            objetoJson['idUtilizador'] = this.idUser

            axios({
                method : "post",
                url: "http://localhost:8080/utilizador/removepercurso/" + this.idUser,
                headers: { "Authorization" : this.token },
                data: objetoJson
            })
            .then(data => {
                this.$refs.popupDeletePrecurso.classList.toggle("active")
                
                this.idPercursoEliminar = ''
                this.partidaPercurso = ''
                this.destinoPercurso = ''
                this.listaPercursos = []

                this.listaPercursos = data.data.percursos
            })
            .catch(err => {
                console.log(err)
            })

        },

        goToPrecurso() {

            this.$router.push({ name: 'procuraBilhetes',
                                params: { 
                                    intercidades: "Intracidade", 
                                    partida: this.partidaPercurso,
                                    destino: this.destinoPercurso,
                                    dia: "2022-06-22",
                                    hora: "00:00"
                                    } 
                                });

        }

    },

    created() {
        window.scrollTo(0, 0);

        axios({
                method : "get",
                url: "http://localhost:8080/utilizador/listpercursos/" + this.idUser,
                headers: { "Authorization" : this.token }
            })
            .then(data => {
                this.listaPercursos = data.data.percursos
                console.log(data)
            })
            .catch(err => {
                console.log(err)
            })
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

.percursosFavoritos {
    width: auto;
}

.percursosFavoritos th:not(:last-child), .percursosFavoritos td:not(:last-child) {
    padding-right: 50px;
}

.login-info-form .percursosFavoritos .optionButton {
    width:20px;
    height:20px;
    display:inline-block;
    margin-right:5px;
    margin-left: auto;
    text-decoration: none;
    margin-top: 2px;
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