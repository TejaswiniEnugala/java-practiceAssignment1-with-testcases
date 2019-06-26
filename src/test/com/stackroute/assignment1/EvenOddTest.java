package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.EvenOdd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd evenodd;
    String actualResult;
    String expectedResult;
    @Before
    public void setUp()throws Exception{
        evenodd=new EvenOdd();
            }
            @Test
    public void checkWhetherItIsEven(){
        actualResult=evenodd.checkWhetherNumberIsEvenOrOdd(20);
        expectedResult="Jerry";
        assertEquals(expectedResult,actualResult);
            }

    @Test
    public void checkWhetherItIsOdd(){
        actualResult=evenodd.checkWhetherNumberIsEvenOrOdd(23);
        expectedResult="Tom";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForOtherCharacters(){

        actualResult=evenodd.checkWhetherNumberIsEvenOrOdd('@');

        expectedResult="input is incorrect";
        assertEquals(expectedResult,actualResult);
    }
@After
    public void tearDown()throws Exception{
        evenodd=null;
}

}