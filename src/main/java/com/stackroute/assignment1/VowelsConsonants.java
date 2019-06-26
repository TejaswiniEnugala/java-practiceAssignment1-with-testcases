package main.java.com.stackroute.assignment1;

public class VowelsConsonants {
    public static String checkvowel (String str)
    {
     String s="";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                s=s+"vowel"+" ";
            } else {
                s=s+"consonant"+" ";
            }
        }
        return s;

    }
}
