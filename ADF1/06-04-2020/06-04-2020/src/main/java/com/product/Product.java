
package com.product;

import java.util.Scanner;

public abstract class Product {
     public Scanner getScanner() {
        return new Scanner(System.in);
    }
    protected long id;
    protected String name;
    protected Integer year;
    protected Float price;

    public Product(long id, String name, Integer year, Float price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.price = price;
    }
    public Product() {
        this.id = System.currentTimeMillis();
    }
    
    public abstract void input();
    public abstract void display();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
}
