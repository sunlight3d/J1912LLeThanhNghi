package com.company;

public class Student extends Person{
    public Student(String name, String email, Integer age, String schoolName) {
        super(name, email, age);//super chinh la "this" cua lop cha
        System.out.println("Ham khoi tao cua lop con");
        this.schoolName = schoolName;
        super.doSomething();
    }

    //extends = ke thua = inherite (nghia cua Java)
    //Student = child class = sub class
    private String schoolName;
    //Hai thuc the engineer va student co chung 3 thuoc tinh, 3 thuoc tinh nay thuoc ve class Person
    //VD khac ve bai toan ke thua: di xe bus co ve thang/ve theo ngay
    //Mot so vi du khac:
    //Shape la cha cua Rectangle(hinh chu nhat) va Cirle(hinh tron)
    //DongVAt(parent class), co 3 lop con: DongVatAnCo, DongVatAnThit, DongVatAnTap
    //trong java ko cho phep ke thua nhieu lop(multiple inheritance). VD: DongVatAnTap ke thua tu DongVatAnCo VA DongVatAnThit la KO DUOC
    //c++, python thi cho phep nhu the
    //multi-level: ke thua nhieu CAP => OK, NHUNG TRANH LAM DUNG(nhieu nhat den 3)


    @Override //trung ten, trung tham so voi lop cha
    void doSomething() {
        System.out.println("Phuong thuc do something cua lop con");
    }
    //Phuong thuc toString

    @Override
    public String toString() {
        //Muon in ca thong tin cua lop cha thi lam the nao ?
        return super.toString()+
                "schoolName='" + schoolName+ "\n";
    }

    /*
    //overload = trung ten ham(phuong thuc), tham so khac nhau
    public Double calculateArea(Double width, Double height){

    }
    public Double calculateArea(Double radius){

    }

     */
}
