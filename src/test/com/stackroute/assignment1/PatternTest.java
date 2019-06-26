package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.Pattern;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern lp;
    @Before
    public void setUp()
    {
        lp=new Pattern();

    }

    @Test
    public void numberPattern()
    {
        String result=lp.print(3);
        assertEquals("122333",result);
    }
    @Test
    public void numberPattern1()
    {
        String result=lp.print(5);
        assertEquals("122333444455555",result);
    }

}