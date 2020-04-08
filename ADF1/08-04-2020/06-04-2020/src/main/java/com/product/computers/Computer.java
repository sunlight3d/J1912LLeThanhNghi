/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.computers;

import com.product.Product;

import java.util.stream.Collectors;


public class Computer extends Product{
   
    private Float speed;
    private String producer;

    public Computer(long id, String name, Integer year, Float price, Float speed, String producer) {
        super(id, name, year, price);
        this.speed = speed;
        this.producer = producer;
    }

    public Computer() {
        
    }
    @Override
    public void input() {
    
        //ko muon nhap id
        //id tu sinh, co the random
        //hoac lay thoi gian hien tai
        //get current timestamp
        
        System.out.println("Name: "); 
        this.name = this.getScanner().nextLine();
        
        System.out.println("Year: "); 
        this.year = this.getScanner().nextInt();
        
        System.out.println("Price: "); 
        this.price = this.getScanner().nextFloat();
        
        System.out.println("Speed: "); 
        this.speed = this.getScanner().nextFloat();
        
        System.out.println("Producer: "); 
        this.producer = this.getScanner().nextLine();        
    }

    @Override
    public void display() {
        System.out.println(
                String.format("name: %s, year: %d, price : %3.2f, speed: %4.1f, producer: %s", 
                               this.name, this.year, this.price, this.speed, this.producer));
    }
    @Deprecated //sap sua vut di
    //Vut di roi thi dung ham gi de thay the ?
    @SuppressWarnings("Let's  use doSomthing2 instead")
    public void doSomething(String x){
        System.out.println("I am doing something...");
        //Cai thu vien ngoai thi lam the nao ?
        //Maven
        //cach day hon 10 nam cai thu vien cho Java: download ve, paste vao project...
        //bay gio de hon nhieu
    }
    
}
