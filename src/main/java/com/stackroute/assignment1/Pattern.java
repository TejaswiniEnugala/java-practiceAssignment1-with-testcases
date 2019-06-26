package main.java.com.stackroute.assignment1;

public class Pattern {
    public static String print(int n) {
        String s="";
        int i,j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                s=s+i;
        }
        return s;
    }
}
