package Patterns;

import java.util.Scanner;

public class AdvancedPatterns {
    public static void main(String[] args) {

        // Star Plus
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
//        for (int i=1; i<=rows; i++){
//            for (int j=1; j<=rows; j++){
//                if (i==(rows/2+1) || j==(rows/2+1)) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }


        // Hollow rectangle
//        int cols = sc.nextInt(); // cols
//        for (int i = 1; i<= rows; i++){
//            for (int j = 1; j<= cols; j++){
//                if (i==1 || i==rows || j==1 || j==cols) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }


        // Star Cross
//        for (int i = 1; i<= rows; i++){
//            for (int j = 1; j<= rows; j++){
//                if (i == j || i + j == rows + 1) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }


        // Star Triangle reverse
//        for (int i = 1; i <=rows; i++) {
//            for (int j = 1; j <=rows; j++) {
//                if ((i+j)<rows+1) System.out.print("  ");
//                else System.out.print("* ");
//            }
//            System.out.println();
//        }


        // Numeric star triangle reverse
//        for (int i = 1; i <=rows; i++) {
//            for (int j=1; j<=rows-i; j++){
//                System.out.print("  ");
//            }
//            for (int k=1; k<=i; k++){
//                System.out.print(k+ " ");
//            }
//            System.out.println();
//        }


        // Rhombus
//        for (int i=1; i<=rows; i++){
//            for (int j=1; j<=rows-i; j++){
//                System.out.print("  ");
//            }
//            for (int j=1; j<=rows; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // Star Pyramid
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // using nsp and nst method.....spaces decrease by 1 and start increase by 2
        int nsp=rows-1, nst=1;
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }


        // PATTERNS ARE OVER!!!!
    }
}
