function togglePopupTerminateSession() {
    document.getElementById("popup-session").classList.toggle("active");
}

function togglePopupNewFavoriteStation() {
    document.getElementById("popup-new-favorite-station").classList.toggle("active");
}

function toggleEliminateStation() {
    document.getElementById("popup-delete-station").classList.toggle("active");
}

function toggleEliminatePercurso() {
    document.getElementById("popup-delete-precurso").classList.toggle("active");
}

function toggleGoToPrecurso() {
    document.getElementById("popup-go-to-precurso").classList.toggle("active");
}

function togglePopupAcrescentaDinheiro() {
    document.getElementById("popup-acrescenta-dinheiro").classList.toggle("active");
}

function togglePopupQrCode() {
    document.getElementById("popup-mostraQrCode").classList.toggle("active");
}


export {
    togglePopupTerminateSession, 
    togglePopupNewFavoriteStation,
    toggleEliminateStation,
    toggleEliminatePercurso,
    toggleGoToPrecurso,
    togglePopupAcrescentaDinheiro,
    togglePopupQrCode
};