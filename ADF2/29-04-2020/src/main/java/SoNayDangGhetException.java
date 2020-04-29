public class SoNayDangGhetException extends Exception {
    private int errorCode;
    public SoNayDangGhetException(int errorCode) {
        super(ErrorManager.getInstance().getMessageFromErrorCode(errorCode));
        this.errorCode = errorCode;
        //ghi vao file

    }
    public SoNayDangGhetException(String message, Throwable cause) {
        super(message.toUpperCase(), cause);
        //ghi vao file
    }
}
