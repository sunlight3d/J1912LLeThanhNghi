/*
Trong Java minh ko the 1 ham doc lap, tat ca phai dua vao trong 1 class
Ko nen viet tat ca vao Main va ham main
*/
package com.mycompany.aptech;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("chua bai tap 13-03-2020");
        System.out.println("Gia tri lon nhat la :");
        System.out.println(Caculation.findMaxValue(10.0f, 11.0f, 20.0f));
        Caculation.checkSign();
        //Tao ra mot mang cac so thuc 
        ArrayList<Float> numbers = new ArrayList<>();//uuu viet hon trong C, la minh ko phai cap phat do rong
        numbers.add(1.1f);
        numbers.add(-2.0f);
        numbers.add(3.1f);
        numbers.add(4.1f);
        numbers.add(-1.0f);
        System.out.println("Tong gia tri cac so am trong mang la :");
        System.out.println(Caculation.countNumberOfNegativeValues(numbers));
    }
    //Minh se viet 1 class ten la Calculation de thuc hien cac cv tinh toan vua roi
    
}
