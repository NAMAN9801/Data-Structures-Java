package Recursion;

public class TilingProblem {
    public static int tiling2xn(int n){
        // base case of 2xn floor size
        if (n==0 || n==1) return 1;

        // kam
        // our work is to take choice, it can be vertical or horizontal
        // vertical
        int verticalTiles = tiling2xn(n-1); // acc to out logic, we dont ave to think how it works it just completes the task assigned and that is our main concern

        //horizontal
        int horizontalTiles = tiling2xn(n-2);

        return verticalTiles+horizontalTiles; // calling recursive function
    }

    static int tiling4xn(int n){
        // base case
        if (n==0 || n==1 || n==2 || n==3) return 1;
        if (n==4) return 2;

        int fnver = tiling4xn(n-1);
        int fnhor = tiling4xn(n-4);

        return fnhor+fnver;
    }

    public static void main(String[] args) {
//        System.out.println(tiling2xn(5));

        System.out.println(tiling4xn(5));
    }
}


// Here we are having faith that recursive function will give us the correct response for both the choices
