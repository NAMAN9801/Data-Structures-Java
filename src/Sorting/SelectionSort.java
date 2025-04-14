package Sorting;

import java.util.Arrays;
import static Arrays.PassingArrraysToMethods.swap;

public class SelectionSort {
    static void sort(int[] arr){
        for (int i = 0; i < arr.length-2; i++) {
            int smallestIdx = i;
            for (int j = i+1; j < arr.length-1 ; j++) {
                if (arr[j]<arr[smallestIdx]) smallestIdx = j;
            }
            swap(arr[i], arr[smallestIdx]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,45,0,11,-9};
        System.out.println(arr.length);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
