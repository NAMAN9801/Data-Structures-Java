package Divide_Conquer;

import java.util.Arrays;

public class MergeSort {
    static void sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        sort(arr, si, mid); // Left side sorting
        sort(arr, mid + 1, ei); // Right side sorting

        merge(arr, si, mid, ei); // Merge the sorted halves
    }

    static void merge(int arr[], int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;  // Iterator for the left part
        int j = mid + 1; // Iterator for the right part
        int k = 0; // Iterator for the temp array

        // Merging the two sorted parts
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) { // Fixing the comparison logic to ensure stability
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right part
        while (j <= ei) { // Correcting the loop condition here
            temp[k++] = arr[j++];
        }

        // Copy temp back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        sort(arr, 0, arr.length - 1); // Sort the array
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }
}
