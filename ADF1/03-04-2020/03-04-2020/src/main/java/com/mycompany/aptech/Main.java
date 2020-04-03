/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptech;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bai tap ve try - catch - exception");
        /*
        Calculation calculation = new Calculation();        
        calculation.divide2Numbers();
*/
        //Thuc te: cac bai lien quan toan hoc,ma tran, do thi,... => Python
        Student studentA = new Student("Hoang", "hoang@gmail.com", 30);
        Student studentB = studentA;//cai nay chi la tham chieu(reference), ko phai NHAN BAN
        //vi sao ? Debug se biet
        studentA.setName("Hung");        
        //Gio muon nhan ban(clone) : studentA, studentC du lieu giong het nhau, nhung o 2 dia chi khac nhau
        //clone bang tay = thu cong = manual => Neu so truong len 200 ???
        Student studentC = new Student(studentA.getName(), studentA.getEmail(), studentA.getAge());
        studentC.setAge(50);
             
        //Dung cloneable interface
        //studentD la ("NHAN BAN" = clone) cua studentA
        try {
            Student studentD = (Student)studentA.clone();//vi sao, vi clone la "protected"
            //studentA va studentD du lieu giong nhau, dia chi khac nhau           
            System.out.println("haha");   
        }catch(CloneNotSupportedException e) {
            //e.printStackTrace();
            System.out.println("Cannot clone a student's object . Error = "+e.toString());
        }        
        //Regular Expression
    }
}
