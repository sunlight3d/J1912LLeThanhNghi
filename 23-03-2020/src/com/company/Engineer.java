package com.company;

public class Engineer extends Person {
    public Engineer(String name, String email, Integer age, Integer yearOfExperiences) {
        super(name, email, age);
        this.yearOfExperiences = yearOfExperiences;
    }

    //Engineer : sub class cua Person
    private Integer yearOfExperiences = 0;
    //Lop con co the goi duoc cac phuong thuc, thuoc tinh cua lop cha
    //cac phuong thuc / thuoc tinh cua lop cha phai ; public, protected, default, KO DUOC private

}
