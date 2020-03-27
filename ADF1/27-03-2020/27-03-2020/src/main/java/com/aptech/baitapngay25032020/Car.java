/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aptech.baitapngay25032020;

/**
 *
 * @author User
 */
public class Car extends Vehicle{
    private Integer numberOfSeats;
    private String  typeOfEngine;

    public Car(Integer  numberOfSeats,
            String      typeOfEngine, 
            String      producer, 
            Integer     year,
            Double      price) {
        super(producer, year, price);
        this.numberOfSeats  = numberOfSeats;
        this.typeOfEngine   = typeOfEngine;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public String toString() {
        
        return super.toString()+"\n"+
                "numberOfSeats=" + numberOfSeats +"\n"+
                "typeOfEngine=" + typeOfEngine;
    }
    
}
