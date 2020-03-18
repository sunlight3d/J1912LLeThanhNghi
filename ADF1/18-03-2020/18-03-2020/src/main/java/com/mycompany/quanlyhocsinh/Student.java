/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quanlyhocsinh;

import java.util.Scanner;


public class Student {
    private static int numberOfStudents = 0;
    private Integer studentId;
    private String fullName, dateOfBirth;
    private Gender gender;   
    private Float math, physics, chemistry;
    private Scanner getScanner() {
        return new Scanner(System.in);
    }
    public Student() {
        numberOfStudents++;
        studentId = numberOfStudents;
    }
//HAm input co 2 giai doan...
    public void input(){
        System.out.println("Enter fullname: ");
        this.fullName = getScanner().nextLine();
        
        System.out.println("Enter date of birth: ");
        this.dateOfBirth = getScanner().nextLine();
        
        System.out.println("Enter gender(0 - female, 1 - male, 2 - unknown): ");
        int myGender = getScanner().nextInt();
        if (myGender == 0) {
            this.gender = Gender.FEMALE;
        } else if(myGender == 1){
            this.gender = Gender.MALE;
        } else if(myGender == 2) {
            this.gender = Gender.UNKNOWN;
        }
    }
    public void inputPoint() {
        System.out.println("Enter point for student: "+this.fullName);
        System.out.println("Enter math: ");
        this.math = getScanner().nextFloat();
        
        System.out.println("Enter physics: ");
        this.physics = getScanner().nextFloat();
        
        System.out.println("Enter chemistry: ");
        this.chemistry = getScanner().nextFloat();
        
    }

    @Override
    public String toString() {
        return "fullname: "+this.fullName+"\n"+
                "dateOfBirth: "+this.dateOfBirth+"\n"+
                "gender: "+this.gender+"\n"+
                "math: "+this.math+"\n"+
                "physics: "+this.physics+"\n"+
                "chemistry: "+this.chemistry+"\n";                
    }
    
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Float getMath() {
        return math;
    }

    public void setMath(Float math) {
        this.math = math;
    }

    public Float getPhysics() {
        return physics;
    }

    public void setPhysics(Float physics) {
        this.physics = physics;
    }
    public Boolean canGetScholarship() {
        //Viet kieu nguoc(hay dung truong truong hop validate thong tin)
        if(math < 5.0 || physics < 5.0 || chemistry < 5.0) {
            return false;
        }
        if((math + physics + chemistry) / 3 <= 8.0) {
            return false;
        }
        return true;
    }
}
