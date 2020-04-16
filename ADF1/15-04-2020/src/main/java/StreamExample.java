import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    //Nhap mot danh sach cac doi tuong tu ban phim
    //ko can
    //trong bai nay minh tap trung vao stream
    //cho nay minh viet 1 ham fake data
    private Student[] students = {
            new Student("Hoang", 30, "hoang@gmail.com"),
            new Student("anna", 28, "anna@yahoo.com"),
            new Student("Jonny", 38, "jonny@ymail.com"),
            new Student("tom", 36, "tom@gmail.com"),
    };
    private Stream<Student> streamStudent;
    public void sortData() {
        //dung stream( >= Java 8)
        //convert array sang stream, de tan dung cac ham cua stream
        streamStudent = Stream.of(students);
        //bieu thuc lamda cho biet: "ban muon sap xep theo tieu chi gi?"
        Student[] result = streamStudent.sorted((s1, s2) -> s1.getAge().compareTo(s2.getAge()))
                .toArray(Student[]::new);
        //map = anh xa = tao ra mot array co so phan tu bang so phan tu mang cu
        System.out.println("haha");
        //convert nguoc tro lai Array ban dau(convert Stream -> Array

        /*
        xu ly cac thao tac nang cao tren Array, ArrayList
        1.Convert Array, ArrayList  => Stream
        2.Tan dung cac ham cua stream nhu filter, map, sorted,...
        3.sau khi co ket qua convert nguoc tro lai Array, ArrayList
        * */
    }
    //filter = loc va xoa du lieu
    public void filterData() {
        Stream<Student> streamStudents = Stream.of(students);
        streamStudents.filter(student -> student.getAge() > 30)
        .forEach(s -> {
            System.out.println(s.toString());
        });
    }
}
