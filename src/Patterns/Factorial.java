import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        // Non-Recursive method
//        int fact =1;
//        for(int i=n; i>=1; i--){
//            fact *=i;
//        }
//        for (int i=1; i<=n; i++){
//            fact *=i;
//            System.out.println(fact);
//        }


        // WAP to print ascii value of alphabets
        for(int i=1; i<=160; i++){
            System.out.println(i +" "+ (char)i);
        }
    }
}
