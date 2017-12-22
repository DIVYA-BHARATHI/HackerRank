import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       BigInteger a = s.nextBigInteger();
       BigInteger b = s.nextBigInteger();
       BigInteger sum = a.add(b);
       BigInteger mul = a.multiply(b);
       System.out.println(sum);
       System.out.println(mul);
        
    }
}
