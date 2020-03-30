/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j1912;
public class Bill {
    private Customer customer;//quan he 1-1, 1 bill tuong ung voi 1 khach hang
    private  Double oldValue, newValue;
    private Double fee = 0.0;

    public Bill(Double oldValue, Double newValue) {
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getOldValue() {
        return oldValue;
    }

    public void setOldValue(Double oldValue) {
        this.oldValue = oldValue;
    }

    public Double getNewValue() {
        return newValue;
    }

    public void setNewValue(Double newValue) {
        this.newValue = newValue;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
    
    
}
