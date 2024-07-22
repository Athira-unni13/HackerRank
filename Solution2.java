import java.util.*;
import java.io.*;
import java.lang.*;

class Solution2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int q=0;
        for(int i=0;i<t;i++){
          int a=0, b=0, n=0;
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            q = a;
            for(int j=0;j<n;j++){
              q = q + (b * 1 << j);
              System.out.print(q + " ");
            }
            System.out.println("");
        }
            
        in.close();
    }
}
