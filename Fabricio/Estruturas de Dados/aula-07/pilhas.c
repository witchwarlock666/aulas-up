#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

static int* vet;

int main(int* p)
{
	int topo = -1;
	int x, n;

	printf("Digite o tamanho maximo da sua pilha: ");
	scanf("%d", &x);
	printf("\n");

	vet = (int*)calloc(x * sizeof(int));

	do {

		/*printf("%d\n", topo);
		for (int i = 0; i <= topo; i++) {
			printf("%d\n", vet[i]);
		}*/
		menu();
		scanf("%d", &n);
		printf("\n");

		switch (n) {
			case 1: 
				add(&topo, x);
				break;
			case 2:
				rem(&topo);
				break;
			case 3:
				first(&topo);
				break;
			case 4:
				last(&topo);
				break;
			case 5:
				search(&topo);
				break;
			case 6:
				list(&topo);
				break;
		}

	} while (n != 7);

	return 0;
}

int menu() {
	printf("1) Adicionar elemento\n2) Remover elemento\n3) Mostrar primeiro elemento\n4) Mostrar ultimo elemento\n5) Buscar elemento\n6) Listar elementos\n7) Sair\n");
}

int add(int* topo, int x) {
	if (*topo < x - 1) {
		*topo += 1;
		int val;
		printf("Digite o valor a adicionar: ");
		scanf("%d", &val);
		vet[*topo] = val;
		printf("\n");
	}
	else {
		printf("Pilha cheia\n\n");
	}
}

int rem(int* topo) {
	if (*topo > -1) {
		vet[*topo] = 0;
		*topo -= 1;
		printf("Removido com sucesso\n\n");
	}
	else {
		printf("Pilha vazia\n\n");
	}
}

int first(int* topo) {
	if (*topo > -1) {
		printf("Valor: %d\n", vet[0]);
		printf("\n\n");
	}
	else {
		printf("Pilha vazia\n");
	}
}

int last(int* topo) {
	if (*topo > -1) {
		printf("Valor: %d\n", vet[*topo]);
		printf("\n\n");
	}
	else {
		printf("Pilha vazia\n");
	}
}

int search(int* topo) {
	if (*topo > -1) {
		int x;
		printf("Digite o indice para buscar: ");
		scanf("%d", &x);
		if (x > *topo || x < 0) {
			printf("Indice não encontrado\n\n");
		}
		else {
			printf("Valor: %d\n\n", vet[x]);
		}
	}
	else {
		printf("Pilha vazia\n\n");
	}
}

int list(int* topo) {
	if (*topo > -1) {
		for (int i = 0; i <= *topo; i++) {
			printf("%d\n", vet[i]);
		}
		printf("\n");
	}
	else {
		printf("Pilha vazia\n\n");
	}
}
