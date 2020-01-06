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
void input() {
	printf("Day la ham input\n");
}
void sort() {
	printf("Day la ham sort\n");
}
void analyze() {
	printf("Day la ham analyze\n");
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
            input();
            break;
        case '2':
            sort();
            break;
        case '3':
            analyze();
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
