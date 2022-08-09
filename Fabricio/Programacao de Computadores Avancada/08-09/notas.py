from ctypes import sizeof
import os

cont = True
ap = 0
rep = 0
rec = 0
tot = 0
maior = {
    "Nome": "",
    "Nota": -1
}
menor = {
    "Nome": "",
    "Nota": 11
}
medias = []
while cont:
    os.system('cls')
    nome = input("Informe o nome do aluno: ")
    n1 = float(input("Informe a nota 1: "))
    n2 = float(input("Informe a nota 2: "))
    n3 = float(input("Informe a nota 3: "))
    n4 = float(input("Informe a nota 4: "))
    media = (n1 + n2 + n3 + n4) / 4

    if media >= 7:
        ap += 1
    elif media < 2.5:
        rep += 1
    else:
        rec += 1

    medias.append(media)

    if media > maior["Nota"]:
        maior["Nome"] = nome
        maior["Nota"] = media
    if media < menor["Nota"]:
        menor["Nome"] = nome
        menor["Nota"] = media
    
    tot += 1

    cont2 = True
    while cont2:
        x = input("Continuar? (s/n) ")
        if x == 'S' or x == 's':
            cont2 = False
        elif x == 'N' or x == 'n':
            cont2 = False
            cont = False
        else:
            print("Digite um valor válido")

medturma = 0
for i in range(0, len(medias)):
    medturma += medias[i]
medturma /= len(medias)

print(f"Número de alunos: {tot}\n")
print(f"Media da turma: {medturma}\n")
print(f"Número de alunos aprovados: {ap} / {(ap / tot) * 100}%\n")
print(f"Número de alunos reprovados: {rep} / {(rep / tot) * 100}%\n")
print(f"Número de alunos em recuperação: {rec} / {(rec / tot) * 100}%\n")
print(f"Maior média:\n\tNome: {maior['Nome']}\n\tMédia: {maior['Nota']}\n")
print(f"Menor média:\n\tNome: {menor['Nome']}\n\tMédia: {menor['Nota']}\n")