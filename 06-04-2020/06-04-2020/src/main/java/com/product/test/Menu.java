/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.test;

import com.product.Product;
import com.product.books.Book;
import com.product.computers.Computer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Product> products = new ArrayList<>();
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    public void shoeMenu() {
        Integer choice; 
        do {
            System.out.println("1. Input information for n Computers. ");
            System.out.println("2. Input information for n Books. ");
            System.out.println("3. Display information of n Computers by sorting the price descending. ");
            System.out.println("4. Display information of n Books by sorting the publisher ascending");
            System.out.println(" 5. Exit");
            System.out.println(" Your choice:");                                   
            choice = getScanner().nextInt();
            switch(choice) {
                case 1: 
                    this.inputComputers();
                    break;
                case 2: 
                    this.inputBooks();
                    break;
                case 3: 
                    this.sortComputersByPrice();
                    break;
                case 4: 
                    this.sortBooksByPublisher();
                    break;
                default:
                    break;
            }
        }while(choice != 5);
    }
    private void inputComputers() {
        System.out.println("Enter number of computers: ");
        Integer numberOfComputers = getScanner().nextInt();
        for(int i = 0; i < numberOfComputers; i++) {
            Computer computer = new Computer();
            computer.input();
            products.add(computer);
        }
    }
    private void inputBooks() {
        System.out.println("Enter number of books: ");
        Integer numberOfBooks = getScanner().nextInt();
        for(int i = 0; i < numberOfBooks; i++) {
            Book book = new Book();
            book.input();
            products.add(book);
        }        
    }
    private void sortComputersByPrice() {
        ArrayList<Computer> computers = new ArrayList<>();
        for(Product p: this.products) {
            if(p instanceof Computer) {
                computers.add((Computer)p);
            }
        }
        computers.sort((computer1, computer2) -> {
            return computer1.getPrice().compareTo(computer2.getPrice());
        });
        //display
        for(Computer c: computers) {
            c.display();
        }
    }
    private void sortBooksByPublisher() {
        ArrayList<Book> books = new ArrayList<>();
        for(Product p: this.products) {
            if(p instanceof Book) {
                books.add((Book)p);
            }
        }
        books.sort((b1, b2) -> {
            return b1.getPublisher().compareTo(b2.getPublisher());
        });
        //display
        for(Book b: books) {
            b.display();
        }
    }
}
