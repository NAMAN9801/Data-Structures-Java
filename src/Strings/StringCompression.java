package Strings;

public class StringCompression {
    static String compress(String str){
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer count = 1;
            while(i<str.length()-1 && ch == str.charAt(i+1)){
                // if i were to put the 2 conditions in plce of each other then it gives me index out of bound exception cause when the other is checked it is out of bound for all values of i
                count++;
                i++;
            }

            if (count>1) {
                sb.append(ch);
                sb.append(count.toString());
            }else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }


    static int compressLeetcode(char[] chars){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabc"));
    }
}
