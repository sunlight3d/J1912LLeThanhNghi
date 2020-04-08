/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.test;

import com.product.computers.Computer;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.time.Instant;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test {
    public static void functionA() {
        //filter dung ham san co
        ArrayList<Computer> computers = new ArrayList<>();
        //long id, String name, Integer year, Float price, Float speed, String producer
        computers.add(new Computer(1, "aa", 2001, 120.0f, 235.0f, "bmw"));
        computers.add(new Computer(2, "dd", 2004, 420.0f, 335.0f, "ewse"));
        computers.add(new Computer(3, "cc", 2006, 520.0f, 5635.0f, "ewe"));
        computers.add(new Computer(4, "bb", 2002, 120.0f, 265.0f, "rer"));
        computers.add(new Computer(5, "ee", 2009, 720.0f, 265.0f, "hth"));
        computers.add(new Computer(6, "xx", 2003, 820.0f, 235.0f, "6tj67y"));
        ArrayList<Computer> result = (ArrayList<Computer>)computers.stream()
                .filter(computer -> computer.getYear() == 2003)
                .collect(Collectors.toList());
    }
    public static void functionB() {
        //filter bang tay
        ArrayList<Computer> computers = new ArrayList<>();
        //long id, String name, Integer year, Float price, Float speed, String producer
        computers.add(new Computer(1, "aa", 2001, 120.0f, 235.0f, "bmw"));
        computers.add(new Computer(2, "dd", 2004, 420.0f, 335.0f, "ewse"));
        computers.add(new Computer(3, "cc", 2006, 520.0f, 5635.0f, "ewe"));
        computers.add(new Computer(4, "bb", 2002, 120.0f, 265.0f, "rer"));
        computers.add(new Computer(5, "ee", 2009, 720.0f, 265.0f, "hth"));
        computers.add(new Computer(6, "xx", 2003, 820.0f, 235.0f, "6tj67y"));
        ArrayList<Computer> result = new ArrayList<>();
        for(Computer c: computers) {
            if(c.getYear() == 2003) {
                result.add(c);
            }
        }
    }
    public static void test1() {
        long t1 = Instant.now().toEpochMilli();
        for(int i = 0; i < 1_000_000; i++) {
            functionA();
        }
        long t2 = Instant.now().toEpochMilli();
        System.out.println("duration = "+(t2-t1));

    }
    public static void test2() {
        long t1 = Instant.now().toEpochMilli();
        for(int i = 0; i < 1_000_000; i++) {
            functionB();
        }
        long t2 = Instant.now().toEpochMilli();
        System.out.println("duration = "+(t2-t1));
    }
    public static void main(String[] args) {
        //Hãy thử so sánh sử dụng hàm filter với tự filter lấy, đến thời gian
        //dữ liệu có thể fake cho nhanh(ko cần Scanner):
        //test2();//bang tay 498
        test1();//bang may 625

        /*
        Menu menu = new Menu();
        menu.shoeMenu();
         */
        //Annotations(Java) = chu thich, cho biet cai function/method/property abc co nhung chu y gi
        //thong dung nhat la Override
        //Deprecated annotation = chuan bi vut di
        Computer c1 = new Computer();
        c1.doSomething();//rat hay gap voi lap trinh di dong(Java, Kotlin cho android, Swift/Objective C cho ios)
        //tim kiem thu vien: "read write excel file maven pom"
        XSSFWorkbook workbook = new XSSFWorkbook();
    }
}
