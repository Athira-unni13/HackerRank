import java.io.*;
import java.util.*;

public class Solution8 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String C = A;
        int length = A.length();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        //System.out.println(length);
        for(int i = length; i>0;i-- ){
          B = B + A.charAt(i-1);
        }
        if (B.equals(A)){
          System.out.println("yes");
        }
        else{
          System.out.println("No");
        }
    }
}

//madam



