package main.java.com.stackroute.assignment1;  // THis program is to check whether input is vowel or consonant

public class VowelsConsonants {
    public static String checkvowel (String str)
    {
     String string="";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char input = str.charAt(i);
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
                string=string+"vowel"+" ";
            } else {
                string=string+"consonant"+" ";
            }
        }
        return string;

    }
}
