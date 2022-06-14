#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main() {
	//ex1();
	//ex2();
	ex3();
}

int ex1() {
	FILE* file;

	file = fopen("exemplo_01.txt", "w");

	if (file != NULL) {
		fprintf(file, "aaaaaaaaaaaaa aaaa");
		fclose(file);
	}
	else {
		printf("Se fodeu");
	}
}

int ex2() {
	FILE *file;
	int i;

	file = fopen("exemplo_02.txt", "w");

	if (file != NULL) {
		for (i = 0; i < 10; i++) {
			fprintf(file, "%d", i);
		}
		fclose(file);
	}
	else {
		printf("Se fodeu");
	}
}

int ex3() {
	FILE* file;
	int i;
	char texto[21];

	file = fopen("exemplo_01.txt", "r");

	if (file != NULL) {
		fscanf(file, "%[^\n]s", &texto);
		fclose(file);
	}
	else {
		printf("Se fodeu");
	}

	printf("%s", texto);
}
