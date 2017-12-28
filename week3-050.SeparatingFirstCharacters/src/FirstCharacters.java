import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        if(name.length() >= 3){
            int count = 1;

            while(count <= 3){
                System.out.println(count + ". character: " + name.charAt(count-1));
                count++;
            }
        }
    }
}
