/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;
//Nhập thêm sản phẩm vào danh sách.
//o Xóa sản phẩm khỏi danh sách.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

//o Xuất thông tin sản phẩm. Mỗi sản phẩm yêu cầu hiển thị đầy đủ thông tin từng
//thuộc tính của sản phẩm đó, mỗi thuộc tính hiển thị trên một dòng.
//o Tìm kiếm thông tin sản phẩm thông qua tên, mô tả, ngày phát hành sản phẩm, loại
//sản phẩm (sách hoặc băng đĩa).
//o Sắp xếp danh sách sản phẩm giảm dần theo giá.
//Thoai chuong trinh
//Viết phương thức main() chứa menu sau để người dùng chọn chức năng
//thực hiện.
public class Menu {
    //Cac ban co the chua 2 danh sach: book va cd
    //Da co ke thua roi => KO CAN THIET
    private ArrayList<Product> products = new ArrayList<>();
    //moi lan goi tao 1 scanner khoi loi dau enter
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
    public void showMenu() {
        int choice = -1;
        while(choice != 6) {
            System.out.println("1.Nhập thêm sản phẩm vào danh sách.");
            System.out.println("2.Xoa san pham.");
            System.out.println("3.Xuất thông tin sản phẩm.");
            System.out.println("4.Tìm kiếm thông tin sản phẩm thông qua tên.");
            System.out.println("5.Sắp xếp danh sách sản phẩm giảm dần theo giá");            
            System.out.println("6.Thoat.");
            System.out.println("Moi ban chon(1-6)");
            choice = getScanner().nextInt();
            switch(choice) {
                case 1: 
                    inputProducts();
                    break;
                case 2: 
                    deleteProduct();//lam truoc 
                    break;
                case 3: 
                    showAllProducts();
                    break;
                case 4: 
                    findProductsByName();
                    break;
                case 5: 
                    sortProductsByPrice();
                    break;
            }
        }
        System.out.println("The End.");
    }
    private void inputProducts() {
        System.out.println("Enter number of products :");
        Integer numberOfProducts = getScanner().nextInt();
        for(int i = 0; i < numberOfProducts; i++) {
            System.out.println("You input Book(1) or CompactDisk(2) : ");
            int type = getScanner().nextInt();
            if(type == Product.TYPE_BOOK) {
                //dung enum de phan biet
                //Hom nay minh dung kieu khac : bien static final 
                //cong viec nhap du lieu la cong viec cua Book                                
                Book newBook = new Book();
                newBook.inputBook();
                products.add(newBook);
            } else if(type ==Product.TYPE_CD) {
                CompactDisk newCompactDisk = new CompactDisk();
                newCompactDisk.inputCompactDisk();                        
                products.add(newCompactDisk);
            }
        }
    }
    private void sortProductsByPrice() {
        this.products
                .sort((product1, product2) 
                        -> product1.getPrice().compareTo(product2.getPrice()));
                
    }
    private void deleteProduct() {
        System.out.println("Enter product's code : ");
        String productCode = getScanner().nextLine();
        //Ben trong remove if la 1 ham, dau vao la tung product trong danh sach
        //dau ra tra ve true / false
        Boolean result = 
                products.removeIf(product -> product.getCode().equalsIgnoreCase(productCode));
        if(result == true) {
            System.out.println("Xoa thanh cong");
        } else {
            System.err.println("Xoa that bai");
        }
    }
    private void showAllProducts() {
        for(Product product: products) {
            if(product instanceof Book) {
                System.out.println(((Book)product).toString());
            } else if(product instanceof CompactDisk) {
                System.out.println(((CompactDisk)product).toString());
            }
        }
    }
    private void findProductsByName() {
        //0.nhap thong tin ten can tim kiem
        System.out.println("Nhap ten san pham can tim : ");
        String productName = getScanner().nextLine();
        
        //1. filter 1 danh sach moi chua ket qua
        ArrayList<Product> result = (ArrayList<Product>)products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(productName))
                .collect(Collectors.toList());
        if(result == null || result.isEmpty()) {
            System.out.println("Ko tim thay san pham");
            return; 
        }
        //2. Duyet danh sach nay va hien thi ra
        for(Product product: result) {
            if(product instanceof Book) {
                System.out.println(((Book)product).toString());
            } else if(product instanceof CompactDisk) {
                System.out.println(((CompactDisk)product).toString());
            }
        }
        
    }
}
