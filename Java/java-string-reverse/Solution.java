// import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String pal = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            pal += A.charAt(i);
        }

        if (pal.equals(A))
            System.out.print("Yes");

        else
            System.out.print("No");


        sc.close();
    }

}
