function ex_01(){
    var nome = document.getElementById("nome").value;
    alert("Seu nome é "+ nome);
}
function ex_02(){
    var tamanho = document.getElementById("volume").value;
    alert("Tamanho do cu: "+ tamanho);
}
function ex_03(){
    var text = document.getElementById("comentarios").value;
    var resto = 150 - (text.length);
    resto = document.getElementById("restante").innerHTML = `Restam ${resto} caracteres.`;
}