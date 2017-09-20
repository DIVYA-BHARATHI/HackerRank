import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String emails = ".+@gmail\\.com$";
        Pattern p = Pattern.compile(emails);
        List<String> list = new ArrayList();
        for (int i = 0; i < n; i++)
        {
            String name = s.next();
            String email = s.next();
            Matcher m = p.matcher(email);
            if (m.find()){
                list.add(name);
            }
        }
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    }
}
