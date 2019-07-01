package main.java.com.stackroute.assignment1;  // It is a program to print numbers in specific pattern

public class NumberPattern {
    public static String printNumbersInSpecificPattern(int n) {
        String str="";
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                str=str+i;
        }
        return str;
    }
}
