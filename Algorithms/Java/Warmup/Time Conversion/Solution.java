import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        
        SimpleDateFormat ipdf = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat opdf = new SimpleDateFormat("HH:mm:ss");
        Date inputDate = null;
        String outputDate = null;
        
        try
        {
        inputDate = ipdf.parse(s);
        outputDate = opdf.format(inputDate);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return outputDate; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
