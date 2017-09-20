    import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        char[] s1 = a.toLowerCase().toCharArray();
        char[] s2 = b.toLowerCase().toCharArray();
        boolean result ;
        Arrays.sort(s1);
        Arrays.sort(s2);
        result = Arrays.equals(s1,s2);
       // System.out.println(s1);
       // System.out.println(s2);
       // System.out.println(result);
        
        return result;
    }
        public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
