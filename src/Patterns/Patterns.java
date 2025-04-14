import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solid rectangle
//        System.out.println("No of rows: ");
//        int rows = sc.nextInt();
//        System.out.println("No of columns: ");
//        int columns = sc.nextInt();
//        for (int i = 1; i <=rows; i++) {
//            for (int j = 1; j <=columns; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // Pattern 1234  1234 1234
        int n = sc.nextInt();
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n; j++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


        // Pattern ABCD ABCD ABCD
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n; j++) {
//                System.out.print((char) (64+j)+" ");
//            }
//            System.out.println();
//        }


        // Right angles isoceles Triangle
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // 1 12 1234 12345
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        // 1 AB 123 ABCD 12345
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                if (i%2==0) {
//                    System.out.print((char)(j+64)+" ");
//                } else {
//                    System.out.print(j+" ");
//                }
//            }
//            System.out.println();
//        }


        // Star triangle right angled ulta
        for (int i = 1; i <=n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
