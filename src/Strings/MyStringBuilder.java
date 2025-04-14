package Strings;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <='z' ; ch++) {
            sb.append(ch); // just like in python, appends add char at the end of the string/StringBuilder Object
        }
        System.out.println(sb); // prints the String
    }
}
