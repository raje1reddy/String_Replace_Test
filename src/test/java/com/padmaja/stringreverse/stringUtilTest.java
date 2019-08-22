package com.padmaja.stringreverse;

import org.junit.Test;

import static org.junit.Assert.*;

public class stringUtilTest {

    @Test
    public void reverse_helloworld() {
        stringUtil util = new stringUtil();
        String result = util.reverse("HelloWorld");
        String expResult = "dlroWolleH";
        assertEquals(expResult, result);
    }


    @Test
    public void reverse_abcdefgh() {
        stringUtil util = new stringUtil();
        String result = util.reverse("abcdefghijklmnopqrstuvwxyz");
        String expResult = "zyxwvutsrqponmlkjihgfedcba";
        assertEquals(expResult, result);
    }

}