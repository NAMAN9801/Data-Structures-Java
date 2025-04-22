package Recursion;

public class BinaryStringsProblem {
    static void solution(int n, int lastPlace, String str){
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

//        // kaam
        solution(n-1, 0, str+"0");
        if (lastPlace==0){
            solution(n-1, 1, str+"1");
        }

    }

    public static void main(String[] args) {
        solution(3, 0, new String(""));
    }
}
