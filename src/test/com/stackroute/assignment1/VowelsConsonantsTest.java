package test.com.stackroute.assignment1;

import main.java.com.stackroute.assignment1.VowelsConsonants;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsConsonantsTest {
    VowelsConsonants vo;
    @Before
    public void setUp()
    {
        vo=new VowelsConsonants();
    }
@Test
        public void checkWhetherVowel()

    {

        String result = vo.checkvowel("a");
        assertEquals("vowel ", result);
    }
    @Test
    public void checkWhetherConsonant()

    {

        String result = vo.checkvowel("b");
        assertEquals("consonant ", result);
    }
    @Test
    public void checkWhetherVowel1() {

        String result = vo.checkvowel("ab");
        assertEquals("vowel consonant ", result);
    }
}