import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array){
        int smallestNumber = array[0];
        for(int num: array){
            if(num < smallestNumber){
                smallestNumber = num;
            }
        }
        return smallestNumber;
    }

    public static int indexOfTheSmallest(int[] array){
        int x = smallest(array);
        int indexSmall = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
                indexSmall =  i;
                i = array.length;
            }
        }
        return indexSmall;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){

        int smallestNum = array[index];
        int indexx = index;

        for(int i = index; i < array.length; i++){
            if(smallestNum > array[i]){
                smallestNum = array[i];
                indexx = i;
            }
        }
        return indexx;
    }

    public static void swap(int[] array, int index1, int index2){
        int num1 = array[index1];
        array[index1] = array[index2];
        array[index2] = num1;
    }

    public static void sort(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            int smallNum = indexOfTheSmallestStartingFrom(array,i);
            swap(array, i, smallNum);


        }
    }
}
