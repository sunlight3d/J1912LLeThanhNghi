/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass.tutorials;


public interface IPlayable {
    //interface = giao dien ??? = ko may khi dung tieng Viet
    //Ben trong interface ko chua (phuong thuc + phan thuc thi)
    //chi chua ten phuong thuc
    public void playFootball();
    public void playTennis();//hoi giong abstract method
    //trong interface ko chua thuoc tinh thong thuong(instance property)
    //public String name;
    //Nhung co the chua thuoc tinh static
    public static final String x = "abc"; //ok 
    public static void abc() {
        //ok trong interface co the chua phuong thuc static
    }
    //Ko the khoi tao doi tuong tu 1 interface !    
}
