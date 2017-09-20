import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i<t ; i++)
        {
            int n = s.nextInt();
            int k = s.nextInt();
            if(((k-1)|k) > n && k%2==0)
            {
                System.out.println(k-2);
            }else{
                System.out.println(k-1);               
            }
                    
            
        }
    }
}
