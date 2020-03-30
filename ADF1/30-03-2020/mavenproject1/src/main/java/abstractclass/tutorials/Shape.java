/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.tutorials;

public abstract class Shape {
    //day la 1 class noi ve  1 hinh bat ky
    private String name, color;
    //nhieu pphuong thuc,...
    //Bay gio lai co 1pphuong thuc "ko thuc hien duoc"
    //vd tinh dien tich 
    
    //ko biet cach tinh dien tich hinh bat ky !
    //getArea() ko thuc hien duoc !
    //=> phuong thuc nay chi co dinh nghia ma ko co phan thuc thi
    //dang do = unfinished = abstract
    public abstract Double getArea();//phuong thuc abstract => class chua no cung phai abstract theo
    //phuong thuc abstract KO the la PRIVATE !
    //trong abtract class co duoc phep ham contructor ? YES
    public Shape() {
        
    }
    //Mot abstract class co the co NHIEU abstract methods:
    public abstract Double getPerimeter();//chu vi cua hinh bat ky 
    //cung ko tinh duoc, nen phuong thuc nay la abstract
    
    //override ham Constructor nhu claas binh thuong !
    //Mac du ko tao duoc doi tuong tu abstract class 
    //nhung co the dinh nghia ham constructor 
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
