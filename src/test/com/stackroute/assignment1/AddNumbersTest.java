package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.AddNumbers;
import main.java.com.stackroute.assignment1.AddNumbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumbersTest {
    AddNumbers add;
    @Before
    public void setUp(){
        add=new AddNumbers();
    }
    @Test
    public void addingOfnumberstestcase1()
    {
        int sum=add.addingnumbers(new int[]{10,20,30,40});
        assertEquals(100,sum);
    }
    @Test
    public void addingofnumberstestcase2()
    {
        int sum=add.addingnumbers(new int[]{70,20,30,40});
        assertEquals(160,sum);
    }
    @After
    public void tearDown()throws Exception
    {
        add=null;
    }


}