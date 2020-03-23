package com.company;
//class cha la final => class con KO ke thua duoc
//final = const = sealed
public class Person {
    //person duoc goi la lop cha = super class = parent class
    private String name;
    private String email;
    private Integer age;
    //se co ban doc o dau do rang: private thi lop con se ko nhin thay ?
    //Lop con va lop cha

    Person(String name, String email, Integer age) {
        System.out.println("Ham khoi tao - constructor cua lop cha");
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    void doSomething() {
        //lop cha co phuong thuc doSomething
        //Lop con cung co phuong thuc nay, ten va params giong het nhau
        //overrride = ghi de
        System.out.println("Phuong thuc doSomething cua lop cha");
    }

    @Override
    public String toString() {
        return
                "name='" + name + "\n" +
                ", email='" + email + "\n" +
                ", age=" + age + "\n";

    }
}
