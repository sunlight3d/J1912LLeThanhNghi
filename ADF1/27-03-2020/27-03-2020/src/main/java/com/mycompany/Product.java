/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

public class Product {
    public static final int TYPE_CD = 2;
    public static final int TYPE_BOOK = 1;
    private String code;
    private String name;
    private String description;
    private String producer;
    private Double price;
    public Product() {}
    public Product(String code, String name, String description, String producer, Double price) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.producer = producer;
        this.price = price;
    }
    public void input() {
        System.out.println("Code : ");
        this.code = Menu.getScanner().nextLine();
        
        System.out.println("Name : ");        
        this.name = Menu.getScanner().nextLine();
        
        System.out.println("Enter description : ");
        this.description = Menu.getScanner().nextLine();
        
        System.out.println("Enter producer: ");
        this.producer = Menu.getScanner().nextLine();
        
        System.out.println("Enter price: ");
        this.price = Menu.getScanner().nextDouble();        
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "code: "+this.code + "\n"+
                "name: "+this.name + "\n"+
                "description: "+this.description + "\n"+
                "producer: "+this.producer + "\n"+
                "price: "+this.price + "\n";                
    }    
    
}
