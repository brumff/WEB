/*atualiza campo*/
document.getElementById("nomePet").addEventListener("keypress",()=>validarNome());
document.getElementById("idadePet").addEventListener("keypress",()=>validarIdade());
document.getElementById("pesoPet").addEventListener("keypress",()=>validarPeso());
document.getElementById("racaPet").addEventListener("keypress",()=>validarRaca());
document.getElementById("corPet").addEventListener("keypress",()=>validarCor());
/*realiza validação ao clicar no botão enviar*/
function validar(){
    validarNome();
    validarIdade();
    validarPeso();
    validarRaca();
    validarCor();
}
function validarNome(){
    if(document.getElementById("nomeDoDonoPet").value == ""){
        document.getElementById("nomeDoDonoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("nomeDoDonoPet").className = "form-control  is-valid";
    }
}
function validarIdade(){
    if(document.getElementById("idadePet").value == ""){
        document.getElementById("idadePet").className = "form-control  is-invalid";
    }else if(document.getElementById("idadePet").value < 0){
        document.getElementById("erro-idade").textContent = "Informe uma idade valida";
    } else {
        document.getElementById("idadePet").className = "form-control  is-valid";
    }
}
function validarPeso(){
    if(document.getElementById("pesoPet").value == ""){
        document.getElementById("pesoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("pesoPet").className = "form-control  is-valid";
    }
}
function validarRaca(){
    if(document.getElementById("racaPet").value == ""){
        document.getElementById("racaPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("racaPet").className = "form-control  is-valid";
    }

}
function validarCor(){
    if(document.getElementById("corPet").value == ""){
        document.getElementById("corPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("corPet").className = "form-control  is-valid";
    }
}
