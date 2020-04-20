import java.lang.reflect.Array;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Book {
    private String name,description;
    private Integer year;
    private static Book[] books = {};//Cap phat 1 mang rong
    private static Book[] filteredBooks = {};//Cap phat 1 mang rong
    private static Stream<Book> streamBooks = Stream.of(new Book[]{});

    public Book(String name, String description, Integer year) {
        this.name = name;
        this.description = description;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    //Trong cac bai truoc, minh co the dung Book Manager de quan ly
    //Quan he: 1 BookManager quan ly N Book
    //Neu ko dung Book Manager thi co the viet truc tiep len Book ?
    //
    public static void insertBooks() {
        Book book1 = new Book("Java", "Java programming for dummies", 2019);
        Book book2 = new Book("C++", "C an C++ programns", 2020);
        Book book3 = new Book("SQL Server", " programns SQL Server 2018", 2018);
        Book.books = new Book[]{book1, book2, book3}; //ok nhung books co ve thua ?
        streamBooks = Stream.concat(streamBooks, Stream.of(books));
        streamBooks.forEach(book -> {
            System.out.println(book.toString());
        });
    }
    public static void filterBooks() {
        //ket qua cua filter luon luon doc lap voi Stream ban dau
        //VD: app contact tren iphone
        System.out.println("Sau khi filter");
        streamBooks = Stream.of(books);
        filteredBooks = streamBooks.filter(book -> book.year > 2019).toArray(Book[]::new);
        System.out.println("haha");
        //Ket luan: stream sinh ra de thao tac, tinh toan,...
        //books va filteredBooks de luu tru
    }
    public static void updateBook() {
        //ko can dung stream ??
        Book book = books[1];
        book.setName("Lap trinh Android");
        System.out.println("haha");
    }
    //Map = anh xa rat hay
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                '}';
    }
}
