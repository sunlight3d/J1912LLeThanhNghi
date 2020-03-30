/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.tutorials;

public class Rectangle extends Shape{
    private Double width, height;
    //"Lop con" DA KE THUA tu abstract class => 
    //"lop con" nay phai thuc thi cac phuong thuc abstract cua lop cha ! = BAT BUOC
    @Override
    public Double getArea() {
        return this.width * this.height;
    }

    @Override
    public Double getPerimeter() {
        return 2*(width + height);
    }
    public Rectangle(String name, String color, Double width, Double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }    
}
