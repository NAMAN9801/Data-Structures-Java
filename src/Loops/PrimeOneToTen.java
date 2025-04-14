package Loops;

import java.util.Scanner;

public class PrimeOneToTen {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        // Print numbers from 1 to n
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }


        // Printing all the even numbers from 1 to 100
//        for (int i = 1; i < 100; i++) {
//            if (i%3==0){
//                System.out.println(i);
//            }
//        }


//        // Print the table of 19
//        for (int i = 1; i <= 10; i++) { // good approach
//            System.out.println(19*i);
//        }
////        for (int i = 1; i <= 190; i++) { // 2nd and worst approach
////            if (i%19==0){
////                System.out.println(i);
////            }
////        }
////        for (int i = 19; i <=190 ; i+=19) { // 3rd approach
////            System.out.println(i);
////        }


//        // Printing table of n where n is the input
//        int n = sc.nextInt();
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(n+"*"+i+"="+(n*i));
//        }


        // Printing AP upto n numbers
        int n = sc.nextInt();
//        for (int i=4; i<=3*n+1; i+=3){
//            System.out.println(i);
//        }


        // Geometric progression
        // 1 2 4 8 16
//        int a=1, r=2;
//        for(int i=0; i<n; i++){
//            System.out.println(a*((int)Math.pow(r,i)));
//        }
//        for (int i=1; i<=n;i++){
//            System.out.println(a); //without using math function
//            a *=r;
//        }


        // Printing highest factor of a number other than the number itself
        int highestFactor = 1;
//        for (int i = 1; i <= n/2; i++) {
//            if (n % i == 0) {
//                System.out.print(i+ " ");
//                if (highestFactor<i){
//                    highestFactor = i;
//                }
//            }     // THIS IS FORWARD APPROACH, FROM REVERSE THE FIRST FACTOR WILL BE THE HIGHEST
//        }
//        System.out.println();
//        System.out.println(highestFactor);

        for (int i = n-1; i >=1 ; i--) {
            if (n%i==0){
                if(highestFactor<i){
                    highestFactor = i;
                }
                System.out.println(highestFactor);
                break;
            }
        }
    }
}