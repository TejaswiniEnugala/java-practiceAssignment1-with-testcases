package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.StringPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPatternTest {
    StringPattern stringpattern;
    @Before
    public void setUp()
    {
        stringpattern=new StringPattern();
    }
@Test
    public void returnPatternOfString()
{
    String result=stringpattern.printStringSequence("route",2);
    assertEquals("routetete",result);
}

    @Test
    public void printPatternOfString()
    {
        String result=stringpattern.printStringSequence("stack",3);
        assertEquals("stackackackack",result);
    }
    @After
    public void tearDown()
    {
        stringpattern=null;
    }
}