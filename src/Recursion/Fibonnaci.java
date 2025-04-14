package Recursion;

public class Fibonnaci {
    static int fib(int n){
        if (n==0 || n==1){
            return n;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.print(fib(5));
    }
}
