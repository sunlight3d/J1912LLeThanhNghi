package com.aptech.learnarray;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileManagement {
    //có hàm lưu 1 đối tượng vào file
    public static Boolean savePersonToFile(Person person) {
        //Exception la gi? Ngoại lệ, khó hình dung
        //những cv mà đầu ra ko care ddc 100%
        //VD: đọc dữ liệu từ file, file đó có thẻ đang bị khóa, chia 2 số mình ko kiểm soát đc lúc user nhập mẫu số = 0,....
        Boolean result = false;
        try {
            FileOutputStream fileOut = new FileOutputStream("c:\\temp\\file1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);//ngã ở đâu vào catch chỗ đó, VÀ ko làm tiếp nữa
            out.close();//giống chơi Sasuke
            fileOut.close();
            System.out.println("Save to file successfully");
            result = true;
        } catch (Exception e1){
            //runtime exception
            System.err.println("Cannot save to file.Error: "+e1.toString());
            result = false;
        }
        //co the co nhieu khoi catch
        //Garbage collection = co che don rac
        return result;

    }
}
