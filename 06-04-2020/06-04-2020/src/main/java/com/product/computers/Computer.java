/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.computers;

import com.product.Product;


public class Computer extends Product{
   
    private Float speed;
    private String producer;

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
    
    
}
