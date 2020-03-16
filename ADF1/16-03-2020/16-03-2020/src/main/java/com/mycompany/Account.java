/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

public class Account {
    //Tren thuc te, bien static hay dung de luu cac config/settings
    public static final String HOME_PAGE = "https://www.google.com";
    //final = const 
    public static Integer count = 0;
    private String accountNumber;//instance variable
    private Double balance;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        int x = 30; //x la local variable cua ham Account
        count++;
    }
    
}
