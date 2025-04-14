package Recursion;

public class Occurence {
    static int firstOcc(int[] arr, int i, int key) {
        if (i == arr.length) return -1;
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, i+1, key);
    }

    static int lastOccurence(int[] arr, int i, int key){
        if (i == 0) return -1;
        if (arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, i-1, key);
    }

    static int power(int x, int n){
        if (n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    static int optimisedPower(int x, int n){
        // O(logn)
//        if (n==0) return 1;
//        if (n%2==0){
//            // even
//            return optimisedPower(x,n/2)*optimisedPower(x,n/2);
//        }else {
//            return x*optimisedPower(x,n/2)*optimisedPower(x,n/2);
//        }
        // the above has bad time complexity of about O(n) as the recursion is called 4 times and its bad

        if(n==0) return 1;
        int halfPower = optimisedPower(x,n/2);
        int halfPowerSqr = halfPower*halfPower;
        if (n%2!=0) halfPowerSqr *=x;
        return halfPowerSqr;

    }

    public static void main(String[] args) {
//        int[] arr = {1,2,2,3,3,2,8,9,7,4,9,5,6,7};
//        System.out.println(firstOcc(arr,0,9));
//        System.out.println(lastOccurence(arr,arr.length-1, 9));

//        System.out.println(power(2,10));
        System.out.println(optimisedPower(2,10));
    }
}
