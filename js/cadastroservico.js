document.getElementById("nomeServico").addEventListener("keypress",()=>validarNome());
document.getElementById("descricaoServico").addEventListener("keypress",()=>validarDescricao());
document.getElementById("precoServico").addEventListener("keypress",()=>validarPreco());
/*mascara para preço*/
/*realiza validação ao clicar no botão enviar*/
function validar(){
    validarNome();
    validarDescricao();
    validarPreco();
}
function validarNome(){
    if(document.getElementById("nomeServico").value == ""){
        document.getElementById("nomeServico").className = "form-control  is-invalid";
    }else{
        document.getElementById("nomeServico").className = "form-control  is-valid";
    }
}
function validarDescricao(){
    if(document.getElementById("descricaoServico").value == ""){
        document.getElementById("descricaoServico").className = "form-control  is-invalid";
    }else{
        document.getElementById("descricaoServico").className = "form-control  is-valid";
    }
}
function validarPreco(){
    if(document.getElementById("precoServico").value == ""){
        document.getElementById("precoServico").className = "form-control  is-invalid";
    }else{
        document.getElementById("precoServico").className = "form-control  is-valid";
    }
}
/*validar os campos check */

