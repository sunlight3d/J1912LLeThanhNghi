package com.mycompany.aptech;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vi du ve file");
        //Bai toan: doc du lieu tu file text
        //Moi dong la 1 doi tuong. VD:
        //iphone 6 plus, 2018, day la iphone 6, 123.55

        //Bia ra file text => chuan csv = Comma Separated Value
        //dac diem: nhe, co the mo bang excel
        //co 1 class lam nhiem vu doc du lieu tu file, convert thanh Object
        FileManagement fileManagement = new FileManagement();
        fileManagement.readFromFile();
        fileManagement.saveProductsToExcel();
    }
}
