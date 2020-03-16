/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Scanner;
//Rule for naming = naming convention = quy tac dat ten identifier
//Trong Java, tranh dat ten kieu co dau gach duoi 
//VD number_of_students(PHP, python, ruby, sql...) => ok van chay bt, ko chuong trong Java
//Kieu thong dung cua Java: numberOfStudents
//numberOfStudent KHAC VOI numberofStudent
//instance variable  = bien kieu doi tuong, ben trong chua nhieu thuoc tinh khac
//cai nay hoi giong con tro den 1 struct trong C

public class Point {
    //operand : toan hang : a, b, x, y
    //operators : +, - * /
    private Float x, y;//Co getter, setter thi de private
       
    //encapsulation = tinh bao goi

    //Ham khoi tao co tham so
    //constructor with params(parameters)
    public Point(Float x, Float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    private Scanner getScanner() {
        return new Scanner(System.in);
    }
    //Cong viec nhap du lieu co the giao choi doi tuong point lam
    public void inputData() {
        System.out.println("Enter x = ");
        this.x = this.getScanner().nextFloat();
        System.out.println("Enter y = ");
        this.y = this.getScanner().nextFloat();
    }
    public Float distanceTo(Point otherPoint) {
        double deltaX = otherPoint.getX() - this.getX();
        double deltaY = otherPoint.getY() - this.getY();       
        //casting = ep kieu
        return (float)Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
    //ben trong class nay minh co nhieu ham input...?
    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = "+this.x +"\n"+
               "y = "+this.y +"\n";
    }
    
}
