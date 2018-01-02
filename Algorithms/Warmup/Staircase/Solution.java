import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        // Complete this function
int i,j,k;  
for(i=n;i>0;i--)
{
    for(j=1;j<i;j++)
    {
    System.out.print(" ");
    }
    for(k=n;k>=i;k--)
    {
    System.out.print("#");
    }
    System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
