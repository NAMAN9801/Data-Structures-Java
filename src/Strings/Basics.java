package Strings;

import java.util.Scanner;

public class Basics {

    static String substring(String str, int si, int ei){
        // printing a substring from i to j where j is excluded
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("xyz");

        // Strings are immutable
        Scanner sc = new Scanner(System.in);
//        String name;
////        name = sc.next(); // for single word, when space it doesn't take input
//        name = sc.nextLine();
//        System.out.println(name.length()); // length is a function in String not in array
//
//        System.out.println(name+ " this is concatenation");
//        System.out.println(name.charAt(0)); //String indexing
//


//        // String Comparison in Java
//        // Here == doesn't always work as it checks if obj1 is same as obj2 at object level but doesn't care to check its elements inside hence it is not recommended to use this. Instead use equalsto built in function of java
//        // This concept is known as interning
//        String s1 = "Tony";
//        String s2 = "Tony";
//        String s3 = new String("Tony"); // newly created string is an argument of the original string
//
//        if (s1 == s2) System.out.println("s1 and s2 are equal");
//        if (s2==s3 || s1==s3) System.out.println("Equal");
//        else System.out.println("Not equal s3 with any of them");
//        if (s1.equals(s3)) System.out.println("Equals function checks the value of both and hence they are equal.");



        // Printing Substring
        System.out.println(substring("Hello World", 0, 5));
        System.out.println(str.substring(0,2)); //in-built java substring number
    }
}
