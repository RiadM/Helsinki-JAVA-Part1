
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
        System.out.print("Type the password: ");
        String passEnter=reader.nextLine();

        if(passEnter.equals(password)){

            System.out.println("Right!");
            System.out.println("This is the best way to go Dylan!!");
            break;}

            System.out.println("Wrong!");
        }}
        // Write your code here
    }

