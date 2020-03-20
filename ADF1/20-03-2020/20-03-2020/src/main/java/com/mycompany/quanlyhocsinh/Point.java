/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quanlyhocsinh;

public class Point {
    private Double x, y;
    //ham khoi tao = construtor 
    //Encapsulation = private cac thuoc tinh, public cac phuong thuc lay du lieu ra
    public Point(Double x, Double y) {
        //ham khoi tao co tham so
        this.x = x;
        this.y = y;
        System.out.println("2.contructor with params"); //prameterized contructor
    }
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    //initialization block
    {
        System.out.println("1.initialization block");
        this.x = 0.0;
        this.y = 0.0;
    }
    //chung trinh di vao dau truoc
}
