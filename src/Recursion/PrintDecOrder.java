package Recursion;

public class PrintDecOrder {
    static void printDec(int n){
        // Prints number from n to 1 in decreasing order
        if (n != 0){
            System.out.println(n);
            printDec(n-1);
        } else return;
    }

    static void printInc(int n){
        // print numbers from n to 1 in increasing order
        // 1 2 3 4 5 6....n
        if (n>  0){
            printInc(n-1);
            System.out.println(n);
        } else return;
    }

    public static void main(String[] args) {
        printInc(10);

    }
}
