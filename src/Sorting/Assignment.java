package Sorting;

import java.util.Arrays;
import static Arrays.PassingArrraysToMethods.swap;

// Assignment on implementing all the sorting algorithms in descending order
@SuppressWarnings("DuplicatedCode")
public class Assignment {
    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            //finding ut which position to insert
            while (prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //Insertion
            arr[prev+1] = curr;
        }
    }

    static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean swap = false;
            for(int j=0; j<arr.length-1-i;j++){
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }

            if (!swap) break;
        }
    }

    static void countingSort(int[] arr){
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
        for (int i = count.length-1 ;i >= 0; i--) {
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current element is the largest
            int largestIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                // Find the largest element in the remaining array
                if (arr[j] > arr[largestIdx]) {
                    largestIdx = j;
                }
            }
            // Swap the found largest element with the current element
            int temp = arr[i];
            arr[i] = arr[largestIdx];
            arr[largestIdx] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,45,0,11,9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
