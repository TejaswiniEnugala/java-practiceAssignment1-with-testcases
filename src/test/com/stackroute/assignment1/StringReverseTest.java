package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.StringReverse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse obj;
    String actualResult;
    String expectedResult;
    @Before
    public void setUp()throws Exception{
        obj=new StringReverse();

    }

    @Test
    public void checkReverseOfString()
    {
        actualResult=obj.StringReverse("london");
        expectedResult="nodnol";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkReverseOfString1()
    {
        actualResult=obj.StringReverse("mini");
        expectedResult="inim";
        assertEquals(expectedResult,actualResult);
    }


}