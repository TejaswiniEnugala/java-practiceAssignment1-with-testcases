package main.java.com.stackroute.assignment1;   //program to check whether the given input is a palindrome or not

public class Palindrome {
    public static String checkWhetherNumberIsPalindromeOrNot(int n) {
        int temp, r, sum = 0, add = 0;
        String str;
        temp = n;
        while (n != 0) {
            r = n % 10;
            sum = r + sum * 10;
            n = n / 10;
            if (r % 2 == 0) {
                add = add + r;
            }
        }
        if (sum == temp) {
            str="it is a palindrome and the sum is"+" "+add;
        } else {
            str = "notpalindrome";
        }
        return str;
    }
}

