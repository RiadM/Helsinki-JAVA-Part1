
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("first: ");
        int numOne = Integer.parseInt(reader.nextLine());

        System.out.print("second: ");
        int numTwo = Integer.parseInt(reader.nextLine());

        int num = numOne;
        while(num <= numTwo){
            System.out.println(num++);
        }
        // write your code here

    }
}
