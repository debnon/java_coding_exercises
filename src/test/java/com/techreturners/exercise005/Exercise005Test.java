package com.techreturners.exercise005;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @Before
    public void setup() {
        ex005 = new Exercise005();
    }

    
    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }

    
    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    
    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    
    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    
    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }

    
    @Test
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }

    
    @Test
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }

    
    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    
    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseAndNumbersIsAPangram() {
        assertTrue(ex005.isPangram("The fiVE 11 boXing wiZards Jump QuicklY 9001"));
    }

    @Test
    public void checkPerfectLowerCaseSentenceWithDuplicatesIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }
    
    @Test
    public void checkPerfectUpperCaseSentenceWithDuplicatesIsAPangram() {
        
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseAndNumbersAndDuplicatesIsAPangram() {
        assertTrue(ex005.isPangram("The fiVE 11 boXing wiZards Jump QuicklY 9001 The fiVE 11 boXing wiZards Jump QuicklY 9001"));
    }

}
