/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.tutorials;

public class Circle extends Shape{
    private Double radius;
    
    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Circle(String name, String color, Double radius) {
        super(name, color);
        this.radius = radius;
    }
    
}
