<template>

    <!-- Navbar -->
    <header id="navBarHome">
        <div class="w3-top">
            <div class="w3-bar w3-mobile">
                <router-link to="/" class="w3-bar-item w3-hover-none w3-right w3-mobile">
                    <img src="../assets/img/logoBranco.png" alt="BusPrime" id="imageLogo">
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

<style scoped>

.w3-bar {
    background-color: transparent;
    display: flex;
    align-items: center;
    padding: 30px 5% 30px 5%;
    transition: 0.7s;
}

.w3-bar img {
    height: 40px;
    width: auto;
}

.w3-bar .nav-vertical-align-center {
    margin-left: auto;
    font-size: 20px;
    color: white;
}

.w3-bar a {
    display: inline-block;
    padding-bottom: 0.5rem;
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
    background-color: white;
    transition: width 0.25s ease-out;
}

.w3-bar a:hover::before {
    margin-left: 5%;
    width: 90%;
}

.scrolling-active {
    background-color: #fff;
    box-shadow: 0 3px 1rem rgba(0,0,0,.1);
    padding: 20px 5% 20px 5%;
}

.scrolling-active .nav-vertical-align-center {
    color: black;
}

.scrolling-active a::before {
    background-color: black;
}

.scrolling-active img {
    height: 40px;
}

@media only screen and (max-width:500px) {
    .w3-bar {
        flex-direction: column;
    }
}

</style>
