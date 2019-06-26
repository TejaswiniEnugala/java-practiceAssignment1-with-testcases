package main.java.com.stackroute.assignment1;

public class EvenOdd {
    public static String checkWhetherNumberIsEvenOrOdd(int inputNumber)
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
