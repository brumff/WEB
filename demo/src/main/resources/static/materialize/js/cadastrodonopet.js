/*verificar se e-mail é valido*/
/*atualiza campo*/
document.getElementById("nomeDonoPet").addEventListener("keypress",()=>validarNome());
document.getElementById("cpfDono").addEventListener("keypress",()=>validarCPF());
document.getElementById("telefoneDono").addEventListener("keypress",()=>validarTelefone());
document.getElementById("dtNascDonoPet").addEventListener("keypress",()=>validarNasc());
document.getElementById("emailDonoDoPet").addEventListener("keypress",()=>validarEmail());
document.getElementById("senhaDonoDoPet").addEventListener("keypress",()=>validarSenha());
document.getElementById("confSenhaDonoDoPet").addEventListener("keypress",()=>validarConfSenha());
/*realiza validação ao clicar no botão enviar*/
function validar(){
    validarNome();
    validarCPF();
    validarTelefone();
    validarNasc();
    validarEmail();
    validarSenha();
    validarConfSenha()
}
function validarNome(){
    if(document.getElementById("nomeDonoPet").value == ""){
        document.getElementById("nomeDonoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("nomeDonoPet").className = "form-control";
    }
}
function validarCPF(){
    if(document.getElementById("cpfDono").value == ""){
        document.getElementById("cpfDono").className = "form-control  is-invalid";
    } else if (document.getElementById("cpfDono").value != null ){
        document.getElementById("cpfDono").className = "form-control";
        /*Incluir validação CPF*/
    } else{
        document.getElementById("cpfDono").className = "form-control";
    }
}
function validarTelefone(){
    if(document.getElementById("telefoneDono").value == ""){
        document.getElementById("telefoneDono").className = "form-control  is-invalid";
    }else{
        document.getElementById("telefoneDono").className = "form-control";
    }
}
function validarNasc(){
    if(document.getElementById("dtNascDonoPet").value == ""){
        document.getElementById("dtNascDonoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("dtNascDonoPet").className = "form-control";
    }

}
function validarEmail(){
    if(document.getElementById("emailDonoDoPet").value == ""){
        document.getElementById("emailDonoDoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("emailDonoDoPet").className = "form-control";
    }
}
function validarSenha(){
    if(document.getElementById("senhaDonoDoPet").value == ""){
        document.getElementById("senhaDonoDoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("senhaDonoDoPet").className = "form-control";
    }
}
function validarConfSenha(){
    if(document.getElementById("confSenhaDonoDoPet").value == ""){
        document.getElementById("confSenhaDonoDoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("confSenhaDonoDoPet").className = "form-control";
    }
}
