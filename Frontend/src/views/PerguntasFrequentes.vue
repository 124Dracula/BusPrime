<template>
    <NavbarDefault/>
    <!-- Login stuff -->
    <section class="aboutUs-info w3-mobile">

        <h1>Perguntas Frequentes</h1>

        <h4>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla sit amet finibus orci, vitae ultrices eros?</h4>
        <h5>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla sit amet finibus orci, vitae ultrices eros. Cras condimentum eros id leo sollicitudin ultricies sit amet luctus est. Sed viverra ac dolor non bibendum. Aenean aliquam mi et pulvinar iaculis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</h5>

        <h4>Donec vestibulum magna ac odio fringilla pretium. Maecenas sit amet efficitur tellus, ac tristique sem?</h4>
        <h5>Donec vestibulum magna ac odio fringilla pretium. Maecenas sit amet efficitur tellus, ac tristique sem. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Praesent tincidunt ullamcorper nunc quis lacinia. Maecenas elementum enim ut orci vestibulum, sit amet porta eros luctus. Nunc aliquet ligula ut sapien malesuada, cursus tincidunt ante cursus.</h5>

    </section>
</template>


<script>

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
</style>