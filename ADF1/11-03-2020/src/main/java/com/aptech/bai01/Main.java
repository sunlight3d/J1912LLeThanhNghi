/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.bai01;

import java.util.Scanner;

public class Main {
    //Ten class luon viet hoa o dau: Main, Car, Person, Student
    //Hoi giong struct trong C
     //Ham main
    public static void main(String[] args) {
        System.out.println("Chao cac ban");
        //De cai dat java: Netbeans hoac IntelliJ IDEA, sau do cai them JDK
        //Linux: Ubuntu, CentOS, Fedora, Mint, Oracle Solaris,...
        //MacOS 
        int x = 10;
        int y = 20;
        //In ra tong:
        int sum = x + y;
        System.out.println("Tong 2 so la = "+sum);//cho nay goi la noi xau ky tu
        String name = "Hoang";
        //Bai tap 1(don gian): Hien cac so tu 1 den 100                
        Integer numberOfOdds = 0;//Co bao nhieu so le ? //Integer: kieu doi tuong(object), cua Java
        int totalOddValues = 0;//int = kieu nguyen thuy = primitive, uu diem: tinh toan nhanh 
        for(int i = 1; i <= 100; i++) {     
            //Tinh tong cac so le tu 1 den 100
            if(i % 2 != 0) {
                //chi in ra cac so le
                //so le la so ko chia het cho 2
                numberOfOdds ++;//tu tang len 1 don vi
                //numberOfOdds = numberOfOdds + 1;
                totalOddValues += i;
                System.out.print(i+", ");
            }            
        }
        System.out.println("Co tat ca "+numberOfOdds+" so le");
        System.out.println("Tong gia tri cac so le = "+totalOddValues);        
        System.out.println("Gia tri lon nhat cua 1 so nguyen la :"+Integer.MAX_VALUE);
        //Ngoai so nguyen(int, Integer), minh con co kieu Float, Double
        Float p = 1.0224f;//kieu float phai them chu f vao cuoi
        //Kieu Double thi ko can
        Double p2 = 2.36;
        Double result = p + p2; //kieu NHO chuyen sang kieu TO => tu dong, tu dong ep kieu
        Float result2 = p + p2.floatValue();//ko ep kieu tu dong duoc, phai casting
        //floatValue la 1 ham(phuong thuc, method, function) cua doi tuong p2
        System.out.println("result2 = "+result2);
        //Bieu dien 1 so dai, VD: so the visa
        Long visaCardNumber = 3824_1536_3367L;
        long moneyAmount = 12_000_000_123L;
        System.out.println("money amount : "+moneyAmount);        
        System.out.println("Tong cua 4 va 2 la: " + sum(4.0f, 2.0f));
        sayHello("Hoang");
        System.out.println("Today is : "+getDayName());
    }
    public static Double sum(Float a, Float b) {
        //tham so dau vao cua ham/phuong thuc(function, method)
        //tham so dau vao: input parameters, arguments
        return a.doubleValue() + b.doubleValue();
        
    }
    //Ham ko co tham so dau vao
    static void sayHello(String personName) {
        System.out.println("Hello mr "+personName);
        //ham kieu void, ko co return        
    }
    static String getDayName() {
        //Lam the nao de nhap du lieu tu ban phim(scanf trong C)
        Scanner scanner = new Scanner(System.in);//Lenh new = cap phat bo nho = khoi tao doi tuong = giong lenh malloc trong C
        System.out.println("Enter day's number: ");
        Integer day = scanner.nextInt();
        //switch case hay dung trong truong hop: kiem tra cac gia tri don le        
        switch(day) {
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            case 1:
                return "Sunday";
            default: //cac truong hop con lai
                return "Invalid";
        }   
    }
}
