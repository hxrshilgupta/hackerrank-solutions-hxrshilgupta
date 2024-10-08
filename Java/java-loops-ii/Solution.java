// import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        for(int i = 0; i<q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int output = a;
            for(int j = 0; j<n; j++){
                output += (int)Math.pow(2,j)*b;   
                System.out.print(output + " ");
            }
            output = 0;
            System.out.println();
        }

        sc.close();
    }
}
