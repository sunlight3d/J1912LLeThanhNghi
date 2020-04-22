//cai tien cua Java => Kotlin
//Dart (Flutter)
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Example.doSomething(Example.sum2Numbers(1, 2));//có vẻ như function của function ? => ko phải
        Integer x = Example.sum2Numbers(1, 2);
        Example.doSomething(x);//đầu vào vẫn là 1 biến kiểu Integer ~đầu vào của hàm này vẫn là 1 variable, ko phải function    }
        //Gọi doSomething2 ???
        Example.doSomething2((int a, int b) -> {
            //Viết theo cách "biểu thức lambda":
            return a + b;//phần thực thi thì nắm ở nơi gọi(Main)
        });
        //Viết theo cách "biểu thức lambda" rút gọn:
        Example.doSomething2((int a, int b) -> a + b);
        //Viết theo kiểu "cổ điển", dùng interface
        Example.doSomething2(new ISumSomething() {
            @Override
            public Integer sum2Int(int x, int y) {
                return x + y;//thuc thi, cong viec cua lap trinh vien
            }
        });
        Example.doSomething4(new IOfficeWorks() {
            @Override
            public Integer photoSomeBooks() {
                System.out.println("toi photo 100 trang sach ");
                return 120;
            }

            @Override
            public void summarizePages(int pages){
                System.out.println("Tom tat "+pages+" trang sach");
            }
        });
        //Áo dụng cơ chế này làm ví dụ như sau:
        //Có 1 class Screen có hàm show()
        //khi gọi hàm show, phải đi qua các hàm funA, B, C,
        //trong hàm main, thực thi các funcA, B, C
        //Example là thư viện, còn Main là của lập trình viên viết
    }
}
