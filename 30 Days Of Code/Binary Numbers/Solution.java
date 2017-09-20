import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = 0;
        int n = s.nextInt();
        String[] binary = Integer.toBinaryString(n).split("[0]+");
        //int l = binary.length();
       // System.out.println(l);
        for(String ans : binary)
        {
            if(ans.length()>a)
                a = ans.length();
                
        }
        System.out.println(a);
    }
}
