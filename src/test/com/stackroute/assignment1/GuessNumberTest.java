package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.GuessNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber gn;
    String actualResult;
    String expectedResult;

    @Before
public void setUp(){
        gn=new GuessNumber();
    }
    @Test
    public void checkingGuessMatches()
    {
        String result=gn.guess(51);
        expectedResult="number guessed matches the original number";
        assertEquals(expectedResult,result);
    }
    @Test
    public void checkNumberSmaller()
    {
        String result=gn.guess(49);
        expectedResult="number is smaller than original number";
        assertEquals(expectedResult,result);
    }
    @Test
    public void checkNumberGreater()
    {
        String result=gn.guess(59);
        expectedResult="number is greater than original number";
        assertEquals(expectedResult,result);
    }
    @Test
    public void checkOutOfRange()
    {
        String result=gn.guess(200);
        expectedResult="number is not in range";
        assertEquals(expectedResult,result);
    }


}