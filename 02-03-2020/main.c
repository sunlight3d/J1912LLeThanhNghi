#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
struct Picture {
	char name[200];
	char author[200];
	char category[200];
	float width;
	float height;
	float price;
};
void hienThi(struct Picture *pictures, int N) {
	int i;
	for(i = 0; i < N; i++)	{		
		struct Picture *picture = pictures + i;
		printf("Buc tranh so : %d", (i + 1));
		printf("Ten : %s\n", picture->name);
		printf("Tac gia : %s\n", picture->author);
		printf("The loai : %s\n", picture->category);

		printf("Do rong : %.2f\n", picture->width);
		printf("Do cao : %.2f\n", picture->height);
		printf("Gia : %.2f\n", picture->price);
	}	
}
void nhapThongTin(struct Picture *pictures, int N) {
	int i;
	for(i = 0; i < N; i++)	{
		printf("Nhap ten buc tranh : "); fflush(stdin);
		gets((pictures + i)->name);

		printf("Nhap tac gia : ");fflush(stdin); 		
		gets((pictures + i)->author);
		
		printf("Nhap the loai : ");fflush(stdin);
		gets((pictures + i)->category);
		
		printf("Nhap do rong : "); fflush(stdin);
		scanf("%f", &((pictures + i)->width));
		
		printf("Nhap do cao : "); fflush(stdin);
		scanf("%f", &((pictures + i)->height));			
		
		printf("Nhap gia : "); fflush(stdin);
		scanf("%f", &((pictures + i)->price));			
	}	
	hienThi(pictures, N);
}

void sapXepTheoDienTich(struct Picture *pictures, int N) {
	int i, j;
	for(i = 0; i < N-1; i++)	{		
		for(j = i + 1; j < N; j++)	{		
			struct Picture *p1, *p2;
			p1 = pictures + i;
			p2 = pictures + j;
			float area1 = p1->width * p1->height;
			float area2 = p2->width * p2->height;
			if(area1 < area2) {
				struct Picture temp;
				temp = *p1;
				*p1 = *p2;
				*p2 = temp;
			}
		}	
	}
	hienThi(pictures, N);
}
void filterByCategoryAndMinMax(struct Picture *pictures, int N) {
	int i; float min, max;
	char category[200];
	printf("Ban muon tim the loai nao : "); 
	fflush(stdin);
	gets(category);

	printf("Gia MIN: "); scanf("%f", &min);
	printf("Gia MAX: "); scanf("%f", &max);
	
	struct Picture *ketqua = (struct Picture*)malloc(sizeof(struct Picture) * N);
	int j = 0;
	for(i = 0; i < N; i++)	{
		struct Picture *picture = pictures + i;
		if(picture->price >= min 
			&& picture->price <= max 
			&& strcmp(picture->category, category) == 0) {
			*(ketqua + j) = *picture;
			j++;
		}
	}
	int M = j;//M = tong so phan tu cua mang ket qua
	hienThi(ketqua, M);
}
int main(int argc, char *argv[]) {
	int choice = 0;
	int N, i;
	struct Picture *pictures;
	while(choice != 8) {				
		printf("1. Nhap thong tin tranh va hien thi\n");
		printf("2. Sap xep\n");
		printf("3. Sap xep dien tich giam dan\n");
		printf("4. Thong ke theo ten tac gia \n");
		printf("5. Tim va hien thi theo the loai, gia ban thap nhat va nho nhat\n");
		printf("6. Doc file\n");
		printf("7. Ghi file\n");
		printf("8. Thoat\n");
		printf("Moi ban chon(1-8) : "); scanf("%d", &choice);		
		switch(choice){
			case 1:
				printf("Ban nhap bao nhieu buc tranh : "); scanf("%d", &N);
				pictures = (struct Picture*)malloc(sizeof(struct Picture) * N);
				if(N > 0) {
					nhapThongTin(pictures, N);
				}			
				break;
			case 2:
				printf("ban chon 2");
				break;
			case 3:				
				sapXepTheoDienTich(pictures, N);
				break;
			case 4:
				printf("ban chon 4");
				break;
			case 5:
				filterByCategoryAndMinMax(pictures, N);
				break;
			case 6:
				printf("ban chon 6");
				break;
			case 7:
				printf("ban chon 7");
				break;
			case 8:
				printf("ban chon 8");
				break;

		}
	}
	return 0;
}









