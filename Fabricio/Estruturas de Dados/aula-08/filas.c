#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

static int* vet;

int main()
{
	int primeiro = -1;
	int ultimo = -1;
	int x, n;

	x = 5;

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
				add(&primeiro, &ultimo, x);
				break;
			case 2:
				rem(&primeiro, &ultimo, x);
				break;
			case 3:
				list(&primeiro, &ultimo);
				break;
		}

	} while (n != 4);

	return 0;
}

int menu() {
	printf("1) Adicionar elemento\n2) Remover elemento\n3) Listar elementos\n4) Sair\n");
}

int add(int* primeiro, int* ultimo, int x) {
	if (*ultimo < x - 1) {
		*ultimo += 1;
		int val;
		printf("Digite o valor a adicionar: ");
		scanf("%d", &val);
		vet[*ultimo] = val;
		printf("\n");
		if (*primeiro == -1) {
			*primeiro = 0;
		}
	}
	else {
		printf("Fila cheia\n\n");
	}
}

int rem(int* primeiro, int* ultimo, int x) {
	if (*primeiro > -1) {
		vet[*primeiro] = 0;
		*primeiro += 1;
		printf("Removido com sucesso\n\n");
		if (*primeiro >= x) {
			*primeiro = -1;
			*ultimo = -1;
		}
	}
	else {
		printf("Pilha vazia\n\n");
	}
}

int list(int* primeiro, int* ultimo) {
	if (*primeiro > -1) {
		for (int i = *primeiro; i <= *ultimo; i++) {
			printf("%d\n", vet[i]);
		}
		printf("\n");
	}
	else {
		printf("Pilha vazia\n\n");
	}
}
