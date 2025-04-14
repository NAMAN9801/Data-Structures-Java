package Patterns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // WAP to print Sum of digits of a given number
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count=0, Sum=0;
//        if (n==0) count++;
//        while (n!=0){
//            int lastDigit = n%10;
//            Sum += lastDigit;
//            n /=10;
//            count++;
//        }
//        System.out.println("Count: "+count+"\n"+"Sum: "+Sum);
//

//        // WAP to print product of digits of a given number
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int product = 1;
//        while(n!=0){
//            // non zero condition
//            int lastDigit = n%10;
//            n/=10;
//            if (lastDigit==0) continue;
//            product *= lastDigit;
//        }
//        System.out.println("product = " + product);


        // WAP to print Sum of all the even digits of a given number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while (n!=0){
            int lastDigit = n%10;
            n /=10;
            if (lastDigit%2==0) sum += lastDigit;
        }
        System.out.println("Sum of Even digits: "+sum);
    }
}