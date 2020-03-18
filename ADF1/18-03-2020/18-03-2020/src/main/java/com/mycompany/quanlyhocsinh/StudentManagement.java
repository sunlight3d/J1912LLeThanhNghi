/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quanlyhocsinh;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Student> studentsWithScholarships = new ArrayList<>();
    private Scanner getScanner() {
        return new Scanner(System.in);
    }
    
    public void showMenu() {
        //phan hien menu, truoc da hoc tu mon C
        //Gio hay viet bang Java
        int choice = -1;
        while(choice != 5) {
            System.out.println("1. Nhap danh sach hoc vien");
            System.out.println("2. Nhap diem hoc vien");
            System.out.println("3. Hien thi danh sach hoc vien");
            System.out.println("4. Danh sach hv co hoc bong");
            System.out.println("5. Thoat");
            System.out.println("Enter your choice: (1-5) : ");
            choice = getScanner().nextInt();            
            switch(choice) {
                case 1: 
                    this.inputStudents();
                    break;
                case 2: 
                    this.inputStudentsPoints();
                    break;
                case 3: 
                    this.showAllStudents();
                    break;
                case 4: 
                    this.showStudentsWithScholarships();
                    break;
                default:
                    break;
                
            }
        }        
    }
    private void inputStudents() {
        System.out.println("Enter number of students : ");
        int numberOfStudents = getScanner().nextInt();
        for(int i = 0; i < numberOfStudents; i++) {
            //co bao nhieu hoc vien, co bay nhieu lenh "new"
            Student student = new Student();
            student.input();
            students.add(student);
        }
    }
    private void inputStudentsPoints() {
        //Tai sao phai tach ra ?
        //trong thuc te nghiep vu
        //co nhung bai toan , nhap du lieu chia nhieu giai doan
        //VD: hoc vien: luc moi nhap hoc thi nhap thong tin co ban
        //Sau khi het hoc ky thi moi nhap diem
        //lay cac ban sinh vien cu ra, nhap them diem vao
        //Ko duoc TAO MOI 
        for(Student student: this.students) {
            
            student.inputPoint();
        }
    }
    private void showAllStudents() {
        for(Student student: this.students) {
            System.out.println(student.toString());
        }
    }
    private void showStudentsWithScholarships() {
        //sau nay thi moi nguoi hoc them ve ham filter
        //cach truyen thong la minh duyet va an vao array ket qua
        this.studentsWithScholarships.clear();
        boolean hasScholarship = false;
        for(Student student: this.students) {
            if(student.canGetScholarship() == true) {
                //cong viec tinh dieu kien duoc hoc bong la viec cua student
                this.studentsWithScholarships.add(student);
                hasScholarship = true;
            }
        }
        if(hasScholarship == false) {
            System.err.println("No student has scholarships");
        }
    }
    
    
}
