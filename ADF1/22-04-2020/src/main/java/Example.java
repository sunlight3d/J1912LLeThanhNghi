public class Example {
    public static void doSomething(Integer x){
        System.out.println("result = "+x);
    }
    public static Integer sum2Numbers(int x, int y) {
        return x + y;
    }
    public static void doSomething2(ISumSomething sumSomething){
        //sumSomething là "con trỏ" tới hàm sum2Int
        //Nên nếu bên trong ISumSomething có từ 2 hàm trở lên => "con trỏ" ko biết đang trỏ đến hàm nào !
        //Nếu có 2 hàm, ta vẫn ok => ví dụ khác
        System.out.println("result = "+sumSomething.sum2Int(4, 3));//thu vien tao ra Button
        //phần truyền tham số và phần thực thi là 2 nơi khác nhau
    }
    public static void doSomething3(){
        //tự giao việc, sau đó tự làm
        ISumSomething sumSomething = new ISumSomething() {
            @Override
            public Integer sum2Int(int x, int y) {
                return x + y;
            }
        };
        System.out.println("result = "+sumSomething.sum2Int(4, 3));
    }
    public static void doSomething4(IOfficeWorks iOfficeWorks) {
        //photo xong moi doc sach
        //Goi 2 viec a, b, noi dung thi thang khac lam ho
        Integer pages = iOfficeWorks.photoSomeBooks();
        iOfficeWorks.summarizePages(pages);
        //Liên hệ sang ví dụ thực tế:
        /*
        Một ứng dụng di động xây dựng sẵn màn hình có Button, Text, ListView,
        xây dựng các hàm photoSomeBooks, summarizePages, ....với photoSomeBooks chạy xong thì đến summarizePages,
        sau dó thì đến funB, C, E,...
        * */
    }
}
