import os

def aa():
    print("aa")
def bb():
    print("bb")
def cc():
    print("cc")

# nome = input("Informe o nome do aluno: ")
# n1 = float(input("Informe a nota 1: "))
# n2 = float(input("Informe a nota 2: "))
# n3 = float(input("Informe a nota 3: "))
# n4 = float(input("Informe a nota 4: "))
# media = (n1 + n2 + n3 + n4) / 4

# os.system('cls')

# print("Media: ", media)

# if media >= 7:
#     print("O aluno está aprovado")
# elif media < 2.5:
#     print("O aluno está reprovado")
# else:
#     print("O aluno está em recuperação")

x = {
    "1": aa,
    "2": bb,
    "3": cc
}
a = True
while a:
    y = input("Digite uma opção: ")
    try:
        x[y]()
        a = False
    except:
        print("Digite um numero valido")

print("Fim do Programa")