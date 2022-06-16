<template>
    <!-- Navbar -->
    <header id="navBar">
        <div class="w3-top">
            <div class="w3-bar w3-mobile">
                <router-link to="/" class="w3-bar-item w3-hover-none w3-right w3-mobile">
                    <img src="../assets/img/logoPreto.png" alt="BusPrime" id="imageLogo">
                </router-link>
                <span class = "nav-vertical-align-center w3-mobile">
                    <router-link to="/perfil" class="w3-bar-item w3-hover-none w3-right w3-mobile" v-if="logado">O meu Perfil</router-link>
                    <router-link to="/login" class="w3-bar-item w3-hover-none w3-right w3-mobile" v-else>Iniciar Sessão</router-link>
                    <router-link to="/perguntasFrequentes" class="w3-bar-item w3-hover-none w3-right w3-mobile">Perguntas Frequentes</router-link>
                </span>
            </div>
        </div>
    </header>
</template>

<script>

export default {
    name: 'App',

    created() {
        if (localStorage.getItem('jwt') != 'null')
            this.logado = true
    },

    data() {
        return {
            logado : false
        }
    }
}

</script>

<style>
.w3-bar {
    background-color: #fff;
    display: flex;
    align-items: center;
    box-shadow: 0 3px 1rem rgba(0,0,0,.1);
    padding: 20px 5% 20px 5%;
    transition: 0.7s;
}

.w3-bar img {
    height: 40px;
    width: auto;
}

.w3-bar .nav-vertical-align-center {
    margin-left: auto;
    font-size: 20px;
    color: black;
}

.w3-bar a {
    display: inline-block;
    padding-bottom: 0rem;
    position: relative;
    text-decoration: none;
}

.w3-bar a::before {
    content: "";
    position: absolute;
    left: 0;
    bottom: 0;
    width: 0;
    height: 2px;
    background-color: black;
    transition: width 0.25s ease-out;
}

.w3-bar a:hover::before {
    margin-left: 5%;
    width: 90%;
}

@media only screen and (max-width:500px) {
    .w3-bar {
        flex-direction: column;
    }
}

</style>