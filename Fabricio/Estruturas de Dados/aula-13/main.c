#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct clientes
{
	int id;
	int num_conta;
	char nome[20], sobrenome[20];
	float saldo;
} tipo_cliente;

int index = 1;

//int main()
//{
//	FILE* arq;
//	char continuar;
//	tipo_cliente clientes;
//	arq = fopen("clientes.txt", "w");
//	if (arq != NULL)
//	{
//		do
//		{
//			printf("Numero conta: ");
//			scanf("%d", &clientes.num_conta);
//			printf("Nome: ");
//			scanf("%s", clientes.nome);
//			printf("Sobrenome: ");
//			scanf("%s", clientes.sobrenome);
//			printf("Saldo: ");
//			scanf("%f", &clientes.saldo);
//
//			fwrite(&clientes, sizeof(clientes), 1, arq);
//
//			printf("Continuar (S/N): ");
//			scanf(" %c", &continuar);
//		} while (continuar == 's' || continuar == 'S');
// 
//		fclose(arq);
//	}
//	else
//	{
//		printf("Erro na abertura do arquivo.");
//	}
//}

//int main()
//{
//	FILE* arq;
//	tipo_cliente clientes;
//	arq = fopen("clientes.txt", "r");
//	if (arq != NULL)
//	{
//		while (fread(&clientes, sizeof(clientes), 1, arq))
//		{
//			printf("Numero da conta: %d\nNome: %s\nSobrenome: %s\nSaldo: %.2f\n\n",
//				clientes.num_conta, clientes.nome, clientes.sobrenome,
//				clientes.saldo);
//		}
//		fclose(arq);
//	}
//	else
//	{
//		printf("Erro na abertura do arquivo.");
//	}
//}

void flush_in() {
	int ch;
	while ((ch = fgetc(stdin)) != EOF && ch != '\n') {}
}

int main() {
	int op;

	do {
		op = menu();

		system("cls");

		switch (op)
		{
		case 1:
			newContact();
			break;
		case 2:
			listContacts();
			break;
		case 3:
			editContact();
			break;
		case 4:
			deleteContact();
		}
	} while (op != 0);
}

int newContact() {
	FILE* file;
	tipo_cliente clientes;
	file = fopen("clientes.txt", "a");

	clientes.id = index;
	index++;
	printf("Numero conta: ");
	scanf("%d", &clientes.num_conta);
	printf("Nome: ");
	scanf("%s", clientes.nome);
	printf("Sobrenome: ");
	scanf("%s", clientes.sobrenome);
	printf("Saldo: ");
	scanf("%f", &clientes.saldo);
		
	fwrite(&clientes, sizeof(clientes), 1, file);
		 
	fclose(file);
}

int listContacts() {
	FILE* file;
	tipo_cliente clientes;
	file = fopen("clientes.txt", "r");

	if (file != NULL) {
		while (fread(&clientes, sizeof(clientes), 1, file))
		{
			printf("Id: %d\nNumero da conta: %d\nNome: %s\nSobrenome: %s\nSaldo: %.2f\n\n", 
				clientes.id, clientes.num_conta, clientes.nome, 
				clientes.sobrenome, clientes.saldo);
		}
		system("pause");
		fclose(file);
	}
	else {
		printf("Erro na abertura do arquivo.");
	}
}

int deleteContact() {
	FILE* file;
	FILE* file_t;
	int id;
	tipo_cliente clientes;
	file = fopen("clientes.txt", "r");
	file_t = fopen("clientes_temp.txt", "w");

	printf("Id de Cliente: ");
	scanf("%d", &id);

	while (fread(&clientes, sizeof(clientes), 1, file))
	{
		if (clientes.num_conta != id) {
			fwrite(&clientes, sizeof(clientes), 1, file_t);
		}
	}
	fclose(file);
	fclose(file_t);

	remove("clientes.txt");

	file = fopen("clientes.txt", "w");
	file_t = fopen("clientes_temp.txt", "r");

	while (fread(&clientes, sizeof(clientes), 1, file_t))
	{
		fwrite(&clientes, sizeof(clientes), 1, file);
	}

	fclose(file);
	fclose(file_t);
}

int editContact() {
	FILE* file;
	FILE* file_t;
	int id;
	tipo_cliente clientes;
	file = fopen("clientes.txt", "r");
	file_t = fopen("clientes_temp.txt", "a");

	printf("Id de Cliente: ");
	scanf("%d", &id);

	while (fread(&clientes, sizeof(clientes), 1, file))
	{
		if (clientes.num_conta == id) {
			printf("Numero conta: ");
			scanf("%d", &clientes.num_conta);
			printf("Nome: ");
			scanf("%s", clientes.nome);
			printf("Sobrenome: ");
			scanf("%s", clientes.sobrenome);
			printf("Saldo: ");
			scanf("%f", &clientes.saldo);
		}

		fwrite(&clientes, sizeof(clientes), 1, file_t);
	}
	fclose(file);
	fclose(file_t);

	remove("clientes.txt");

	file = fopen("clientes.txt", "a");
	file_t = fopen("clientes_temp.txt", "r");

	while (fread(&clientes, sizeof(clientes), 1, file_t))
	{
		fwrite(&clientes, sizeof(clientes), 1, file);
	}
	remove("clientes_temp.txt");

	fclose(file);
	fclose(file_t);
}

int menu() {

	int op;
	do {
	system("cls");
	printf("====== Controle de Cliente ======\n");
	printf("\n       ------- MENU -------\n\n");
	printf(" [ 1 ] Novo Cliente \n");
	printf(" [ 2 ] Listar Cliente \n");
	printf(" [ 3 ] Editar Cliente \n");
	printf(" [ 4 ] Excluir Cliente \n");
	printf(" [ 0 ] Sair \n");

	printf("\n Informe uma Opcao: ");
	scanf("%d", &op);
	flush_in();
	} while (op < 0 || op > 4);

	return op;
}
