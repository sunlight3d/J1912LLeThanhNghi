import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Calculation {
    public void doSomething() {
        //conv viec nay, ket qua ko luong truoc duoc, "runtime error"
        int x = 10;
        int y = 1;
        try {
            System.out.println("lam viec 1");
            System.out.println("lam viec 2");
            int z = x / y;
            System.out.println("lam viec 3");
            //doc file thi sao ?
            PrintWriter printWriter = new PrintWriter("C:\\abc.txt");
            System.out.println("lam viec 4");
            System.out.println("Success....");//thanh cong
        } catch (ArithmeticException e) {
            System.err.println("error1 : "+e.toString());
        } catch(FileNotFoundException e) {
            System.err.println("error2 : "+e.toString());
        } finally {
            //luc nao cung chui vao day
            System.out.println("finally");
        }
    }
    //Vi du ve throws ? tự đẩy ra lỗi
    //tự tạo Exception của riêng mình !
    public void doSomething2(int x) throws SoNayDangGhetException {
        //nếu x = 9 => lỗi
        System.out.println("lam viec 1");
        System.out.println("lam viec 2");
        if(x == 9) {
            throw new SoNayDangGhetException("Ko duoc la 9", -2356);
        }
        System.out.println("lam viec 3");
    }
}
