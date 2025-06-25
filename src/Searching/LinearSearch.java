package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,56,78,95,62,48,66,2,35,78,2,13,8,5};

        int[][] nums = {
                {24,12,56},
                {56,9,55},
                {1,2,3}
        };

        System.out.println(search2D(nums, 3));
    }


    static int oneDArray(int[] arr, int target){
        // Assuming all elements are different

        for(int i=0; i<arr.length; i++){
            if (i == target) return i;
        }
        return -1;
    }


    static String search2D(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) return "At "+(i+1)+" "+(j+1);
            }
        }
        return "Not found";
    }
}
