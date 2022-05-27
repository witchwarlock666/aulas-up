const ex1 = () => {
    let nome = document.getElementById("primeiroNome").value;
    let sobrenome = document.getElementById("sobrenome").value;

    let message = 'Olá ' + nome + " " + sobrenome + ".";
    let div = document.getElementById("mes-div");

    text = document.getElementById("message");
    text.innerHTML = message;
    div.style.display = "block"
}

const aaa = (e) => {
    let text = e.value;

}