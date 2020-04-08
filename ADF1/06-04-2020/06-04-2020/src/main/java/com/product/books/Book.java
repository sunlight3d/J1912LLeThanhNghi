/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.books;

import com.product.Product;

public class Book extends Product{
    
    private String type;
    private String publisher;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void input() {
        System.out.println("Name: "); 
        this.name = this.getScanner().nextLine();
        
        System.out.println("Year: "); 
        this.year = this.getScanner().nextInt();
        
        System.out.println("Price: "); 
        this.price = this.getScanner().nextFloat();
        
        System.out.println("Type: "); 
        this.type = this.getScanner().nextLine();        
        
        System.out.println("Publisher: "); 
        this.publisher = this.getScanner().nextLine();        
    }

    @Override
    public void display() {
        System.out.println(
                String.format("name: %s, year: %d, price : %3.2f, type: %s, publisher: %s", 
                               this.name, this.year, this.price, this.type, this.publisher));
    }
    
    
}
