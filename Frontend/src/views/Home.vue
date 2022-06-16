<template>

    <NavbarHome/>

    <!-- Showcase -->
    <section class="showcase w3-mobile">
        <div class="w3-container w3-center w3-mobile">
            <h1 class="w3-text-shadow w3-animate-opacity w3-mobile">Bus Prime - Travel Anywhere</h1>
            <hr>
            <p class="w3-text-shadow w3-animate-opacity w3-mobile">Somos um grupo de estudantes no Mestrado de Engenharia Informática na Universidade do Minho.
                Pretendemos inovar o mundo dos transportes públicos e por isso, recorremos a este projeto constrúido no âmbito das
                disciplinas de <b>Arquiteturas Aplicacionais</b> e <b>Sistemas Interativos Confiáveis</b> decidimos amarrar esta oportunidade.
                Desta forma, constrúimos a <b>BusPrime!</b></p>
            <router-link to="/aboutUs"><button class="buttonAbout">Sobre Nós</button></router-link>
        </div>	
    </section>

    <!-- Seletor de Seletor de Tipo de Viagens -->
    <section class="viagem-form w3-mobile">
        <h2>Tipo de Viagem</h2>
        <form>
            <div class="w3-row-padding w3-mobile">
                <div class="w3-half w3-mobile">
                    <input class="w3-radio w3-mobile" type="radio" name="trip-type" value="Intracidade" id="Intracidade" checked="checked">
                    <label for="Intracidade">Intracidade</label><br>
                </div>
                <div class="w3-half w3-mobile">
                    <input class="w3-radio w3-mobile" type="radio" name="trip-type" value="Intercidade" id="Intercidade">
                    <label for="Intercidade">Intercidade</label>
                </div>
            </div>
        </form> 
    </section>

    <!-- Seletor de Seletor de Tipo de Viagens -->
    <form class="viagem-info-form w3-mobile" >
        <form  @submit.prevent="procuraBilhetesForm">
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

        <a><button class="buttonProcurar">Procurar</button></a>
        </form>
    </form>

    <datalist id="paragens">
        <div v-for="paragem in listaParagens">
            <option v-if="listaParagensFavoritas.includes(paragem)" v-bind:value="paragem" label="Favorito"></option>
            <option v-else v-bind:value="paragem"></option> 
        </div>
    </datalist>

</template>


<script>
import {BACKEND_IP} from '../store/consts'

import axios from 'axios'
import NavbarHome from '../components/NavbarHome.vue'

export default {
  name: 'App',

  components: {
    NavbarHome
  },

  data() {
        return {
            alert: false,
            message: '',
            tripType: '',
            partida: '',
            destino: '',
            diaPartida: '',
            horaPartida: '',
            listaParagens: [],
            listaParagensFavoritas: [],
            idUser : localStorage.getItem('idUser'),
            token: localStorage.getItem('jwt')
        }
    },

    created() {
        window.scrollTo(0, 0);

        console.log("ESTE È O IP")
        console.log(BACKEND_IP)

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

    },

    methods: {
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
                                        order: "default"
                                        } 
                                    });
            }

        }
    }
}

</script>

<style scoped>

.showcase {
    background: url("../assets/img/curvasAutocarro.png") repeat;
    background-position: absolute;
    background-size: 100% auto;

    padding: 240px 15% 120px 15%;
    color: white;
}

.showcase h1 {
    font-size: 40px;
    font-weight: 700;
    text-transform: uppercase;
}

.showcase hr {
    width: 100px;
    margin: auto;
    border-width: 3px;
}

.showcase p {
    font-size: 18px;
}

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

.viagem-info-form button {
    border: 1px solid #304536;
    color: #304536;
    background: none;
    padding: 20px 40px;
    font-size: 20px;
    cursor: pointer;
    margin-top: 70px;
    margin-bottom: 30px;
    transition: 0.8s;
    position: relative;
    overflow: hidden;
    text-transform: uppercase;
    letter-spacing: 1px;
    border-radius: 8px;
}

.viagem-info-form button:hover {
    color: #fff;
}

.viagem-info-form button::before {
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

.viagem-info-form button:hover::before{
    height: 180%;
}


.buttonAbout {
    appearance: none;
    background: none;
    border: none;
    outline: none;
  
    padding: 20px 40px;
    border-radius: 8px;
    color: white;
    font-size: 24px;
    font-weight: 600;
    margin-top: 50px;
    cursor: pointer;
    transition: 0.4s;
}

.buttonAbout {
    position: relative;
}

.buttonAbout:after {
    content: '';
    position: absolute;
    width: 0;
    height: 0;
    bottom: 0;
    right: 0;
    border-bottom: 3px solid white;
    border-right: 3px solid white;
    transition: all 0.4s, opacity 0.1s 0.4s;
    opacity: 0;
    border-radius: 4px;
}

.buttonAbout:before {
    content: '';
    position: absolute;
    width: 0;
    height: 0;
    top: 0;
    left: 0;
    border-top: 3px solid white;
    border-left: 3px solid white;
    transition: all 0.4s, opacity 0.1s 0.4s;
    opacity: 0;
    border-radius: 4px;
}

.buttonAbout:hover:after, .buttonAbout:hover:before {
    width: calc(100% + 15px);
    height: calc(100% + 15px);
    transition: all 0.4s, opacity 0.1s;
    opacity: 1;
}

@media only screen and (max-width:600px) {
    .viagem-form form label {
        float: none;
    }

    .viagem-form form label:last-child {
        float: none;
    }
}

@media only screen and (max-width:500px) {
    .w3-bar {
        flex-direction: column;
    }
}


</style>

