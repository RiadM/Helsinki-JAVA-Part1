
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList

        ArrayList<String> wordList = new ArrayList<String>();

        while(true) {
            System.out.print("Type a word: ");
            String userWord = reader.nextLine();

            if(userWord.isEmpty()){
                Collections.sort(wordList);
                System.out.println("You typed the following words: ");
                for (String word : wordList){
                    System.out.println(word);
                }
                break;
            } else {
                wordList.add(userWord);
            }

        }
    }
}
