/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.j1912;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        ArrayList<Bill> bills = new ArrayList<Bill>();
        //Nhap thong tin bang menu => tu lam 
        //cach 2: fake du liau 
        Customer mrHoang = new Customer("Hoang", "Duong A, pho B", "123");
        //mrHoang se co 1 hoa don tien dien
        Bill billMrHoang = new Bill(10.0, 15.0);
        //Tham chieu quan he 1 - 1 ?
        mrHoang.setBill(billMrHoang);
        billMrHoang.setCustomer(mrHoang);
        //Tinh so tien mr Hoang phai tra
        System.out.println("so tien mr Hoang phai tra : "+mrHoang.getElectricalFee());
        
        
        
        
    }
}
