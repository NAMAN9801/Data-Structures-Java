import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int reverse =0;
        while(n!=0){
            reverse*=10;
            int lastDigit = n%10;
            reverse+=lastDigit;
            n/=10;
        }
        System.out.println("reverse = " + reverse);
        System.out.println("Sum: "+(reverse+num));
    }
}
