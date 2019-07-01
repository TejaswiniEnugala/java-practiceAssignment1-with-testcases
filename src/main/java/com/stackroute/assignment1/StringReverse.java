package main.java.com.stackroute.assignment1;// This program is to find reverse of a string
public class StringReverse {
    public static String StringReverse(String str) {
        int i;
        String stringreverse = "";
        for (i = str.length() - 1; i >= 0; i--) {
            stringreverse = stringreverse + str.charAt(i);
        }
        return stringreverse;
    }
}



