public class StudentNotFoundException extends Exception{


    public StudentNotFoundException(String s) {

        super(s);
        System.out.println("Student Not Found");

    }
}
