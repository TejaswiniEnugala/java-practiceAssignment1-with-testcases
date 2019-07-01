package main.java.com.stackroute.assignment1;  //It is a program to check whether our guessed number matches the original number

public class GuessNumber {
    public static String checkWhetherTheGuessedNumberMatchesTheActualNumber(int n)
    {
        int m=51;
        String s="";
        if (n > 1 && n < 100) {
            if (n == m) {
                s="number guessed matches the original number";

            } else if (n > m) {
                s="number is greater than original number";
            } else if (n < m) {
                s="number is smaller than original number";
            }
        }
        else
            s="number is not in range";
        return s;
    }

}
