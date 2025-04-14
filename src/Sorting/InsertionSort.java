package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            //finding ut which position to insert
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //Insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,45,0,11,-9};
        System.out.println(arr.length);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
