package com.aptech.learnarray;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learn array");
        //array = mang
        //mang cac so nguyen
        Integer[] numbers = {5, 3, 4, 6, 7};
        //khác trong c, là mình có thể viết 1 mảng có phần tử bất kỳ
        //Map rất hay dùng trong thực Map
        //Map tạo ra 1 đối tượng có cac thuộc tính và giá trị mà ko phải tạo ra class
        //Hợp lý khi mà dữ liệu lấy có nhiêu trường, ko ổn định
        //VD: đối tượng person có name, email,....
        //kiểu Map còn đc gọi là "dictionary", "json"
        //kieu map = dictionary = json = kieu key-value
        //hash = băm, đánh chỉ số cho các thuộc tính
        //khi gọi ra chỉ cần tên trường là ra đc giá trị
        //thích hợp với kiểu lưu tọa độ. VD: tọa độ x,y của 1000 điểm
        //Làm ví dụ luôn
        Hashtable<String, Object> personA = new Hashtable<String, Object>();
        personA.put("name", "Hoang");
        personA.put("email", "hoang@gmail.com");
        personA.put("age", 30);//có thể thêm nhiều thuộc tính khác tùy ý, mà ko cần tạo class person
        //nhược điểm: dự án lớn, dùng đi dùng lại 1 kiểu đối tượng => khó maintain
        //VD2 lưu tọa độ 1000 điểm ?
        Hashtable<Double, Double> points = new Hashtable<>();
        points.put(1.2, 3.3);
        points.put(2.2, 4.3);
        points.put(3.2, 5.3);//...vv, ra nhieu diem, 1000 diem
        //Lúc lấy dữ liệu ra
        System.out.println("Gia tri cua y tai x = 2.2 la :"+points.get(2.2));
        //Neu ban dung 2 mang x, mang y => moi lan tim y, lai phai duyet, xem cho nao co cai x do
        //interface san co cua Java ? Serializable, Cloneable,...
        Person mrHoang = new Person("Hoang", "hoang@gmail.com", 30);
        FileManagement.savePersonToFile(mrHoang);
    }
}
