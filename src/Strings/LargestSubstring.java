package Strings;

public class LargestSubstring {
    // Lexicographic format
    static String lexicographic(String[] str){
        String largest = str[0];
        for (int i = 0; i < str.length; i++) {
            if (largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String[] fruits = {"mango", "banana", "orange", "grapes"};
        System.out.println(lexicographic(fruits));
    }
}
