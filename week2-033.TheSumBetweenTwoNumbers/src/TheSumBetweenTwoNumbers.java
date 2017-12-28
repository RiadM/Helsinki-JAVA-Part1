
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int numOne = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int numTwo = Integer.parseInt(reader.nextLine());

        int sum = 0;


        while(numOne <= numTwo){
            sum += numOne;
            numOne++;
        }
        System.out.println(sum);
        
    }
}
