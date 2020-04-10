package com.mycompany.aptech.models;

public class Product {
    private String productName;
    private Integer year;
    private String description;
    private Double price;

    public Product(String productName, Integer year, String description, Double price) {
        this.productName = productName;
        this.year = year;
        this.description = description;
        this.price = price;
    }
    public Product() {

    }
    public static Product createObjectFromString(String line) {
        //Tai sao static ? Ham nay phai co truoc khi tao ra doi tuong
        String[] strings =  line.split(", ");
        if(strings.length == 0) {
            return null;
        }
        String productName = strings[0];
        Integer year = Integer.valueOf(strings[1]);
        String description = strings[2];
        Double price = Double.valueOf(strings[3]);
        return new Product(productName, year, description, price);//fake
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
