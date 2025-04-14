package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        // code here
        for(int i=0; i<arr.length-1; i++){
            boolean swap = false;
            for(int j=0; j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            if (!swap) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,45,0,11,-9};
        System.out.println(arr.length);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
