import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
       
        for(int i=0;i<q;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;     
            //System.out.printf("a=%d, b = %d, n= %d",a,b,n);

            for(int j=0; j<n; j++)
            {
                int power = (int)Math.pow(2,j);
                s = s + (power * b) ;
                System.out.printf("%d ",s);
            }
            System.out.println();
        }
        in.close();
    }
}
