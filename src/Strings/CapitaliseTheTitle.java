package Strings;

public class CapitaliseTheTitle {
    static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i<str.length(); i++) {
            if (str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder("");

        for(char ch=0; ch<s.length(); ch++){
            sb.append(Character.toLowerCase(s.charAt(ch)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, I am naman";
        System.out.println(toUppercase(str));
    }
}
