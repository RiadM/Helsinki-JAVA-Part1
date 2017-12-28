import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> wordsList = new ArrayList<String>();

        while(true){

            System.out.print("Type a word: ");
            String userWord = reader.nextLine();

            if(userWord.isEmpty()){
                System.out.println("You typed the following words: ");
                Collections.reverse(wordsList);
                for(String word : wordsList){
                    System.out.println(word);
                }
                break;
            }else{
                wordsList.add(userWord);
            }

        }

    }
}
