#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int vetor[15] = {5,10,11,64,4,7,54,12,8,55,19,61,51,13,0};

int main() {
	//sequencial();
	countingSort();
	binaria();
}

int sequencial() {
	int x, encontrado, indices[10];
	encontrado = 0;

	printf("Informe valor a ser procurado: ");
	scanf("%d", &x);

	for (int i = 0; i < 10; i++) {
		if (vetor[i] == x) {
			encontrado = 1;
			indices[i] = 1;
		}
	}
	if (encontrado == 1) {
		printf("Valor encontrado.\n");
		for (int i = 0; i < 10; i++) {
			if (indices[i] == 1) {
				printf("Indice %d\n", i);
			}
		}
	}
	else {
		printf("Valor nao encontrado.\n");
	}
}

int binaria() {
	int x, left, right, mid, encontrado;
	encontrado = 0;
	left = 0;
	right = 9;

	printf("Informe valor a ser procurado: ");
	scanf("%d", &x);

	mid = (left + right) / 2;

	while (encontrado != 1 && left <= right) {
		if (vetor[mid] == x) {
			encontrado = 1;
		}
		else if (x > vetor[mid]) {
			left = mid + 1;
			mid = (left + right) / 2;
		}
		else {
			right = mid - 1;
			mid = (left + right) / 2;
		}
	}
	if (encontrado == 1) {
		printf("Valor encontrado.");
	}
	else {
		printf("Valor nao encontrado.");
	}
}

int countingSort() {
	int output[10], size = 10;

	// Find the largest element of the array
	int max = vetor[0];
	for (int i = 1; i < size; i++) {
		if (vetor[i] > max)
			max = vetor[i];
	}

	// The size of count must be at least (max+1) but
	// we cannot declare it as int count(max+1) in C as
	// it does not support dynamic memory allocation.
	// So, its size is provided statically.
	int count[65];

	// Initialize count array with all zeros.
	for (int i = 0; i <= max; ++i) {
		count[i] = 0;
	}

	// Store the count of each element
	for (int i = 0; i < size; i++) {
		count[vetor[i]]++;
	}

	// Store the cummulative count of each array
	for (int i = 1; i <= max; i++) {
		count[i] += count[i - 1];
	}

	// Find the index of each element of the original array in count array, and
	// place the elements in output array
	for (int i = size - 1; i >= 0; i--) {
		output[count[vetor[i]] - 1] = vetor[i];
		count[vetor[i]]--;
	}

	// Copy the sorted elements into original array
	for (int i = 0; i < size; i++) {
		vetor[i] = output[i];
	}
}