package main.java.com.stackroute.assignment1;

public class StringPattern {

    public static String print(String str,int n) {
        int len=str.length();
        String s=str;
        int j=len-n;
        for(int k=0;k<n;k++)
        {
            for(int i=j;i<len;i++)
            {
                s=s+str.charAt(i);
            }
        }
        return s;
    }
}
