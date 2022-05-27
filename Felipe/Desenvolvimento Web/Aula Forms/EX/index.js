function checkpsw(){
    var psw = document.getElementById("psw").value;
    var cpsw = document.getElementById("confirmpsw").value;
    if(psw == cpsw){
        alert("Senha correta, Ednaldo Pereira, valeu!");
    }
    else{
        alert("Senha incorreta, tem que ser igual as duas, BURRO");
    }
}