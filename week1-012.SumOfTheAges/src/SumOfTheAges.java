
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nom1 = reader.nextLine();

        System.out.print("Type your age: ");
        int age1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String nom2 = reader.nextLine();

        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());

        int sum = age1 + age2;
        System.out.print(nom1 + " and " + nom2 + " are " + sum + " years old in total.");
        // Implement your program here
    }
}
