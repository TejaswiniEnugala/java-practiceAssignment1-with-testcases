//Adding of numbers in the given input array

package main.java.com.stackroute.assignment1;


public class AddNumbers {
    public static int addingnumbers(int array[])   //addingnumbers is a method that adds given numbers in array
    {
        int sum=0;
        for(int i=0;i<array.length;i++) {
            sum = sum + array[i];
        }
        return sum;
        }

}
