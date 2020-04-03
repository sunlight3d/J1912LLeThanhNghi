/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptech;

import java.util.Scanner;

public class Calculation {
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    public void divide2Numbers() {
        //ham nay co dac diem: trinh bien dich ko biet duoc 
        //neu y = 0 thi se loi
        //minh co 2 Exception: chia cho 0 + nhap ky tu
        //1. ko su dung exception => xem sao ?
        try {
            System.out.println("Enter x = ");
            Integer x = Integer.valueOf(getScanner().nextLine());

            System.out.println("Enter y = ");
            Integer y = Integer.valueOf(getScanner().nextLine());
            if(y == 0) {
                throw new Exception("Ko the chia cho 0");
            }
            Float result = (float)x / (float)y;
            System.out.println(String.format("Result = %3.2f", result));
        } catch(Exception e) {
            System.err.println("Error = "+e.toString());
        }
        
        //NumberFormatException: 
    }
}
