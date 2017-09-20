import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int da = s.nextInt();
        int ma = s.nextInt();
        int ya = s.nextInt();
        int de = s.nextInt();
        int me = s.nextInt();
        int ye = s.nextInt();
        s.close();
        int monthsLate = ma - me;
        int daysLate = da - de;
        int yearDifference = ya - ye;
        System.out.println (
            (yearDifference > 0 ) ? 10000 
            : (monthsLate > 0 && yearDifference == 0) ? monthsLate * 500
                    : (daysLate > 0 && yearDifference == 0) ? daysLate * 15
                            : 0);
}
}
