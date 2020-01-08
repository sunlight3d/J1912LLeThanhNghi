#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct Employee {
	char id[6];//cmnd, employee's Id
	char name[25];
	int working_days;
	float daily_salary;	
};

void testEmployee() {
	struct Employee* mrHoang = malloc(sizeof(struct Employee));
	strcpy(mrHoang->name, "Hoang"); //strcpy = string copy
	strcpy(mrHoang->id, "111");
	mrHoang->working_days = 5;
	printf("Detail mr Hoang = %p\n", mrHoang);
	printf("name = %s\n", mrHoang->name);
	printf("id = %s\n", mrHoang->id);
	printf("working days = %d\n", mrHoang->working_days);
}
struct Point {
	float x;//fields = properties = attributes
	float y;
};
void testPoint() {
	struct Point p1;
	p1.x = 1;
	p1.y = 2;
	printf("Detail p1: x = %0.2f, y = %0.2f\n", p1.x, p1.y);
}
void input(struct Employee* employees, int N) {
	
    int i;
    for(i = 0; i < N; i++){
    	printf("Nhap nhan vien thu %d : \n", i+1);
        printf("Enter id: "); 
        fflush(stdin);
        gets((employees+i)->id);
        printf("Enter name: "); 
        fflush(stdin);
        gets((employees+i)->name);
        do {
        	printf("Enter working days: "); scanf("%d", &((employees+i)->working_days));
		}while((employees+i)->working_days < 1 || (employees+i)->working_days > 31);
        do {
        	printf("Enter daily salary: "); scanf("%f", &((employees+i)->daily_salary));
		}while((employees+i)->daily_salary < 10 || (employees+i)->daily_salary > 100);
        
    }
    printEmployees(employees, N);
}
void printEmployees(struct Employee* employees, int N) {
    int i;
    printf("+--------------------------------------------------------------+\n");
    printf("+|No   |ID   |Employee Name        |Working Days  |Daily Salary($)    | \n");
    printf("+--------------------------------------------------------------+\n");
    for(i = 0; i < N; i++){    	
    	if(i >= 0 && i < 9){
			printf("|00%d   ", i+1);
		} else if(i >= 10 && i < 100){
			printf("|0%d    ", i+1);
		} else if(i >= 100 && i < 1000){
			printf("|%d     ", i+1);
		}    	    	
        printf("|%5s", (employees+i)->id);
        printf("|%20s", (employees+i)->name);
        printf("|%5d", (employees+i)->working_days);
        printf("|%6.2f\n", (employees+i)->daily_salary);
        printf("+--------------------------------------------------------------+\n");
    }
    printf("+--------------------------------------------------------------+\n");
}

void sort(struct Employee* employees, int N) {
	printf("Day la ham sort\n");
	int i, j;
	for(i = 0; i < N-1; i++){
		for(j = i + 1; j < N; j++){			 
			if(strcmp((employees + i)->name, (employees + j)->name) > 0) {
				struct Employee temp;
				temp = *(employees + i);
				*(employees + i) = *(employees + j);
				*(employees + j) = temp;
			}
		}
	}
	printEmployees(employees, N);
}
void analyze(struct Employee* employees, int N) {
    int arr_working_days[N]; //1.create an array of "publishers"
    int i,j;
    for (i = 0; i < N; i++) {
        arr_working_days[i] = (employees+i)->working_days;
    }
    //2.sort ascending(alphabet)
    for (i = 0; i < N-1; i++) {
        for (j = i+1; j < N; j++) {
            if(arr_working_days[i] > arr_working_days[j]) {
                int temp;
                temp = arr_working_days[i];
                arr_working_days[i] = arr_working_days[j];
                arr_working_days[j] = temp;
            }
        }
    }
    printf("Statistics Result: \n");
    int count = 0;
    int temp1 = 0;
    for (i = 0; i < N; i++) {
        if(i == 0) {
            temp1 = arr_working_days[i];
            count++;
        } else if(temp1 != arr_working_days[i]){
            printf("+There are %d employees with workingday: %d\n", count, temp1);
            temp1 = arr_working_days[i];
            count = 1;
        } else if(temp1 == arr_working_days[i]) {
            count++;
        }
    }
    if(N > 0){
        printf("+There are %d employees with workingday: %d\n", count, temp1);
    }
}
void find() {
	printf("Day la ham find\n");
}
void save() {
	printf("Day la ham save\n");
}
void open() {
	printf("Day la ham open\n");
}

int main(int argc, char * argv[]) {
    //testEmployee();
    //testPoint();
    struct Employee* employees;
    int N;
    char choice;    
    do {
    	printf("+----------------------------------------------------------------------+\n");
    	printf("+----------------------------------------------------------------------+\n");
    	printf("|1. Input | 2. Sort | 3. Analyze | 4. Find | 5. Save | 6. Open | 7. Exit\n");
    	printf("+----------------------------------------------------------------------+\n");
    	printf("Enter your choice: ");
    	fflush(stdin);
    	choice = getchar();
        switch (choice) {
        case '1':
            printf("Number of employees : "); scanf("%d", &N);
            employees = malloc(sizeof(struct Employee) * N);
            input(employees, N);
            break;
        case '2':        	
            sort(employees, N);
            break;
        case '3':
            analyze(employees, N);
            break;
        case '4':
            find();
            break;
        case '5':
            save();
            break;
        case '6':
            open();
            break;
        case '7':
            break;
        default:
            break;
        }
        printf("Do you want to continue ?\n");
        printf("- Yes, I do. (press 'y', 'Y')\n");
        printf("- No, I don't. (press 'n', 'N')\n");
        printf("- Clear the screen(press 'c', 'C')\n");
        printf("Your choice: "); 
        fflush(stdin);
		choice = getchar();
		if(choice == 'c' || choice == 'C') {
			system("cls");
		}
    } while (choice != 'n' && choice != 'N');

    return 0;
}

