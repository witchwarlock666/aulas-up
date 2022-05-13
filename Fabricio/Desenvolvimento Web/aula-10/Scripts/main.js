let aa = document.getElementById('aa');
aa.addEventListener("click", aaa)
function aaa() {
    let a = document.getElementById('a');
    let string = '';
    for (let i = 1; i < 10000; i++) {
        string += 'a';
    }
    a.innerHTML = string;
}

let aaaa = '12';
aaaa = parseInt(aaaa);
console.log(typeof(aaaa));