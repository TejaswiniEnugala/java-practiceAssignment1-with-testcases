package main.java.com.stackroute.assignment1;     //This program is to pattern certain pattern of a string

public class StringPattern {

    public static String printStringSequence(String str,int n) {
        int len=str.length();
        String string=str;
        int j=len-n;
        for(int k=0;k<n;k++)
        {
            for(int i=j;i<len;i++)
            {
                string=string+str.charAt(i);
            }
        }
        return string;
    }
}
