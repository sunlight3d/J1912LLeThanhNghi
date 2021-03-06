/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;
//abstract = do dang, chua hoan thanh = unfinished 
//cu the: 1 abstract method = 1 phuong thuc/ham chi co ten, ko co phan thuc thi
//VD: class Shape(hinh dang bat ky) co phuong thuc/method ten la tinh dien tich(getArea())
//ham getArea() ko thuc thi duoc => getArea goi la 1 abstract method
//class nao ma chua abstract method => cung la abstract class
//Bat ky class nao ke thua tu abstract class BAT BUOC phai thuc thi phuong thuc abstract

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
        System.out.println("Enter description : ");
        this.setDescription(Menu.getScanner().nextLine());
        System.out.println("Enter producer: ");
        this.setProducer(Menu.getScanner().nextLine());
        System.out.println("Enter price: ");
        this.setPrice(Menu.getScanner().nextDouble());
        System.out.println("Enter number of pages: ");
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
