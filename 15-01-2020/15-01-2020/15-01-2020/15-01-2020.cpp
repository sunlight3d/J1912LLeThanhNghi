// 15-01-2020.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <fstream>

using namespace std;
//cpp = c plus plus
class Student {
    //encapsulation = tinh bao goi
private:
    int age;
    string name;
public: //access modifier
    Student(string name, int age) {
        //constructor method = "init function"
        this->age = age;
        this->name = name;
    }
    Student() {
        //default constructor = ham khoi tao mac dinh
        this->age = 18;
        this->name = "";
    }
    //getter
    int getAge() {
        return this->age;
    }
    string getName() {
        return this->name;
    }
    //setter
    void setAge(int age) {
        this->age = age;
    }
    void setName(string name) {
        this->name = name;
    }
    void show() {
        cout << "Name = "<<this->name<<", age = "<<this->age<<endl;
    }
};
void saveToCSV(Student* students, int numberOfStudents) {
    ofstream csvFile;
    csvFile.open("xx.csv");
    csvFile << "Ten" << "," << "Tuoi" << endl;
    for (int i = 0; i < numberOfStudents; i++) {
        Student* student = students + i;
        csvFile << student->getName() <<","<< student->getAge()<< endl;
    }
    csvFile.close();

}
int main() {
    cout << "Hello World!\n";
    Student* studentA = new Student("Hoang", 30);//ko can malloc
    int numberOfStudents;
    cout << "Enter number of students: "; cin >> numberOfStudents;
    Student* students = new Student[numberOfStudents];//malloc
    for (int i = 0; i < numberOfStudents; i++) {
        //Yeu cau nguoi dung nhap
        Student* ptr = students + i;        
        cout << "Nhap thong tin sinh vien thu" << i + 1 << endl;        
        int age; string name;
        cout << "Ten sinh vien : "; cin >> name;
        ptr->setName(name);
        cout << "\nTuoi : "; cin >> age; 
        ptr->setAge(age);        
        //ptr = new Student(name, age);
        //newStudent->show();
    }
    for (int i = 0; i < numberOfStudents; i++) {
        Student* ptr = students + i;
        ptr->show();
    }
    //studentA->show();
    saveToCSV(students, numberOfStudents);
}

