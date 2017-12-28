
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int yearLeap = Integer.parseInt(reader.nextLine());

        if (yearLeap % 4 == 0){
            if (yearLeap % 100 == 0 && yearLeap % 400 != 0){
                System.out.println("The year is not a leap year");
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
