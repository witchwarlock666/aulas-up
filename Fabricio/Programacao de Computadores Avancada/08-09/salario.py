import os
from tokenize import tabsize

cont = True

tabIR = [1903.98, 2826.65, 3751.05, 4664.68]
tabINSS = [1212.0, 2427.35, 3641.03, 7087.22]

while cont:
    nome = input("Funcionário: ")
    hr = int(input("Horas trabalhadas: "))
    valHr = int(input("Valora da hora: "))

    bruto = valHr * hr
    ir = 0
    if bruto > tabIR[3]:
        ir = 869.36 - (bruto / 100 * 27.5)
    elif bruto > tabIR[2]:
        ir = 636.13 - (bruto / 100 * 22.5)
    elif bruto > tabIR[1]:
        ir = 354.80 - (bruto / 100 * 15)
    elif bruto > tabIR[0]:
        ir = 142.80 - (bruto / 100 * 7.5)
    
    inss = 0
    if bruto > tabINSS[2]:
        inss = bruto / 100 * 14
    elif bruto > tabINSS[1]:
        inss = bruto / 100 * 12
    elif bruto > tabINSS[0]:
        inss = bruto / 100 * 9
    else:
        inss = bruto / 100 * 7.5

    fgts = bruto / 100 * 8

    liquido = bruto - ir - inss - fgts

    print(f"Salário Bruto: {bruto}\n")
    print(f"IR: {ir}\n")
    print(f"INSS: {inss}\n")
    print(f"FGTS: {fgts}\n")
    print(f"Salário Liquido: {liquido}\n")

    cont2 = True
    while cont2:
        x = input("Continuar? (s/n) ").upper()
        if x in "SN":
            cont2 = False
            if x == "N":
                cont = False
        else:
            print("Digite um valor válido")
