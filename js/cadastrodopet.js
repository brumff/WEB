const formulario = document.querySelector("form");
const InomeDoPet = document.querySelector(".form-control");
const IidadePet = document.querySelector(".form-control");
const Idtnascpet = document.querySelector(".form-control");
const Ipesopet = document.querySelector(".form-control");
const IracaDoPet = document.querySelector(".form-control");
const IcorDoPet = document.querySelector(".form-control");

formulario.addEventListener('submit', function (event){
    event.preventDefault();

    console.log(IidadePet.value);
});
