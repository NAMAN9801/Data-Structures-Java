package Recursion;

public class TilingProblem {
    public static int tiling(int n){
        // 2xn floor size
        // base case
        if (n==0 || n==1) return 1;

        // kaam h choice lena
        //vertical choice
        int fnm1 = tiling(n-1); // fn-1

        //horizontal choice
        int fnm2 = tiling(n-2);

        return fnm2+fnm1;
    }

    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
