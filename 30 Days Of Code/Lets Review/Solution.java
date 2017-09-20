import java.io.*;
import java.util.*;
public class Solution
{public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();

   for(int i=0; i<t; i++)
   {
       
        String str = s.next();
        char[] c = str.toCharArray();

        for(int j=0; j<str.length(); j++)
        {
            if(j%2==0)
                System.out.print(c[j]);
        }
        System.out.print(" ");
        for(int k=0; k<str.length(); k++)
        {
            if(k%2==1)
                System.out.print(c[k]);
        }
            System.out.println();  
       

    }
}
}
