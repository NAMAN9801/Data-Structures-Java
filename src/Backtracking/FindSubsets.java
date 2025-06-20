package Backtracking;

public class FindSubsets {
    public static void findSubsets(String str, StringBuilder ans, int i){
        // base case
        if (i==str.length()){
            if (ans.length() == 0) System.out.println("null");
            System.out.println(ans);
            return;
        }

        // Yes choice: Add character and recurse
        findSubsets(str, ans.append(str.charAt(i)), i+1);
        ans.deleteCharAt(ans.length()-1);

        // No choice: Recurse without adding character
        findSubsets(str, ans, i+1); // backtracking step
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, new StringBuilder(""),0);
        // will have time complexity of O(2^n*n)
    }
}
