import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s1,s2,s3;
            int x,y,z;
            s1=sc.next();
            x=sc.nextInt();
            s2=sc.next();
            y=sc.nextInt();
            s3=sc.next();
            z=sc.nextInt();
            //Complete this line
            System.out.println("================================");
            System.out.printf("%-15s %03d\n",s1,x);
            System.out.printf("%-15s %03d\n",s2,y);
            System.out.printf("%-15s %03d\n",s3,z);
            System.out.println("================================");

    }
}




