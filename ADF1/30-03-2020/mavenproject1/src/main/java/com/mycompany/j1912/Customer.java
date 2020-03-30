/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j1912;
public class Customer {
    private String name, address, code;
    private Bill bill;
    public Customer(String name, String address, String code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }
    //Quan he 1-1 : trong doi tuong nay chua tham chieu den doi tuong kia
    //chu y phai tham chieu
    public Double getElectricalFee() {
        return (this.bill.getNewValue() - this.bill.getOldValue()) * 5.0;
    }
    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}
