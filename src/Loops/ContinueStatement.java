package Loops;

import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {

//        // Program to print odd numbers with continue
//        for (int i = 1; i <=100; i++) {
//            if (i%2==0) continue;
//            System.out.println(i);
//        }


        // Program to count digits of a given number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n==0) count++;
        while (n != 0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
