/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.baitapngay25032020;

public class Motor extends Vehicle{
    private Double power;
    public Motor(Double power, 
            String      producer, 
            Integer     year, 
            Double      price) {
        super(producer, year, price);
        this.power = power;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "power : "+power;
    }
    
}
