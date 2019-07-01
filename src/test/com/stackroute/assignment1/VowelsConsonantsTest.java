package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.VowelsConsonants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsConsonantsTest {
    VowelsConsonants string;
    @Before
    public void setUp()
    {
        string=new VowelsConsonants();
    }
@Test
        public void checkWhetherVowel()

    {

        String result = string.checkvowel("a");
        assertEquals("vowel ", result);
    }
    @Test
    public void checkWhetherConsonant()

    {

        String result = string.checkvowel("b");
        assertEquals("consonant ", result);
    }
    @Test
    public void checkWhetherVowel1() {

        String result = string.checkvowel("ab");
        assertEquals("vowel consonant ", result);
    }
    @After
    public void tearDown(){
        string=null;
    }
}