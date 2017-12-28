
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to whath number? ");
        int numUser = Integer.parseInt(reader.nextLine());
        int num = 1;
        while(num <= numUser){
            System.out.println(num++);
        }
        
    }
}
