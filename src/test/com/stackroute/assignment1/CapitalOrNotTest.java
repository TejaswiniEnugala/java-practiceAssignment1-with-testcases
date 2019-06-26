package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.CapitalOrNot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalOrNotTest {
    CapitalOrNot obj;
    String actualResult;
    String expectedResult;
    @Before
    public void setUp()throws Exception{
        obj=new CapitalOrNot();

    }

    @Test
    public void checkWhetherItIsSmallerCaseLetter()
    {
        actualResult=obj.CapitalOrNot('c');
        expectedResult="smallcase letter";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkWhetherItIsUpperCaseLetter()
    {
        actualResult=obj.CapitalOrNot('C');
        expectedResult="Capital letter";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkWhetherItIsDigit()
    {
        actualResult=obj.CapitalOrNot('6');
        expectedResult="digit";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkWhetherItIsSpecialSymbol()
    {
        actualResult=obj.CapitalOrNot('%');
        expectedResult="special symbol";
        assertEquals(expectedResult,actualResult);
    }

}