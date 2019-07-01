package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj;
    String actualResult;
    String expectedResult;
    @Before
    public void setUp()throws Exception{
        obj=new Palindrome();

    }
@Test
    public void checkWhetherItIsPalindrome()
{
    actualResult=obj.checkWhetherNumberIsPalindromeOrNot(121);
    expectedResult="it is a palindrome and the sum is 2";
    assertEquals(expectedResult,actualResult);
}
@Test
public void checkWhetherItIsNotPalindrome()
{
    actualResult=obj.checkWhetherNumberIsPalindromeOrNot(1213);
    expectedResult="notpalindrome";
    assertEquals(expectedResult,actualResult);
}
@After
    public void tearDown()throws Exception{
        obj=null;
}

}