
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here

        int i = 0;
        while(i < array.length){

            System.out.print(array[i]);
            i++;
            if(i == array.length){
                break;
            }
            System.out.print(", ");
        }
    }
}