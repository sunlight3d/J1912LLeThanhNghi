/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptech;

import java.util.ArrayList;
import java.util.Scanner;

public class Caculation {
    //static = goi ten ham(phuogn thuc, method, function) bang cu phap: TEnClass.tenHam(...tham so)
    public static Float findMaxValue(Float a, Float b, Float c) {
        //1 so rat nho, trong C minh hay lay 1 so ra nho
        //Trong Java, thu vi hon, co thuoc tinh lay gia tri do roi
        Float max = Float.MIN_VALUE;
        if(a > max) {
            max = a;
        }
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        return max;
        //Ham da dinh nghia xong, bay gio goi ham ?        
    }
    public static void checkSign() {
        //Nhap tu ban phim ? Trong C cac ban dung scanf
        //Trong Java minh dung class Scanner
        //Tao ra 1 doi tuong scanner
        Scanner scanner = new Scanner(System.in); //new = tao doi tuong = "malloc" = "new" trong C++
        System.out.println("Nhap so thu nhat : ");
        Double x = scanner.nextDouble();
        System.out.println("Nhap so thu hai : ");
        Double y = scanner.nextDouble();
        if(x * y > 0) {
            System.out.println("Hai so cung dau");
        } else {
            System.out.println("Hai so trai dau");
        }        
    }
    //Trong C minh co kieu array, trong Java cung co kieu Array, ngoai ra con co kieu ArrayList(uu viet + hay ho hon)
    public static Float countNumberOfNegativeValues(ArrayList<Float> numbers){
        //Duyet kieu co dien(giong trong C)
        Float sum = 0.0f;
        for(int i = 0; i < numbers.size(); i++) {
            Float number = numbers.get(i);
            if(number < 0) {
                sum += number;
            }
        }
        return sum;
    }
}
