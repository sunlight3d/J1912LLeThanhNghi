/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.tutorials;

public class Main {
    public static void main(String[] args) {
        //Có thể khởi tạo đối tượng từ 1 abstract class ko ? NO !
        //Shape shapeA = new Shape(); //da abstract thi ko the khoi tao duoc
        //nhung co the tham chieu den doi tuong cua lop con ! YES
        Shape rectangleABCD = new Rectangle("ABCD", "red", 12.0, 12.3);
        //lop cha co the tham chieu den cac lop con => OK 
        Shape circleA = new Circle("OR", "green", 10.0);
        //IPlayable mrHoang = new IPlayable();//ko the khoi tao duoc doi tuong tu 1 interface
        //nhung co the viet 1 HOAC NHIEEUUUU class thuc thi(implements, NOT extends) interface
        //Tao 1 doi tuong, sau do dung kieu interface tham chieu den doi tuong do => OK
        Student studentA = new Student(); //ok
        IPlayable studentB = new Student(); //ok
        ILearning studentC = new Student();//ok, nhung chi goi dc cac pphuong thuc cua ILearning
        studentC.gotoLibrary();//
        //studentC.playFootball();//ko goi duoc phuong thuc cua thang interface khac
    }
    
    
}
