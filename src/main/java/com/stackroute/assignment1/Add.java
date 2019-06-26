package main.java.com.stackroute.assignment1;

public class Add {
    public static int Adding(int array[])
    {
        int sum=0;
        for(int i=0;i<array.length;i++) {
            sum = sum + array[i];
        }
        return sum;
        }

}
