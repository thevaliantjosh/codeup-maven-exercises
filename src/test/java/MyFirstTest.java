import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    private List<String> languages;
    private List<String> moreLanguages;

    private int[] numbers;
    private int[] otherNumbers;

    @Before
    public void setUpLanguages(){
        this.languages = new ArrayList<>(Arrays.asList("Python", "Java", "JavaScript"));

    }

    @Before
    public void setUpMoreLanguages(){
        this.moreLanguages = new ArrayList<>(Arrays.asList("C#", "C++", "PHP"));
    }

    @Before
    public void setUpArrayOfNumbers(){
        this.numbers = new int[]{1, 2, 3};
        this.otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
    }

    @Test
    public void testIfArrayOfNumbersAreEqual(){
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testAStringForCharacters(){
        String language = "PHP";
//        boolean containsAnH = language.contains("H");
//        boolean containsJ = language.contains("J");
//
//        assertTrue("The String \"PHP\" contains an \"H\"", containsAnH);
//        assertFalse("The String \"PHP\" Does not contain a \"J\"", containsJ);

        assertTrue("The String \"PHP\" contains an \"H\"", language.contains("H"));
        assertFalse("The String \"PHP\" Does not contain a \"J\"", language.contains("J"));

//        assertTrue("The String \"PHP\" Does not contain a \"J\"", containsJ);
    }

    @Test
    public void testIfLanguagesAreDifferent(){
       assertNotSame(languages, moreLanguages);
//       assertSame(languages, moreLanguages);

    }

    @Test
    public void testIfNamesAreTheSame(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfArraysAreDifferent(){

    }


}
