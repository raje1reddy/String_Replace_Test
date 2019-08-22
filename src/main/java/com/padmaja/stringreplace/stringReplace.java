package com.padmaja.stringreverse;
import java.lang.String;

public class stringReplace {
    public String replace(String inputString, String outputString) {
        //convert string to array
        char[] myarray= inputString.toCharArray();
        for(int i=0,j = inputString.length()-1; i<j; i++,j--){
            char temp = myarray[i];
            myarray[i]= myarray[j];
            myarray[j]= temp;
        }
        //convert array to string and assign the string to return it

        //String reveseString =  myarray.toString();
        //return new String(myarray);
        //return  myarray.toString();
       String reveseString = new String(myarray);
       return reveseString;

    }


}
