package Arrays;

import java.util.Arrays;

public class PassingArrraysToMethods {
//    public static void change(int[] naman) {
//        naman[1] = 99;
//    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; true; j++) {
                if (target == (nums[i]+nums[j])) System.out.println(i+" "+j);
                return new int[]{i, j};
            }
        }
        return nums;
    }


    public static void main(String[] args) {
//        // In Java, Arrays are reference variables meaning they are pass by reference
//        int[] arr = {12,23,62,19,55};
//
//        System.out.println(arr[1]);
//        change(arr);
//        System.out.println(arr[1]); // see both the names point to same memory location
//
//
//        // We can swap array value using a function which is not possible in int
//        int a = 10;
//        int b = 20;
//        System.out.println(a+" "+b);
//        swap(a,b);
//        System.out.println(a+" "+b);



        // Find the doublet in the array whose sum is equal to the given value of x (Two Sum)
        int[] arr = {12,21,38,69,74,83};
        int x = 81;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (x == (arr[i]+arr[j])) System.out.println(i+" "+j);
            }
        }

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static class TwoPointers {

        public static int[] reverseUsingArray(int[] nums){
            int n = nums.length;
            int[] temp = new int[n];
            for (int i = 0; i < n ; i++) {
                temp[i] = nums[n-1-i];
            }
            return temp;
        }

        public static int[] withoutArray(int[] nums){
            int n = nums.length, temp = 0;
            for (int i = 0; i < n/2; i++) {
                temp = nums[n-1-i] ;
                nums[n-1-i] = nums[i];
                nums[i] = temp;
                // Simplify it using j=n-1
            }
            return nums;

            // Same is done using while loop too
    //        int i=0,j=n-1;
    //        while (i<j){
    //            temp = nums[j] ;
    //            nums[j] = nums[i];
    //            nums[i] = temp;
    //            i++;
    //            j--;
    //        }
        }

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9};
            System.out.println(Arrays.toString(reverseUsingArray(arr)));
            System.out.println(Arrays.toString(withoutArray(arr)));


            // Rotate an array by n positions from left
        }
    }
}
