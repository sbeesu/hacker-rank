import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
        s = s.replaceAll(("[^A-Za-z ]"), " ");
        StringTokenizer st = new StringTokenizer(s," ");
        int x = st.countTokens();
        System.out.println(x);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}