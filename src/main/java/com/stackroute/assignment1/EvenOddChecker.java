//program to check whether the number is even or odd

package main.java.com.stackroute.assignment1;

public class EvenOddChecker {
    public static String checkWhetherNumberIsEvenOrOdd(int inputNumber)       //method to check whether the input is even or odd
    {
        if(((inputNumber%2)==0)&&(inputNumber>=20 && inputNumber <=30)){
            return "Jerry";
        }
        else if(((inputNumber%2)!=0) && (inputNumber>=20 && inputNumber<=30))
        {
            return "Tom";
        }
        else
        {
            return "input is incorrect";
        }
    }

}
