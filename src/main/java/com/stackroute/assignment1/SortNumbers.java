package main.java.com.stackroute.assignment1; //This program is to sort the given numbers in an array

public class SortNumbers {
    public static String sortingList(int[] array){
        int i,j,swap;
        int sum=0;
        String string;
        int len=array.length;
        for(i=0;i<len-1;i++)
        {
            for(j=i;j<len-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    swap=array[j];
                    array[j]=array[j+1];
                    array[j+1]=swap;
                }
                else if(array[j]==array[j+1]){
                    array[j]=array[j];
                    array[j+1]=array[j+1];

                }
            }
        }
        string="sorted list of elements";
        for(i=len-1;i>=0;i--)
            System.out.println(array[i]);
        System.out.println();
        for(i=0;i<len;i++)
        {
            if(array[i]%2==0)
            {
                sum=sum+array[i];
            }
        }
        string="sum of even numbers is "+sum;
        if(sum>15){
            System.out.println("true");
              }
else
        {
            System.out.println("false");
        }
return string;
    }
}
