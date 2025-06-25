package Searching;

import java.util.Arrays;

public class BinarySearch {
    // return the idx
    // return -1 if it doesn't exist
    public static int search(int[] nums, int target){
        int start = 0, end = nums.length-1;

        while (start <= end){
            // find the middle element
//            int mid = (start + end)/2; // this may exceed the value of int which may result in error
            // better way to write the same is
            int mid = start + (end-start)/2; //Pure mathematics intuition nothing else

            if (target<nums[mid]){
                end = mid-1;
            } else if (target>nums[mid]){
                start = mid +1;
            } else{
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 8));
        System.out.println(Arrays.toString(arr));
    }
}
