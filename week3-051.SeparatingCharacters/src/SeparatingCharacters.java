
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int count = 1;
        while(count <= name.length()){
            System.out.println(count + ". character: " + name.charAt(count-1));
            count++;
        }
    }
}
