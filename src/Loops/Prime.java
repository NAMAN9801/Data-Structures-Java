package Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Checking if a number is composite or not
        boolean flag = true;
        for (int i = 2; i <n/2; i++) {
            if (n%i==0){
                flag = false;
                System.out.println("Composite Number");
                break;
            }
        }
        if (n==1){
            System.out.println("Neither Loops.Prime Nor Composite");
        }
        else {
            if (flag){
                System.out.println("Loops.Prime Number");
            }
        }


        // Approach 2
        // if i is a factor of n then n/i is also a factor of n
        // no of terms before sq root of n and after root of n are equal
        for (int i = 2; i <(int)Math.sqrt(n) ; i++) {
            if (n%i==0){
                flag = false;
            }
        }
        if(n==1){
            System.out.println("Neither prime nor composite");
        }else if(flag){
            System.out.println("Loops.Prime Number");
        }else {
            System.out.println("Composite number ");
        }
    }
}
