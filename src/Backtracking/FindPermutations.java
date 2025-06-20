package Backtracking;

public class FindPermutations {
    public static void permutations(String str, String ans){
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" = "ab" + "de" = "abcde"
            String newStr = str.substring(0,i)+str.substring(i+1);
            permutations(newStr, ans+curr);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str, new String(""));
    }
}
