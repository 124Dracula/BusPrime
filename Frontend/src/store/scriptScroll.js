window.addEventListener('scroll', afterScroll)

function afterScroll() {
    let header = document.getElementById('navBarHome').getElementsByClassName('w3-bar')[0];
    let windowPosition = window.scrollY > 0;

    header.classList.toggle('scrolling-active', windowPosition);
    
    if (window.scrollY == 0) {
        document.getElementById("imageLogo").src="./src/assets/img/logoBranco.png";
    } else {
        document.getElementById("imageLogo").src="./src/assets/img/logoPreto.png";
    }
}