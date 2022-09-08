import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student std1 = new Student("Vimukthi",20,"HillWood");
        Student std2 = new Student("Kasun",21,"HighSchool");
        Student std3 = new Student("Danushka",20,"HighSchool");
        Student std4 = new Student("Ruwan",20,"HillWood");
        Student std5 = new Student("Chamara",20,"HighSchool");
        Student std6 = new Student("Lakshan",20,"HighSchool");
        Student std7 = new Student("Ruwan",20,"HillWood");
        Student std8 = new Student("Amara",20,"HighSchool");
        Student std9 = new Student("Kasun",21,"HighSchool");
        Student std10 = new Student("Chamara",20,"HighSchool");





        ArrayList<Student> list = new ArrayList<>(List.of(std1,std2,std3,std4,std5,std6,std7,std8,std9,std10));

        DublicateFinder finder = new DublicateFinder(list);
        finder.getDuplicates();
        finder.getDistintList();
        try{
            finder.getStudentByName("Vimukthi");
        }
        catch(StudentNotFoundException e){

            e.getMessage();

        }




    }
}