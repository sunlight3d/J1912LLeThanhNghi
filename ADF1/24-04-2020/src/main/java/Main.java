//1 byte = 8 bit . VD: 10001100 = 1*2^7 + 0 * 2^6 + 0 * 2^5 + ...0 * 2^0 = so thap phan
//1 byte max = 2^8 - 1 = 255(0 - 255)
//8 bytes = 64 bit => 0 -> 2^64 - 1
//synchronized("khối lệnh") =bên trong "khối lệnh" => chỉ có 1 thread đc chạy, tại 1 thời điểm
//

public class Main {
    public static void main(String[] args) {
        //js co then funcA().then(kq).catch(err)
        //identifiers, ten bien, ham, ten class, ten object
        String s = new String("xyz");
        s = s + s;
        assert(5 > 3);
        assert(10 <9);
        assert(1 == 1);
        try {
            int arr[]={1,2};
            arr[2]=3/0;
            System.out.println(arr[0]);
        }  catch (ArithmeticException | Exceptione){
            System.out.println("Exception");
        } catch (Exception e){
            System.out.println("Exception");
        }
    }
}
