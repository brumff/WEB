var nomePet = document.getElementById("nomePet").value;

document.getElementById("nomePet").addEventListener("keypress",()=>validarNome());
document.getElementById("idadePet").addEventListener("keypress",()=>validarIdade());
document.getElementById("pesoPet").addEventListener("keypress",()=>validarPeso());
document.getElementById("racaPet").addEventListener("keypress",()=>validarRaca());
document.getElementById("corPet").addEventListener("keypress",()=>validarCor());

function validar(){
    validarNome();
    validarIdade();
    validarPeso();
    validarRaca();
    validarCor();
}
function validarNome(){
    if(document.getElementById("nomePet").value == ""){
        document.getElementById("nomePet").className = "form-control  is-invalid";
    }else{
        document.getElementById("nomePet").className = "form-control";
    }
}
function validarIdade(){
    if(document.getElementById("idadePet").value == ""){
        document.getElementById("idadePet").className = "form-control  is-invalid";
    }else if(document.getElementById("idadePet").value < 0){
        document.getElementById("erro-idade").textContent = "Informe uma idade valida";
    } else {
        document.getElementById("idadePet").className = "form-control";
    }
}
function validarPeso(){
    if(document.getElementById("pesoPet").value == ""){
        document.getElementById("pesoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("pesoPet").className = "form-control";
    }
}
function validarRaca(){
    if(document.getElementById("racaPet").value == ""){
        document.getElementById("racaPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("racaPet").className = "form-control";
    }

}
function validarCor(){
    if(document.getElementById("corPet").value == ""){
        document.getElementById("corPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("corPet").className = "form-control";
    }
}
