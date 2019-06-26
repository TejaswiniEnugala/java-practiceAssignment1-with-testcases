package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.Add;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {
    Add add;
    @Before
    public void setUp(){
        add=new Add();
    }
    @Test
    public void addinOfNumbers()
    {
        int sum=add.Adding(new int[]{10,20,30,40});
        assertEquals(100,sum);
    }
    @Test
    public void addinOfNumbers1()
    {
        int sum=add.Adding(new int[]{70,20,30,40});
        assertEquals(160,sum);
    }

}