#include <stdio.h>
#include <stdlib.h>
#define PI 3.1416
#define GIOI 1 
#define TRUNG_BINH 1 
#define CHAY_CHUC_NANG_A 1

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
/*
void doiChoPhanTu0Va2(int* numbers) {
	int temp;
	temp = *(numbers + 0);
	*(numbers) = *(numbers + 2);
	*(numbers + 2) = temp;
}
*/
void doiChoPhanTu0Va2(int numbers[5]) {
	printf("Dia chi : %p", &numbers[0]);
	int temp;
	temp = numbers[0];
	numbers[0] = numbers[2];
	numbers[2] = temp;
}
void doSomething(int x){	
	x = 120;
	printf("\nx ben trong = %d", x);
}
int main(int argc, char *argv[]) {
	//on tap ve array = mang
	
	int numbers[5];
	numbers[0] = 2; 
	numbers[1] = 6;
	numbers[2] = 8;
	numbers[3] = 9;
	printf("Phan tu thu xx la %d", numbers[4]);
#ifdef CHAY_CHUC_NANG_A
	printf("\nphan tu 0 : %d", numbers[0]);
	printf("\nphan tu 2 : %d", numbers[2]);
	doiChoPhanTu0Va2(numbers);
	printf("\nSau khi doi cho : \n");
	printf("Dia chi : %p", &numbers[0]);
	printf("\nphan tu 0 : %d", numbers[0]);
	printf("\nphan tu 2 : %d", numbers[2]);
#endif
	int x = 10;
	doSomething(x);
	printf("\nx ben ngoai = %d", x);
	
	/*
	int* numbers; //numbers chua dia chi cua phan tu dau tien trong mang(array)
	numbers = malloc(5 * sizeof(int));
	*(numbers) = 2;
	*(numbers + 1) = 6; 
	*(numbers + 2) = 8; 
	*(numbers + 3) = 9; 
	printf("Phan tu thu 2 la %d\n", *(numbers + 2));
	printf("Dia chi tu thu 2 la %p\n", (numbers + 2));
	printf("\nphan tu 0 : %d", *numbers);
	printf("\nphan tu 2 : %d", *(numbers + 2));
	doiChoPhanTu0Va2(numbers);
	printf("\nSau khi doi cho : \n");\
	printf("\nphan tu 0 : %d", *numbers);
	printf("\nphan tu 2 : %d", *(numbers + 2));
	*/
	//Vi du ve #define
	float radius;
	printf("\nNhap vao ban kinh : "); scanf("%f", &radius);
	printf("\nChu vi p = %f", 2 * PI * radius);
	int danhGia;
	danhGia = 1;
	if(danhGia == GIOI) {
		printf("Duoc sang bo phan XY");
	} else if(danhGia == TRUNG_BINH) {
		printf("Lam cong viec AB");
	}
	return 0;
}
