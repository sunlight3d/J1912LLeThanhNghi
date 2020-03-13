/*
Trong Java minh ko the 1 ham doc lap, tat ca phai dua vao trong 1 class
Ko nen viet tat ca vao Main va ham main
*/
package com.mycompany.aptech;

import com.mycompany.lythuyet.Car;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("chua bai tap 13-03-2020");
        System.out.println("Gia tri lon nhat la :");
        System.out.println(Caculation.findMaxValue(10.0f, 11.0f, 20.0f));
        //Caculation.checkSign();
        //Tao ra mot mang cac so thuc 
        ArrayList<Float> numbers = new ArrayList<>();//uuu viet hon trong C, la minh ko phai cap phat do rong
        numbers.add(1.1f);
        numbers.add(-2.0f);
        numbers.add(3.1f);
        numbers.add(4.1f);
        numbers.add(-1.0f);
        System.out.println("Tong gia tri cac so am trong mang la :");
        System.out.println(Caculation.countNumberOfNegativeValues(numbers));
        //Tao ra 1 doi tuong car tu class Car
        //1 class co the tao ra 1 hoac nhieu doi tuong(object)
        Car myMazda = new Car();
        myMazda.color = "white";//bai nay gan giong nhu struct trong C
        //myMazda.maker = "Mazda";//ko truy cap dc vao maker vi Main va Car thuoc 2 package khac nhau 
        //myMazda.model = "Mazda 8";private: ben ngoai class ko truy cap dc
        myMazda.changeGear(3);
        myMazda.increaseSpeed(123.f);
        myMazda.applyBrakes();        
        Car car1 = new Car();
        Car car2 = car1;
        car2.color = "XX";
        Car car3 = car1;
        
        car3 = null;
        car2 = null;
        car1 = null;
        System.out.println("haha");
        
        //Garbage collections = don rac = khi 1 dia chi nao do ko co ai tham chieu den
        //thi du lieu tai do dc giai phong, de cap phat cho doi tuong khac
    }
    //Minh se viet 1 class ten la Calculation de thuc hien cac cv tinh toan vua roi
    
}
