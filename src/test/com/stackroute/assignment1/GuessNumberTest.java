package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.GuessNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber num;
    String actualResult;
    String expectedResult;

    @Before
public void setUp(){
        num=new GuessNumber();
    }
    @Test
    public void checkingIfGuessedNumberMatchesTheOriginalNumber()
    {
        String result=num.checkWhetherTheGuessedNumberMatchesTheActualNumber(51);
        expectedResult="number guessed matches the original number";
        assertEquals(expectedResult,result);
    }
    @Test
    public void checkIfGuessedNumberIsSmallerThanActualNumber()
    {
        String result=num.checkWhetherTheGuessedNumberMatchesTheActualNumber(49);
        expectedResult="number is smaller than original number";
        assertEquals(expectedResult,result);
    }
    @Test
    public void checkIfGuessedNumberIsGreaterThanActualNumber()
    {
        String result=num.checkWhetherTheGuessedNumberMatchesTheActualNumber(59);
        expectedResult="number is greater than original number";
        assertEquals(expectedResult,result);
    }
    @Test
    public void checkIfTheGuessedNumberIsOutOfRange()
    {
        String result=num.checkWhetherTheGuessedNumberMatchesTheActualNumber(200);
        expectedResult="number is not in range";
        assertEquals(expectedResult,result);
    }
    @After
    public void tearDown()
    {
        num=null;
    }


}