package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.Sort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort obj;
    String  actualResult;
    String expectedResult;
    @Before
    public void setup()throws Exception{
        obj=new Sort();
    }
    @Test
    public void sortAndSumOfEvenNumbers()
    {
        actualResult=obj.sortingList(new int[]{10,20,70,30});
        expectedResult="sum of even numbers is 130";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void sortAndSumOfEvenNumbers1()
    {
        actualResult=obj.sortingList(new int[]{9,7,2,3,6,8});
        expectedResult="sum of even numbers is 16";
        assertEquals(expectedResult,actualResult);
    }

}