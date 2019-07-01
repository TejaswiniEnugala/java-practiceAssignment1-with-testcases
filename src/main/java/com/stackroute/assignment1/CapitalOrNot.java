package main.java.com.stackroute.assignment1;       //It is a program to check the input whether it is a capital letter or small letter or any other special symbol

public class CapitalOrNot {
        public static String CapitalOrNot( char ch)
    {
        String s="";
        if (ch >= 65 & ch <= 90) {
            s = "uppercase letter";

        }
        else if (ch >= 97 & ch <= 122) {
            s= "smallcase letter";
        }
        else if (ch >= 48 & ch <= 57) {
            s= "digit";
        }
        else if ((ch > 0 & ch <= 47) || (ch >= 58 & ch <= 64) || (ch >= 91 & ch <= 96) || (ch >= 123 & ch <= 127)) {
            s= "special symbol";
        }
        return s;
    }

}
