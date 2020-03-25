/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

public class Book extends Product{
    private Integer numberOfPages = 0;

    
    public Book(String code, 
            String name, 
            String description, 
            String producer, 
            Double price,
            Integer numberOfPages) {
        super(code, name, description, producer, price);
        this.numberOfPages = numberOfPages;
    }
    public void inputBook() {
        System.out.println("Code : ");
        this.setCode(Menu.getScanner().nextLine());
        this.setDescription(Menu.getScanner().nextLine());
        this.setProducer(Menu.getScanner().nextLine());
        this.setPrice(Menu.getScanner().nextDouble());
        this.setNumberOfPages(Menu.getScanner().nextInt());
    }
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString()+
                "numberOfPages = "+ this.numberOfPages;
    }

    
    
    
}
