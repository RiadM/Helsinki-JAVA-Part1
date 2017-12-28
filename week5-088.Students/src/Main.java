
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);


        ArrayList<Student> list = new ArrayList<Student>();

        while(true){

            System.out.print("name: ");
            String name = reader.nextLine();

            if(name.isEmpty()){
                break;
            }else{
                System.out.print("studentnumber: ");
                String studentnumber = reader.nextLine();
                list.add(new Student(name, studentnumber));
            }
        }
        int numberOfStudents = 0;
        while(numberOfStudents <= list.size() -1){
            System.out.println(list.get(numberOfStudents).toString());
            numberOfStudents++;
        }

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();

        int searchList = 0;
        System.out.println("Result: ");
        while(searchList <= list.size() - 1){
            String nameStudent = list.get(searchList).getName();

            if(nameStudent.contains(searchTerm)){
                System.out.println(list.get(searchList).toString());
            }
            searchList++;
        }

    }
}