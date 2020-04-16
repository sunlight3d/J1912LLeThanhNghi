import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FileManager {
    private String fileName = "c:\\temp\\inputEmails.txt";
    public static final String EMAIL_PATTERN = "([a-z0-9]+@[a-z0-9]+\\.[a-z]{2,6})";
    //public static final String EMAIL_PATTERN = "([\\w]+@[\\w]+\\.[a-z]{2,6})";
    ArrayList<String> emails = new ArrayList<>();
    //List , thay bang stream
    public void readEmails() {
        try {
            //Stream tuong duong "linq" trong C#
            //muc dich cung cap nhieu HAM(funtion) xu ly array, danh sach
            String data = new String(Files.readAllBytes(Paths.get(this.fileName)));
            Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);//ko phan biet hoa thuong
            Matcher matcher = pattern.matcher(data);//doc noi dung file text xem co string email ko
            while(matcher.find()){
                System.out.println("Haha");
                String email = matcher.group(0);
                System.out.println("Haha");
                emails.add(email);
            }
            Stream<String> streamEmails = emails.stream();
        } catch (Exception e) {
            System.err.println("CAnnot read data. Error: "+e.toString());
        }
    }
}
