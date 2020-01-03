
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "calculation.h"

int sum2Numbers(int x, int y) {
	return x + y;
}

//void doSomething() {
//	printf("Chao cac ban");
//}

int (*tong2So)(int, int) = &sum2Numbers;
//void (*lamGiDo)() = &doSomething;
