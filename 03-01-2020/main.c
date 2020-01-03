#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "calculation.h"
#include <string.h>
#include <conio.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void showDetailArray(const double *y, const int n) {
	//In ra xem chua chua	
	int i;
	for(i = 0; i < n; i++){
		printf("\nPhan tu thu %d la: %0.2lf", i+1, *(y+i));		
	}
}

void swap(double *a, double *b) {
	double temp = *a;
	*a = *b;
	*b = temp;				
}
int findNumber(double x, double *numbers, int n) {
	int i;
	for(i = 0; i< n; i++){
		if(*(numbers +i) == x) {
			return i;
		}
	}
	return -1;
}

int* findSomeNumbers(double x, double *numbers, int n) {
	int i, numberOfFoundNumbers;
	int *result;
	for(i = 0; i< n; i++){
		if(*(numbers +i) == x) {
			numberOfFoundNumbers++;					
		}
	}
	result = (int *) malloc(sizeof(int) * numberOfFoundNumbers);
	int j = 0;
	for(i = 0; i< n; i++){
		if(*(numbers +i) == x) {
			*(result + j) = i;
			j++;			
		}
	}	
	return result;
}
void sortAnArray(double *y, const int n, char choice) {
	int i, j;
	for(i = 0; i < n-1; i++){
		for(j = i + 1; j < n; j++){
			bool check = (choice == 't') ? (*(y + i) > *(y + j)) : (*(y + i) < *(y + j));
			if(check){
				swap(y + i, y + j);			
			}
		}		
	}
}
void doSomething() {
	char choice;
	int *someNumbers;
	someNumbers = (int *)malloc(sizeof(int));
	int i = 0;
	do {
		int* ptr = someNumbers+i;
		printf("ptr = %p", ptr);
		
		printf("Nhap 1 so nguyen : \n"); scanf("%d", ptr);
		printf("\n data = %d", *ptr);
		i++;
		ptr = (int *)realloc(someNumbers, i*sizeof(int));
		printf("continue(y or n) ? "); 
		fflush(stdin);
		choice = getchar();
	} while(choice == 'y');
	printf("thoi ko choi nua");
	printf("ptr = %p, data = %d", someNumbers, *someNumbers);
	printf("ptr = %p, data = %d", someNumbers, *(someNumbers+1));
	/*
	int j;
	for(j = 0; j < i; j++) {
		printf("\nPhan tu thu %d la: %0.2lf", j, *(someNumbers+j));		
	}
	*/
}

int main(int argc, char *argv[]) {
	/*
	double *numbers;
	int n, i, j;
	printf("Enter number of float: "); scanf("%d", &n);
	numbers = (double *)malloc(sizeof(double) * n);
	for(i = 0; i < n; i++){
		printf("\nPhan tu thu %d la: ", i+1);
		scanf("%lf", numbers+i);
	}
	*/
	/*
	showDetailArray(numbers, n);
	sortAnArray(numbers, n, 't');
	printf("\nsau khi sap xep \n");
	showDetailArray(numbers, n);
	double x;
	printf("\nBan can tim so may ? "); scanf("%lf", &x);
	int foundIndex = findNumber(x, numbers, n);
	if(foundIndex > 0) {
		printf("Vi tri so can tim : %d", foundIndex);	
	} else {
		printf("ko tim thay so %0.2lf", x);
	}
	*/
	/*
	int *foundNumbers;
	foundNumbers = findSomeNumbers(2.00, numbers, n);
	printf("%d\n", *foundNumbers);	
	printf("%d\n", *(foundNumbers+1));	
	*/
	//doSomething();
	//function pointer
	printf("Tong cua 1 va 2 la %d", tong2So(1,2));
//	lamGiDo();
	char *name;
	name = (char *)malloc(sizeof(char) * 200);
	printf("Enter your name: "); gets(name);
	*(name + 3) = NULL;
	*(name + 4) = NULL;
	int i;
	for(i = 0; i < strlen(name); i++) {
		printf("%c", *(name + i));
	}
	char *str = (char *)malloc(sizeof(char));
	printf("Ban muon tim ky tu nao : "); *str = getchar();
	
	int numberOfFoundCharacters = 0;
	for(i = 0; i < strlen(name); i++) {
		if(*(name + i) == *str) {
			numberOfFoundCharacters++;
		}
	}
	printf("So ky tu tim thay la : %d", numberOfFoundCharacters);
	return 0;
}
