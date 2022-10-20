/*mascara CPF*/
function mascara_cpf(){
    var cpf = document.getElementById("cpfDono")
    if(cpf.value.length == 3 || cpf.value.length == 7){
        cpf.value += "."
    }  else if(cpf.value.length == 11){
        cpf.value += "-"
    }
}
/*mascara para telefone */
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
        document.getElementById("nomeDonoPet").className = "form-control  is-valid";
    }
}
function validarCPF(){
    if(document.getElementById("cpfDono").value == ""){
        document.getElementById("cpfDono").className = "form-control  is-invalid";
    } else if (document.getElementById("cpfDono").value != null ){
        document.getElementById("cpfDono").className = "form-control  is-invalid";
        /*Incluir validação CPF*/
    } else{
        document.getElementById("cpfDono").className = "form-control  is-valid";
    }
}
function validarTelefone(){
    if(document.getElementById("telefoneDono").value == ""){
        document.getElementById("telefoneDono").className = "form-control  is-invalid";
    }else{
        document.getElementById("telefoneDono").className = "form-control  is-valid";
    }
}
function validarNasc(){
    if(document.getElementById("dtNascDonoPet").value == ""){
        document.getElementById("dtNascDonoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("dtNascDonoPet").className = "form-control  is-valid";
    }

}
function validarEmail(){
    if(document.getElementById("emailDonoDoPet").value == ""){
        document.getElementById("emailDonoDoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("emailDonoDoPet").className = "form-control  is-valid";
    }
}
function validarSenha(){
    if(document.getElementById("senhaDonoDoPet").value == ""){
        document.getElementById("senhaDonoDoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("senhaDonoDoPet").className = "form-control  is-valid";
    }
}
function validarConfSenha(){
    if(document.getElementById("confSenhaDonoDoPet").value == ""){
        document.getElementById("confSenhaDonoDoPet").className = "form-control  is-invalid";
    }else{
        document.getElementById("confSenhaDonoDoPet").className = "form-control  is-valid";
    }
}
