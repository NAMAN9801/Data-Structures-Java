package Divide_Conquer;


import java.util.Arrays;

public class QuickSort {
    static void sort(int[] arr, int si, int ei){
        if (si>=ei) return;

        // last element in parameter only
        int pidx = partition(arr, si, ei); //partition index
        sort(arr, si, pidx-1); //left part
        sort(arr, pidx+1, ei); // right
    }


    static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i=si-1; //to make place for elements smaller than pivots

        for (int j = si; j < ei; j++) {
            if (arr[j]<=pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i; //index of pivot
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5, -5};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
