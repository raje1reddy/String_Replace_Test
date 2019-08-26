package com.padmaja.stringreplace;

import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.assertEquals;

//import static com.padmaja.stringreplace.stringReplace.manipulateString;
//import static org.junit.Assert.*;

 public class stringReplaceTest {

     @Test
     public void replaceTest1() {
         stringReplace util = new stringReplace();
         //manipulateString("HelloWorld");
         String result = util.manipulateString("HelloWorld");
         System.out.println(result);
         String expectedresult = "vbppvzvbpz";
         assertEquals(expectedresult,result);
     }
 }



