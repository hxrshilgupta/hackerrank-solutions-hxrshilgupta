// import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum_string = A.length() + B.length();
        System.out.println(sum_string);

        if (A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.print(A.substring(0, 1).toUpperCase().concat(A.substring(1)) + " ");
        System.out.println(B.substring(0, 1).toUpperCase().concat(B.substring(1)));
        sc.close();
    }
}
