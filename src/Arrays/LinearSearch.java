package Arrays;

public class LinearSearch {

    public int maxElement(int[] arr){
        int temp = -2147483648; // or initialise with first element of arr
        for (int i = 0; i < arr.length; i++) {
            if (temp<=arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }

    public int secondLargest(int[] arr){
        int smax = Integer.MIN_VALUE; // or initialise with first element of arr
        int max = maxElement(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<max && smax<arr[i]){
                smax = arr[i];
            }
        }
        return smax;
    }

    public int largestNumThanX(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11,13,17,23,29};
        int x = 5;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == x){
//                System.out.println("mil gya bc at i="+i);
//            }
//        }


        // Max element in an array
        LinearSearch obj = new LinearSearch();
//        System.out.println(obj.maxElement(arr));
//        System.out.println(obj.secondLargest(arr));


        // Count the number of elements in given array greater than a given number x
        System.out.println(obj.largestNumThanX(arr, 5));
    }
}
