package Arrays;

import java.util.Scanner;

public class test {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int maxNum = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static int countDigits(int n){
        // Write your code here.
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();

        int copyN = n;
        int count =0;
        while (n!=0){
            int testNum = n%10;
            if (testNum != 0){
                System.out.println(testNum);
                if (copyN%testNum == 0){
                    count++;
                }
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] arr = {4, 7, 8, 6, 7, 6};
//        System.out.println(largestElement(arr, 5));

        System.out.println(countDigits(660));
        System.out.println("Naman");


    }
}
