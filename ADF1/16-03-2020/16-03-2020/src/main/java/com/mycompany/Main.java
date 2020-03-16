/*
 * int, float,...primitive 
Integer, Float: kieu tham chieu, kieu doi tuong

 */
package com.mycompany;
//enumeration = enum
//0 -> F
enum Gender {
    MALE,
    FEMALE
}
public class Main {
    public static void main(String[] args)  {
        /*
        Point p1 = new Point();//goi ham khoi tao mac dinh = default contructor = ham khoi tao ko co tham so
        p1.inputData();
        Point p2 = new Point();//goi ham khoi tao mac dinh = default contructor = ham khoi tao ko co tham so
        p2.inputData();
        System.out.println("Khoang cach giua 2 diem = " + p1.distanceTo(p2));
        System.out.println("P1's detail : "+p1.toString());
        System.out.println("P2's detail : "+p2.toString());
        */
        System.out.println("number of Account's object : "+Account.count);
        Account mrA = new Account("111", 20_000_000.0);
        System.out.println("number of Account's object : "+Account.count);
        //mrA la local variable cua main
    }
    
}
