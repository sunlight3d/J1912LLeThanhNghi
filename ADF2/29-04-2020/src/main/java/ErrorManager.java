import java.util.Hashtable;

public class ErrorManager {
    public static final Integer ERROR_NOT_INTEGER = 100;
    public static final Integer ERROR_NOT_9 = 101;
    //Tạo ra đối tượng duy nhất ErrorManager, ko dùng static
    private Hashtable<Integer, String> errorList;
    private ErrorManager(){
        //chua thay doi tuong Hashtable ??
    }
    public Hashtable<Integer, String> getErrorList(){
        if(errorList == null) {
            errorList = new Hashtable<>();
            errorList.put(ERROR_NOT_INTEGER, "Ko phai so nguyen");
            errorList.put(ERROR_NOT_9, "So 9 la ko duoc");
        }
        return errorList;
    }
    public String getMessageFromErrorCode(int errorCode) {
        return errorList.get(errorCode) == null ? "" : errorList.get(errorCode);
    }
    //một biến private static chứa đối tượng "ErrorManager" duy nhất
    private static ErrorManager errorManager;
    //Có 1 hàm để lấy ra đối tượng errorManager "duy nhất" này
    public static ErrorManager getInstance() {
        if(errorManager == null) {
            errorManager = new ErrorManager();
        }
        return errorManager;
    }
    //Test chuc nang "single object"
    //Singleton Pattern
}
