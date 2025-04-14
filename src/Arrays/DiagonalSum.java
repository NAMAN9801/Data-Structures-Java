package Arrays;

public class DiagonalSum {
    public static int diagonalSum(int[][] arr) {
        int sum=0;
        int n=arr.length;
        int i=0, j=n-1;

        while(i<n){
            sum += arr[i][i];
            i++;
        }

        i = 0;

        while (i < n) {
            if (i != j) {
                sum += arr[i][j];
            }
            i++;
            j--;
        }

        return sum;
    }

    //Optimal solution with O(n)
//    public static int diagonalSum(int[][] mat) {
//        int n = mat.length;
//        int sum =0;
//
//        for(int i=0;i<n;i++){
//            sum += mat[i][i];
//            if(i != n-i-1){
//                sum += mat[i][n-i-1];
//            }
//        }
//
//        return sum;
//    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                {5,6,7},
                {13,14,15}};
        System.out.println(diagonalSum(matrix));
    }
}
