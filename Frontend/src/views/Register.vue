<template>
    <NavbarDefault/>
    <form class="login-info-form w3-mobile" @submit.prevent="register">
        <h1>Registar</h1>
        <div class="campoDados">
            <p v-if="alert" class="alert" style="color: red">{{this.message}}</p>
            <input id="username" v-model="username" type="text" placeholder="Username" required><br>
            <input id="email" v-model="email" type="email" placeholder="E-mail" required><br>
            <input id="password1" v-model="password1" type="password" placeholder="Password" required><br>
            <input style="margin-top: -10px ;" id="password2" v-model="password2" type="password" placeholder="Repeat Password" required><br>
        </div>
        <div class="butoesAcceptBack" style="margin-bottom: 50px;">
            <router-link to="/"><button class="buttonCancel">Cancel</button></router-link>
            <a><button class="buttonAccept">Register</button></a>
        </div>
    </form>
</template>

<script>

import axios from 'axios'
import NavbarDefault from '../components/NavbarDefault.vue'

export default {
    name: 'App',

    created() {
        window.scrollTo(0, 0);
    },

    components: {
        NavbarDefault,
    },

    data() {
        return {
            email: '',
            username: '',
            password1: '',
            password2: '',
            errors: [],
            alert: false
        }
    },

    methods: {

        register () {

            this.alert = false
            this.message = ''

            let utilizador = { }
            utilizador['email'] = this.email
            utilizador['username'] = this.username
            utilizador['password'] = this.password1

            console.log(utilizador)

            if (this.password1 === this.password2) {
                axios.post("http://localhost:8080/utilizador/registar", utilizador)
                .then(data => {
                            this.alert = false
                            console.log(data)
                            this.$router.push({ name: 'login' });
                        })
                        .catch(() => {
                            this.alert = true
                            this.message = 'Não é possível criar este Utilizador! (Username ou e-mail já utilizados)'
                        })
            }
            else {
                this.alert = true
                this.message = 'Passwords não são iguais!'
            }
            
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