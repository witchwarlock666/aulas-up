function main(){
    var CotacaoDolar
    var ValorReal
    var ValorDolar
    CotacaoDolar = parseFloat(prompt("Informe a cotação em dolar atual: "));
    ValorReal = parseFloat(prompt("informe a quantia em reais: "));
    ValorDolar =  ValorReal / CotacaoDolar;
    document.getElementById("parágrafo").innerHTML = ("O valor em dólares é: $" + ValorDolar ); 

}