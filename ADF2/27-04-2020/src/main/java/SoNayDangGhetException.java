public class SoNayDangGhetException extends Exception {
    private int errorCode;
    public SoNayDangGhetException(String message, int erroCode) {
        //ngon lanh hon ? Viet 1 ham tinh ra Message tu Error code
        //dung Hashtable(nen dung), Array(ko khuyen khich)
        //tai sao phai quan ly nhu the ? sau nay con Multi-language
        super(message.toUpperCase());
        this.errorCode = errorCode;
        //ghi vao file
    }
    public SoNayDangGhetException(String message, Throwable cause) {
        super(message.toUpperCase(), cause);
        //ghi vao file
    }
    public int getErrorCode() {
        return errorCode;
    }
}
