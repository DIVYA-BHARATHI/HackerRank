import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
    
            
        if(!scan.hasNext()) { System.out.print(0);return;}
        String s = scan.nextLine();
          scan.close();
        if (s.trim().length()==0 || s.trim().length()>400000)
    {
        System.out.println(0);
        return;
    }
        s = s.trim();
        // Write your code here.
      
        String str[] = s.split("[ !,?._'@]+");
        System.out.println(str.length);
        for(String w : str)
            System.out.println(w);
        
    }
}
