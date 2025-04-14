package Sorting;

import java.util.Arrays;

public class CountingSort {
    static void sort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int j : arr) {
            largest = Math.max(largest, j);
        }

        int[] count = new int[largest+1];
        for (int j : arr) {
            count[j]++; // incrementing the value which comes again and again
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,45,0,11,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
