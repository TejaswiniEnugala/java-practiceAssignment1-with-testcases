package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.NumberPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPatternTest {
    NumberPattern num;
    @Before
    public void setUp()
    {
        num=new NumberPattern();

    }

    @Test
    public void printnumberPattern ()
    {
        String result=num.printNumbersInSpecificPattern(3);
        assertEquals("122333",result);
    }
    @Test
    public void printnumberInSepecificPattern()
    {
        String result=num.printNumbersInSpecificPattern(5);
        assertEquals("122333444455555",result);
    }
    @After
    public void tearDown()throws Exception{
        num=null;
    }

}