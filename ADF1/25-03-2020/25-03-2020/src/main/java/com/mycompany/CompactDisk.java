/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

public class CompactDisk extends Product{
    private Float duration;

    public CompactDisk(
            String code, 
            String name, 
            String description, 
            String producer, 
            Double price,
            Float duration) {
        super(code, name, description, producer, price);
        this.duration = duration;        
    }

    @Override
    public String toString() {
        return super.toString() + 
                "duration = "+ this.duration;
    }
    
    
}
