import os

folhas = []

def menu():
    os.system("cls")
    print("1) Criar Folha\n2) Remover Folha\n3) Calcular Salário\n4) Demonstrativo mês/ano\n0) Sair")

def create():
    nome = input("Funcionário: ")
    mes = int(input("Mês: "))
    mes = int(input("Ano: "))

def delete():
    pass

def sal():
    pass

def dem():
    pass

switch = {
    "1": create,
    "2": delete,
    "3": sal,
    "4": dem
}

if __name__ == "__main__":
    cont = True
    while cont:
        menu()
        x = input()
        if x == "0":
            cont = False
        else:
            switch[x]()