/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lythuyet;

public class Car {
    //state = properties = attributes = fiels = truong, thuoc tinh
    public String color;            
    String maker; 
    private String model;
    protected int modelNo;
    //access modifier: public, default, protected, private
    //public : co the truy cap ben ngoai class, truy cap tu package khac
    //default : ko viet gi ca, co the truy cap tu ben ngoai class, nhung phai cung package 
    //protected = chi duoc truy ben trong class+package, va ben trong class CON cua no
    //behaviors = methods = functions
    //Chi tiet ve access modifier
    public void drive() {
        System.out.println("I am driving");
    }
    public void applyBrakes() {
        System.out.println("I am stopping");
    }
    public void changeGear(Integer gearNumber) {
        //methods with parameters/arguments
        System.out.println("I am changing to gear "+gearNumber);
    }
    public void increaseSpeed(Float speed) {
        
        this.model = "xx";//ok, vi increaseSpeed nam trong class Car
        System.out.println("I am increasing to "+speed+" km / h");  
        
    }
}
