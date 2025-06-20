package Backtracking;

import java.util.Arrays;

public class Basics {
    public static void changeArr(int[] arr, int i, int val){
        // base case
        if (i== arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i] = val;
        changeArr(arr, i+1, ++val); //fnx call step
        arr[i] -=2; // backtracking step
    }

    public static void main(String[] args) {
        int[] arr =new int[5];
        changeArr(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    // Remember backtracking is all about choices and how we use it to get all the cases done either decision, enumeration or optimization
}
