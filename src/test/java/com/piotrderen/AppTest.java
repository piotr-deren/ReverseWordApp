package com.piotrderen;

import static junit.framework.TestCase.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @org.junit.Test
    public void whenSomeTextIsGiven() throws Exception {
        String result = App.reverse("big brown fox jumped over lazy dog");
        assertEquals("gib nworb xof depmuj revo yzal god", result);
    }
    @org.junit.Test
    public void whenEmptyTextIsGiven() throws Exception {
        String result = App.reverse("");
        assertEquals("", result);
    }
}
