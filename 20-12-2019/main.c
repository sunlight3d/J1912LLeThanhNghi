#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

void bai01() {
	float x, y;
	printf("Enter x : "); scanf("%f", &x);
	printf("Enter y : "); scanf("%f", &y);
	if(x * y > 0 ) {
		printf("Cung dau");
	} else if(x * y == 0) {
		printf("1 trong 2 so bang 0, hoac ca 2");
	} else {
		printf("Khac dau");
	}
}
void bai02() {
	double x, y, z;
	printf("Enter x : "); scanf("%lf", &x);
	printf("Enter y : "); scanf("%lf", &y);
	printf("Enter z : "); scanf("%lf", &z);
	if (x < 0) {
		x = -x;
	}
	if (y < 0) {
		y = -y;
	}
	if (z < 0) {
		z = -z;
	}
	//lf = "long float"
	printf("x = %.2lf, y = %.2lf, z = %.2lf", x, y, z);
}
void giaiHePhuongTrinh(){
	float a,b,c,d,e,f;
	a = 1.0000000; b = 1.0001; c = 3; d = 4; e = 4; f = 6;
	float dd = a*e - b*d;
	float dx = c*e - b*f;
	float dy = a*f - c*d;
	printf("dd = %f", dd);
	if(roundf(dd) == 0.0) {
		printf("haha");
	}
}
void tinhSn() {
	float sn = 0.0;
	int N = 212;
	int i;
	for(i = 1; i <=N; i++) {
		sn = sn + pow(i, 3);
	}
	printf("sn = %f", sn);
}
void getPerimeter() {
	float radius = 0.123;
	float p = 2*M_PI*radius;
	printf("p = %3.3f", p);
}
void getArea() {
	float radius = 10.0;
	float area = M_PI*pow(radius, 2);
	printf("area = %3.3f", area);
}
int main(int argc, char *argv[]) {
//	bai01();
//	bai02();
//	giaiHePhuongTrinh();
//	tinhSn();
	//getPerimeter();
	getArea();
	return 0;
}
