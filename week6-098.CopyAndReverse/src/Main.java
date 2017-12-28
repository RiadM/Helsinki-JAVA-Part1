
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here

        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] array){
        int[] copy = new int[array.length];

        for(int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array){

        int[] copy = new int[array.length];
        int x = array.length;

        for(int i = x ; i > 0; i-- ){
            copy[x - i] = array[i - 1];
        }
        return copy;
    }
}
