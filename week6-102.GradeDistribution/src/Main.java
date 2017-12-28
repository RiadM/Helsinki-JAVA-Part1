import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter


        ArrayList<Integer> gradeList = new ArrayList<Integer>();

        System.out.println("Type exam scores, -1 completes: ");
        int num = 0;
        while( num != -1){
            num = Integer.parseInt(lukija.nextLine());

            if (num < 30 && num >= 0) {
                gradeList.add(0);
            }
            else if (num < 35 && num >= 30) {
                gradeList.add(1);
                }
            else if (num < 40 && num >=35){
                gradeList.add(2);
                }
            else if (num < 45 && num >= 40){
                gradeList.add(3);
                }
            else if (num < 50 && num >= 45){
                gradeList.add(4);
                }
            else if (num <= 60 && num >=50){
                gradeList.add(5);
                }
            else{

            }
    }
        System.out.println("Grade distribution:");

        Collections.sort(gradeList);

        for(int i = 5; i > -1; i--){

            if(gradeList.indexOf(i) == -1){
                System.out.println(i + ":" );
            }else {
                System.out.println(i + ": " + stars(gradeList.lastIndexOf(i) - gradeList.indexOf(i) + 1));
            }
            }
        int acceptanceList = 0;

        if(gradeList.lastIndexOf(0) == -1){
            acceptanceList = gradeList.size();
        } else{
            acceptanceList = gradeList.size() - gradeList.lastIndexOf(0) - 1;
        }

        double acceptancePerc = (double)(100*acceptanceList) / gradeList.size();
        System.out.println("Acceptance percentage: " + acceptancePerc);


}

    public static String stars(int num){
        int x = 0;
        String y = "";
        while(x < num){
            y+="*";
            x++;
        }
        return y;
    }
}
