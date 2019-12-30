#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

double numbers2[] = {1.23, 5.32, 6.55, -9, 8.1, -7.223, 12.3, -3};
//double numbers2[] = {1, 2, -3, 1};

int length = sizeof(numbers2) / sizeof(double);
void bai01(){
	float numbers[4];
	int i = 0;
	for(i = 0; i <=3; i++) {
		//nhap tung numnber
		printf("enter a number : "); scanf("%f", &numbers[i]);
	}
	printf("%lf", numbers2[1]);
	//in ra man hinh cac so da nhap
	for(i = 0; i <=3; i++) {
		printf("number[%d] = %.2f", i, numbers[i]);
	}
}

void bai02() {
	int numbers[] = {2, 5, 6, 9, 8, 7,12, 3};
	int length = sizeof(numbers) / sizeof(int);
	int i;
	printf("array's size = %d", length);
	int numbersOfEven = 0;
	for(i = 0; i < length; i++){				
		if(numbers[i] % 2 == 0) {
			printf("\n%d", numbers[i]);
			numbersOfEven = numbersOfEven + 1;
		}		
	}
	printf("\nNumbers of evens = %d", numbersOfEven);
}



void bai03() {	
	
	int i = 0;
	while(i < length) {
		if(numbers2[i] < 0.0) {
			printf("Phan tu thu %d la so am, gia tri la: %.3f \n", i, numbers2[i]);
		}
		i++;
	}
}
void bai04() {
	double max = numbers2[0];	
	double min = numbers2[0];	
	int i;
	for(i = 1; i < length; i++){
		if(numbers2[i] > max) {
			max = numbers2[i];
		}
		if(numbers2[i] < min) {
			min = numbers2[i];
		}
	}
	printf("max = %lf, min = %lf", max, min);
}
void bai05(){
	//tim sum
	double sum = 0.0;
	int i;
	for(i = 0; i < length; i++){
		//sum = sum + numbers2[i];		
		sum += numbers2[i];
	}	
	printf("Tong gia tri = %0.3lf", sum);
}
void bai06() {
	//tim sum
	double sum = 0.0;
	int i;
	for(i = 0; i < length; i++){
		//sum = sum + numbers2[i];		
		if(numbers2[i] > 0.0){
			sum += numbers2[i];
		}
	}	
	printf("Tong gia tri duong = %0.3lf", sum);
}
void bai07(){
	float x;
	x = (float)5 / (float)2; //casting
	printf("x = %.3f", x);
}
int main(int argc, char *argv[]) {	
	//bai01();
	//bai02();
	//bai03();
	//bai04();
	//bai05();
	//bai06();
	bai07();
	return 0;
}
