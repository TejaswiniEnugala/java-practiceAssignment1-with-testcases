package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.StringPattern;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPatternTest {
    StringPattern si;
    @Before
    public void setUp()
    {
        si=new StringPattern();
    }
@Test
    public void returnPatternOfString()
{
    String result=si.print("route",2);
    assertEquals("routetete",result);
}

    @Test
    public void returnPatternOfString1()
    {
        String result=si.print("stack",3);
        assertEquals("stackackackack",result);
    }
}