package Arrays;

import java.util.Arrays;

public class Assignment {
    static void searchingArray(int[][] arr){
        int rowLen = arr.length; //2
        int colLen = arr[0].length; //3
        int count=0;

        for (int[] ints : arr) {
            for (int j = 0; j < colLen; j++) {
                if (ints[j] == 7) count++;
            }
        }
        System.out.println(count);
    }

    public static int matrixSum(int[][] nums) {
        int rowLen = nums.length;
        int colLen = nums[0].length;
        int score = 0, maxnum = Integer.MIN_VALUE;

        for(int i=0; i<rowLen; i++){
            int[] sample = new int[rowLen];

            for(int j=0; j<colLen; j++){
                if(nums[i][j]>maxnum){
                    maxnum = nums[i][j];
                    nums[i][j] = 0;
                }
            }

            sample[i] = maxnum;
            maxnum=Integer.MIN_VALUE;
            score += Arrays.stream(sample).max().orElse(0);
        }

        return score;
    }

    public static void main(String[] args) {
        int[][] array1 = {{4,7,8},{8,8,7}};
//        searchingArray(array1);

//        // Flatten the 2D array, filter elements equal to 7, and count them
//        long count = Arrays.stream(array1)
//                .flatMapToInt(Arrays::stream)
//                .filter(x -> x == 7)
//                .count();
//
//        System.out.println("Number of 7's: " + count);

        System.out.println(matrixSum(array1));

    }
}
