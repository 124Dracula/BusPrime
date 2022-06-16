<template>
    <NavbarDefault/>
    <section class="profile-info w3-mobile">
        <h1>Carteira do Utilizador</h1>

        <h2>Dinheiro Atual:</h2>
        <h3>{{this.dinheiro}} €</h3>

        <div class="butoesAcceptBack" style="margin-bottom: 50px;">
            <router-link to="/perfil"><button class="buttonParagens">Voltar ao Perfil</button></router-link>
            <a v-on:click="togglePopupAcrescentaDinheiro()"><button class="buttonPercursos">Adicionar Dinheiro</button></a>
        </div>
    </section>


    <!-- Pop-up ask to leave -->
    <div class="popup" ref="popupAcrescentaDinheiro">
        <div class="overlay">
            <form class="overlayContent" @submit.prevent="acrescentaDinheiro">  
                <label for="partida">Quantidade Monetária a acrescentar</label>
                <input id="dinheiroAcrescentado" v-model="dinheiroAcrescentado" type="number" placeholder="Dinheiro a Acrescentar" required>

                <div class="butoesAcceptBack">
                    <a v-on:click="togglePopupAcrescentaDinheiro()"><button type="button" class="buttonCancelar">Cancelar</button></a>
                    <a><button class="buttonAceitar">Adicionar</button></a>
                </div>
            
            </form>
        </div>	
    </div>
</template>

<script>

import axios from 'axios'
import NavbarDefault from '../components/NavbarDefault.vue'

export default {
    name: 'App',

    data() {
        return {
            dinheiro: '',
            dinheiroAcrescentado: '',
            username : '',
            idUser : localStorage.getItem('idUser'),
            token: localStorage.getItem('jwt')
        }
    },

    created() {
        window.scrollTo(0, 0);

        axios({
                method : "get",
                url: "http://localhost:8080/utilizador/" + this.idUser
        })
        .then(data => {
                    this.dinheiro = data.data.saldo
                })
                .catch(err => {
                    console.log(err)
                })
    },


    components: {
        NavbarDefault
    },

    methods: {

        togglePopupAcrescentaDinheiro() {
            this.$refs.popupAcrescentaDinheiro.classList.toggle("active");
            this.$router.push({ name: 'carteira' });

        },

        acrescentaDinheiro() {

            let utilizador = {}
            utilizador['username'] = this.username
            utilizador['dinheiro'] = this.dinheiroAcrescentado

            axios({
                method : "post",
                url: "http://localhost:8080/utilizador/depositar/" + this.idUser,
                headers: { "Authorization" : this.token },
                data: utilizador
            })
            .then(data => {
                        this.$refs.popupAcrescentaDinheiro.classList.toggle("active")
                        
                        this.dinheiro = data.data.saldo
                    })
                    .catch(() => {
                        console.log('Não foi possível depositar o dinheiro!');
                    })
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