package main.java.com.stackroute.assignment1;

public class StringReverse {
    public static String StringReverse(String str) {
        int i;
        String reverse = "";
        for (i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}



