import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
      
        for(int  i = 0 ; i<t ; i++)
        {
            int n = s.nextInt();
            for(int j=2; j<=n/j; j++){
                 if(n%j==0) n=1;
            }
            System.out.println(n==1?"Not prime":"Prime");
    }
}
}
