package com.padmaja.stringreverse;
//import static java.lang.System.out;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.String;

public class StringReverseOptimized {
    public static void main(String[] args){
        String str="Welcome to Java Programming";

        //creating object of String Util class
        stringUtil myStringUtilObject = new stringUtil();
        //called the reverse fuction using the object
        String reverse = myStringUtilObject.reverse(str);

        System.out.println("Reversed string is:" + reverse);
        //System.out.println("Reversed string is:" + myarray.toString());



    }

}




