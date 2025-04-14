import java.util.Scanner;

public class StarTriangleUlta {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        // Star pattern ulta
        // 1234 123 12 1
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j<=n-i+1; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


        // Special condition loop
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j<=n-i+1; j++) {
//                if (i%2==0) System.out.print(i+" ");
//                else System.out.print((char) (i+64)+" ");
//            }
//            System.out.println();
//        }


        // 1 13 135 137
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j<=i; j++) {
//                System.out.print(2*j-1+ " ");
//            }
//            System.out.println();
//        }


        // 1 23 456 78910
//        int a=1;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j<=i; j++) {
//                System.out.print(a+ " ");
//                a++;
//            }
//            System.out.println();
//        }


        // 1 01 101 0101  //GOOD LEVEL QUESTION TO PRACTICE ONCE AGAIN
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=i; j++) {
                // Either this condition or other one
//                if ((i%2!=0 && j%2==1) || (i%2==0 && j%2==0))
//                    System.out.print(1);
//                else System.out.print(0);
                if ((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
