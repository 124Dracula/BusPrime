<template>
    <NavbarDefault/>
    <section class="aboutUs-info w3-mobile">
        <h1>Sobre nós</h1>

        <h3>Somos um grupo de estudantes no Mestrado de Engenharia Informática na Universidade do Minho.
            Pretendemos inovar o mundo dos transportes públicos e por isso, recorremos a este projeto constrúido no âmbito das
            disciplinas de <b>Arquiteturas Aplicacionais</b> e <b>Sistemas Interativos Confiáveis</b> decidimos amarrar esta oportunidade.
            Desta forma, constrúimos a <b>BusPrime!</b></h3>

        <div class="image-info">

            <div class="image">
                <img class="image__img" src="../assets/img/bruno.jpg" alt="Bruno">
                <div class="image__overlay image__overlay--primary">
                    <div class="image__title">PG47068</div>
                    <p class="image__description">
                        Bruno Filipe de Sousa Dias
                    </p>
                </div>
            </div>

            <div class="image">
                <img class="image__img" src="../assets/img/joao.png" alt="João">
                <div class="image__overlay image__overlay--primary">
                    <div class="image__title">PG47850</div>
                    <p class="image__description">
                        João Carlos Peixoto Freitas
                    </p>
                </div>
            </div>

            <div class="image">
                <img class="image__img" src="../assets/img/luis.jpg" alt="Luís">
                <div class="image__overlay image__overlay--primary">
                    <div class="image__title">A89474</div>
                    <p class="image__description">
                        Luis Filipe Cruz Sobral
                    </p>
                </div>
            </div>

            <div class="image">
                <img class="image__img" src="../assets/img/rui.jpeg" alt="Rui">
                <div class="image__overlay image__overlay--primary">
                    <div class="image__title">PG47630</div>
                    <p class="image__description">
                        Rui Alexandre da Costa Gonçalves
                    </p>
                </div>
            </div>

            <div class="image">
                <img class="image__img" src="../assets/img/tiago.jpeg" alt="Tiago">
                <div class="image__overlay image__overlay--primary">
                    <div class="image__title">PG47686</div>
                    <p class="image__description">
                        Tiago Araújo Alves
                    </p>
                </div>
            </div>

        </div>
        
        
    </section>
</template>

<script>
import {BACKEND_IP} from '../store/consts'

import NavbarDefault from '../components/NavbarDefault.vue'

export default {
    name: 'App',

    components: {
        NavbarDefault
    },

    created() {
        window.scrollTo(0, 0);
    }
}

</script>

<style scoped>
.aboutUs-info {
    padding-top: 180px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
}

.aboutUs-info h1 {
    font-size: 55px;
    font-weight: 700;
    text-transform: uppercase;
    letter-spacing: 1px;
}

.aboutUs-info h3 {
    width: 80%;
}

.aboutUs-info h4 {
    padding-top: 50px;
    font-weight: bold;
    width: 80%;
}

.aboutUs-info h5 {
    width: 80%;
}

.aboutUs-info .image-info {
    padding: 30px 0;
    text-align: center;
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    flex-flow: wrap;
    width: 80%;

}

.aboutUs-info .image {
    position: relative;
    width: 250px;
    float: left;
    margin: 20px 20px 20px 20px;
}

.aboutUs-info .image__img {
    display: block;
    width: 100%;
    border-radius: 8px;
    margin-left: auto;
}

.aboutUs-info .image__overlay {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(0, 0, 0, 0.6);
    color: #ffffff;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    opacity: 0;
    transition: opacity 0.25s;
    border-radius: 8px;
}

.aboutUs-info .image__overlay--blur {
    backdrop-filter: blur(5px);
}

.aboutUs-info .image__overlay--primary {
    background: gray;
}

.aboutUs-info .image__overlay > * {
    transform: translateY(20px);
    transition: transform 0.25s;
}

.aboutUs-info .image__overlay:hover {
    opacity: 1;
}

.aboutUs-info .image__overlay:hover > * {
    transform: translateY(0);
}

.aboutUs-info .image__title {
    font-size: 2em;
    font-weight: bold;
}

.aboutUs-info .image__description {
    font-size: 1.25em;
    margin-top: 0.25em;
    text-align: center;
}
</style>