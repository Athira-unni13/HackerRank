import java.util.Scanner;

public class Solution7 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int length = s.length();
        for (int i=0;i<length-k+1; i++)
        {
            String sub = s.substring(i,i+k);
            if(sub.compareTo(largest)>0){
                largest = sub;
            }
            if(sub.compareTo(smallest)<0){
                smallest = sub;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
