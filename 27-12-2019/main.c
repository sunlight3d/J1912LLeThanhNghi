#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int sum2Numbers(int x1, int x2) {
	//printf("\naddress of x1 = %p", &x1);
	return x1 + x2;
}
int multiply2Numbers(int* x1, int* x2) {
	//*x1 = 10;
	return (*x1) * (*x2);
}
void swap(int *x1, int *x2) {
	int temp;
	printf("Truoc khi sap xep: x1 = %d, x2 = %d\n", *x1, *x2);
	temp = *x1;
	*x1 = *x2;
	*x2 = temp;
	printf("Sau khi sap xep: x1 = %d, x2 = %d\n", *x1, *x2);
	
}
int main(int argc, char *argv[]) {
	/*
	int x = 10;
	printf("x = %d", x);
	int* y;
	y = &x; 
	//%p = pointer	
	printf("address of x = %p", &x);
	printf("\nDia chi of x = %p", y);
	printf("value at y = %d", y);
	//tinh tong 2 so nguyen
	
	int *a, *b;
	//Cap phat 1 o nho chua 1 so nguyen 
	a = (int *)malloc(sizeof(int)); //malloc = cap phat bo nho = memory allocation
	b = (int *)malloc(sizeof(int));
	printf("a = %p", a);
	printf("b = %p", b);
	*a = 1;
	*b = 2;
	printf("data at a = %d", *a);
	printf("data at b = %d", *b);
	int* c;
	c = a;
	printf("data at c = %d", *c);
	b = a;
	printf("data at b = %d", *b);
	//con tro nhieu o nho = array
	//khai bao mang so thuc co 4 phan tu
	float* numbers;
	numbers = (float *)malloc(4 * sizeof(float));
	printf("\ndia chi phan tu 0 = %p", numbers);
	printf("\ndia chi phan tu 1 = %p", numbers + 1);
	printf("\ndia chi phan tu 2 = %p", numbers + 2);
	printf("\ndia chi phan tu 3 = %p", numbers + 3);
	
	printf("\n gia tri phan tu 0 = %f", *numbers);
	printf("\n gia tri phan tu 1 = %f", *(numbers + 1));
	printf("\n gia tri phan tu 2 = %f", *(numbers + 2));
	printf("\n gia tri phan tu 3 = %f", *(numbers + 3));
	
	printf("\n gia tri phan tu 4 = %f", *(numbers + 4));
	
	int x1 = 2;
	int x2 = 3;
	printf("\naddress of x1 = %p", &x1);
	printf("Tong cua 2 va 3 = %d", sum2Numbers(x1, x2));
	printf("\nx1 = %d", x1);
	
	printf("Tich cua 2 va 3 = %d", multiply2Numbers(&x1, &x2));
	printf("Gia tri tai x1 = %d", x1);
	
	char choice;
	int* x;
	int* y;		
	x = (int *)malloc(sizeof(int));
	y = (int *)malloc(sizeof(int));
	//printf("value at x = %d", *x);
	do {
		printf("Enter your choice: "); scanf("%c", &choice);
		switch(choice) {
			case '1':
				printf("\n Bat dau tinh tong");
				printf("\nNhap so thu nhat:"); scanf("%d", x);
				printf("\nNhap so thu hai :"); scanf("%d", y);
				printf("\nTong 2 so = %d\n", sum2Numbers(*x, *y));
				break;
			case '2':
				printf("\n Bat dau tinh tich");
				printf("\nNhap so thu nhat:"); scanf("%d", x);
				printf("\nNhap so thu hai :"); scanf("%d", y);
				printf("\nTich 2 so = %d\n", multiply2Numbers(x, y));
				break;
			case '3':
				printf("\n Thoat chuong trinh");
				break;
			default:
				printf("\n");			
		}
	} while(choice != '3');
	*/
	int x = 2;
	int y = 4;
	swap(&x, &y);
	printf("Sau khi sap xep: x = %d, y = %d\n", x, y);
	return 0;
}













