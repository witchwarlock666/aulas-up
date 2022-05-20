const atv03 = () => {
    let n = parseInt(window.prompt("Informe o número desejado: "));

    window.alert("O número informado foi " + n + "\nO número anterior é " + (n - 1) + "\nO proximo número é " + (n + 1))
}

const atv06 = () => {
    let real = window.prompt("Informe o valor em reais");
    real.replace(",", ".");
    real = parseFloat(real);

    let cotacao = window.prompt("Informe o valor da cotação");
    cotacao.replace(",", ".");
    cotacao = parseFloat(cotacao);

    let dolar = real / cotacao;

    document.getElementById("mainp").innerHTML = "Valor convertido: $ " + dolar.toFixed(2); 
}
