//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        try{
            Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            // Write code here
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phonebook.get(s)==null)
            {
                System.out.println("Not found");
            }
            else
                System.out.println(s + "=" +phonebook.get(s));
            
        }
        in.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
