/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.baitapngay25032020;

public class Vehicle {
    private String producer;
    private Integer year;
    private Double price;
    private Color color = new Color(255, 0, 0);    //nho dau cai color lai la 1 object thi sao ?           
    //quan he 1 - 1 : 1 oto co 1 mau
    //thiet ke tu cha xuong con

    public Vehicle(String producer, Integer year, Double price) {
        this.producer = producer;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "producer = "+producer+"\n"+
                "year = "+year+"\n"+
                "price = "+price+"\n"+
                "color = "+color.toString()+"\n";
    }

    
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
