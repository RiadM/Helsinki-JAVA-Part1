import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        Boolean continueProg = true;
        BirdDatabase panopticon = new BirdDatabase();


        while(continueProg){
            System.out.print("?");
            String userInput = reader.nextLine().toLowerCase();


            if(userInput.equalsIgnoreCase("add")){
                    System.out.print("Name: ");
                    String nameBird = reader.nextLine();

                    System.out.print("Latin Name: ");
                    String nameLatin = reader.nextLine();
                    Bird x = new Bird(nameBird,nameLatin);
                    panopticon.add(x);
            }
            if(userInput.equalsIgnoreCase("observation")) {
                System.out.print("What was observed:? ");
                String observedBird = reader.nextLine();
                panopticon.observed(observedBird);
            }

            if (userInput.equalsIgnoreCase("statistics")) {
                panopticon.statistics();
            }
            if (userInput.equalsIgnoreCase("show")) {
                System.out.print("What? ");
                panopticon.show(reader.nextLine());
            }
            if(userInput.equalsIgnoreCase("quit")){
                continueProg = false;
            } else{

                }
        }
    }

}
