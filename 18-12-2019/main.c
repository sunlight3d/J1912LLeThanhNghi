#include <stdio.h>
#include <stdlib.h>
/*
stdio = standard input / output , h = header
stdlib = standard library
*/
int main(int argc, char *argv[]) {
	/*
	int x, y, z;	
	printf("Enter x = \n"); scanf("%d", &x);
	printf("Enter y = \n"); scanf("%d", &y);
	z = x + y;
	printf("Gia tri z = %d", z);
	int x1;
	x1 = 120;
	if(x1 %2 ==0 ) {
		printf("\nx1 la so chan");
	} else {
		printf("\nx1 la so le");
	}
	*/
	int age = 81;
	if(age >= 18 && age <= 50) {
		printf("\ntuoi lao dong");
	} else if(age < 10 || age > 80) {
		printf("\nko quan tam tien bac");
	} else {
		printf("\n Other...");
	}
	int n = 100;
	while(n >= 0) {
		printf("\nn = %d", n);
		//n = n - 1;
	}
	return 0;
}
