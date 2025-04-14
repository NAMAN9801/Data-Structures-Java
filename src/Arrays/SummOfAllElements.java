package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SummOfAllElements {

    public static int Sum(int[] arr){
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of Array: ");
        int lengthArray = sc.nextInt();
        System.out.println("Enter values of elements: ");
        int[] array1 = new int[lengthArray];

        for (int i = 0; i < array1.length ; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array1));

        System.out.println(Sum(array1));
    }
}
