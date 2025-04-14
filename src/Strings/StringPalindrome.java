package Strings;

public class StringPalindrome {
    static boolean isPalindrome(String str){
        String str2 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().replaceAll("\\s", "");
        int n = str2.length();

        for (int i = 0; i <str2.length()/2 ; i++) {
            if (str2.charAt(i) !=str2.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
