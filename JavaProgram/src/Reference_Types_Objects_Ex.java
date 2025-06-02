import java.time.LocalDate;

class Student{

}

public class Reference_Types_Objects_Ex {
    public static void main(String[] args) {
        String name = "Het";

        String name1 = new String("Jay");

        System.out.println(name);
        System.out.println(name1);

        Student student = new Student();

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);


    }
}
