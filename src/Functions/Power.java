package Functions;

import java.util.Scanner;

public class Power {

    static int factorial(int n){

        // single line to find factorial
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {

        // Printing greatest of 3 numbers
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(Math.max(a, Math.max(b,c)));


        // Expressing Permutation and Combination in code
        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int combination = factorial(n)/(factorial(r)*factorial(n-r));
//        int permutation = factorial(n)/factorial(n-r);
//        System.out.println("Permuation: "+ permutation);
//        System.out.println("combination = " + combination);


        // Pascal Traingle - every element is icj
        for (int i = 0; i <=n; i++) {
            for (int k = 0; k <=n-i; k++) {
                System.out.print("  ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print(factorial(i)/(factorial(j)*factorial(i-j))+"   ");
            }

            System.out.println();
        }

    }
}
