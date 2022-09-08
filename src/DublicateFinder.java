import java.util.ArrayList;

public class DublicateFinder {


    public DublicateFinder(ArrayList<Student> student) {
        this.student = student;
    }

    ArrayList<Student> student = new ArrayList<>();


    ArrayList<String> dublicatedStudent = new ArrayList<>();
    ArrayList<String> distintStudent = new ArrayList<>();

    public ArrayList<String> getDuplicates() {


        for (int i = 0; i < student.size(); i++) {

            for (int j = i+1; j <student.size() ; j++) {

                if((student.get(i).getName()).equals  ((student.get(j).getName()))){
                    if((dublicatedStudent.contains(student.get(i).getName()))){
                        break;
                    }
                    else{
                        dublicatedStudent.add(student.get(i).getName());
                    }
                }

            }
        }

        System.out.println("Dublicated Name List = " + dublicatedStudent);
        return dublicatedStudent;

    }

    public ArrayList<String>  getDistintList() {


        for (int i = 0; i < student.size(); i++) {

            if(!(dublicatedStudent.contains(student.get(i).getName()))){
                distintStudent.add(student.get(i).getName());
            }
        }

        System.out.println("Distint Name List = " + distintStudent);
        return distintStudent;

    }

    public Student getStudentByName(String name) throws StudentNotFoundException {

        boolean consist=false;
        int id = 0;

        for (int i = 0; i < student.size(); i++) {

            if(name.equals(student.get(i).getName())){
                System.out.println(name + "=" +student.get(i));
                id=i;
                consist=true;
                break;
//

            }

        }
        if(!consist){

            throw new StudentNotFoundException("StudentNotFoundException");
        }

        return student.get(id);

    }

}