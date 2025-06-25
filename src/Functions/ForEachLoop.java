package Functions;

public class ForEachLoop {

    /* In this Exercise, we will be deep diving into For each loop also known as enhanced loop. To help it understand
    * properly we will be doing the following exercises:
    * - Sum in an array
    * - Maximum in an array
    * - */



    public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,3,7,5};
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i : arr){
//            System.out.println(i); // here i is not the iterator but the element itself
            sum +=i;
            if (i>=max) max = i;
        }
        System.out.println(sum);
        System.out.println(max);
    }
}
