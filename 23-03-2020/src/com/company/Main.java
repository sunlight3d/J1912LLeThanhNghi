package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Ke thua - in");
	    final Student studentA = new Student("Nguyen Van A", "aa@gmail.com",18, "school AA");
	    System.out.println("haha");
	    studentA.doSomething();
	    System.out.println(studentA);
	    studentA.setName("xxx");//ok Final la const, nhung thuoc tinh ben trong doi tuong van THAY DOI duoc
        //studentA = new Student("Nguyen Van B", "bb@gmail.com",18, "school AA");
        //final = ko the tham chieu cho doi tuong khac duoc
	    //Khi minh in 1 doi tuong(object) trong java, mac dinh se in gia tri cua ham toString trong doi tuong do
        //bay gio co tinh xoa toString() ?
        if(studentA instanceof Student) {
            System.out.println("is student");
        } else {
            System.out.println("NOT student");
        }
    }
}
