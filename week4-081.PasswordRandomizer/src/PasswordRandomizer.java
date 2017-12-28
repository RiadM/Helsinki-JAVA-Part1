import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    Random random = new Random();

    private int passwordLength ;


    public PasswordRandomizer(int length) {
        // Initialize the
        this.passwordLength = length;

    }

    public String createPassword() {
        // write code that returns a randomized password

        int turn = this.passwordLength;
       String passwordCreated = "";
        while (turn > 0){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            passwordCreated += symbol;
            turn--;
        }
        return passwordCreated;
    }
}
