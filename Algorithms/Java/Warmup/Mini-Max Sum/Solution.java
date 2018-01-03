import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    static void miniMaxSum(long[] arr) 
    {
        long[] sum = new long[5];
        int i,j,l;
        
        for(i = 0 ; i < 5 ; i++)
        {
            sum[i] = 0;
            for(j = 0 ; j < 5 ; j++)
            {
                if(i!=j)
                {
                    sum[i] = arr[j] + sum[i];
                }
            }
        }
       long minValue = sum[0];
       long maxValue = sum[0];
      
      for(l=0;l < 5;l++)
      { 
      if(sum[l] > maxValue)
      { 
         maxValue = sum[l]; 
      }
      }
      
      for(l=0;l < 5;l++)
      {   
      if(sum[l] < minValue)
      { 
         minValue = sum[l]; 
      } 
        
    }
        System.out.println(minValue+ " " + maxValue);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
