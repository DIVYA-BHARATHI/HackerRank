import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
     int maxHeight = ar[0];
     int count = 0;
     for(int i =0; i<n ; i++)
     {
         if(ar[i]>maxHeight)
         {
             maxHeight = ar[i];
         }
     }
        
     for(int j=0;j<n;j++)
     {
         if(ar[j]==maxHeight)
             count++;
     }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
