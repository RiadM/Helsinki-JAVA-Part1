public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {

        while(amount > 0){
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount > 0){
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int numPrint = 1;
        while(numPrint <= size){
            printWhitespaces(size - numPrint);
            printStars(numPrint);
            numPrint++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int count = 1;
        int stars = 1;
        while( count <= height){
            printWhitespaces(height - count);
            printStars(stars);
            stars+=2;
            count++;
        }
        printWhitespaces((stars / 2) - 2 );
        printStars(3);
        printWhitespaces((stars / 2) - 2 );
        printStars(3);

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
