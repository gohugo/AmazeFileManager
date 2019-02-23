package com.amaze.filemanager.utils;

import org.junit.Test;

import static com.amaze.filemanager.utils.Utils.getInstance;
import static org.junit.Assert.assertEquals;

public class UtilsTest {
    @Test
    public void testSanitizeInput() {  //This function is sanitize the string. It removes ";","|","&&","..." from string.
        assertEquals("a",getInstance().sanitizeInput("|a|"));  //test the removing of pipe sign from string.
        assertEquals("a",getInstance().sanitizeInput("...a..."));  //test the removing of dots from string.
        assertEquals("a",getInstance().sanitizeInput(";a;"));  //test the removing of semicolon sign from string.
        assertEquals("a",getInstance().sanitizeInput("&&a&&"));  //test the removing of AMP sign from string.
        assertEquals("a",getInstance().sanitizeInput("|a..."));   //test the removing of pipe sign and semicolon sign from string.
        assertEquals("an apple",getInstance().sanitizeInput("an &&apple"));  //test the removing of AMP sign which are between two words.
        assertEquals("an apple",getInstance().sanitizeInput("an ...apple"));  //test the removing of dots which are between two words.
        assertEquals("an apple.",getInstance().sanitizeInput(";an |apple...."));  //test the removing of pipe sign and dots which are between two words. And test the fourth dot is not removed.
    }

    @Test
    public void testFormatTimer() {
        assertEquals("10:00", getInstance().formatTimer(600));
        assertEquals("00:00", getInstance().formatTimer(0));
        assertEquals("00:45", getInstance().formatTimer(45));
        assertEquals("02:45", getInstance().formatTimer(165));
        assertEquals("30:33", getInstance().formatTimer(1833));
    }
}