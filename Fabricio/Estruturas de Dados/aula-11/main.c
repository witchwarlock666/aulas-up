#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

typedef struct {
	char id[100];
	char nome[100];
	char telefone[100];
	char email[100];
} contato;

//sprintf(str, "%d", 42);

int main() {
	int i = 0;
	contato contato[50];
	int continuar = 1;
	while (continuar != 0){
		int n;
		printf("\n1) Cadastrar\n2) Buscar\n0) Sair\n");
		scanf("%d", &n);

		switch (n)
		{
		case 0:
			continuar = 0;
			break;
		case 1:
			cadastrar(&contato[i], i+1);
			/*printf("Id do contato: %s\n", contato[i].id);
			printf("Nome do contato: %s\n", contato[i].nome);
			printf("Telefone do contato: %s\n", contato[i].telefone);
			printf("Email do contato: %s\n", contato[i].email);*/
			i++;
			break;
		case 2:
			buscar(&contato);
			break;
		}
	}
}

int cadastrar(contato* contato, int id){
	sprintf(contato->id, "%d", id);;
	printf("\nDigite o nome do contato:\n");
	scanf(" %99[^\n]", &contato->nome);
	printf("\nDigite o telefone do contato:\n");
	scanf(" %99[^\n]", &contato->telefone);
	printf("\nDigite o email do contato:\n");
	scanf(" %99[^\n]", &contato->email);
}

int buscar(contato vetor[]) {
	int encontrado, indices[50];
	encontrado = 0;
	char x[100];

	printf("\nInforme valor a ser procurado: ");
	scanf(" %99[^\n]", &x);

	for (int i = 0; i < 50; i++) {
		if (strcmp(vetor[i].id, x) == 0) {
			encontrado = 1;
			indices[i] = 1;
		}
		if (strcmp(vetor[i].nome, x) == 0) {
			encontrado = 1;
			indices[i] = 1;
		}
		if (strcmp(vetor[i].telefone, x) == 0) {
			encontrado = 1;
			indices[i] = 1;
		}
		if (strcmp(vetor[i].email, x) == 0) {
			encontrado = 1;
			indices[i] = 1;
		}
	}
	if (encontrado == 1) {
		printf("\nValor encontrado.\n");
		for (int i = 0; i < 50; i++) {
			if (indices[i] == 1) {
				printf("\nId do contato: %s\n", vetor[i].id);
				printf("Nome do contato: %s\n", vetor[i].nome);
				printf("Telefone do contato: %s\n", vetor[i].telefone);
				printf("Email do contato: %s\n", vetor[i].email);
			}
		}
	}
	else {
		printf("\nValor nao encontrado.\n");
	}
}