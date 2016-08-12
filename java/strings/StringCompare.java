import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll("[^A-Za-z0-9]", "");
        int k = Integer.parseInt(sc.next());
        String max = str.substring(0,k);
        String min = str.substring(0,k);
        
        for(int i=0; i+k <= str.length(); i++){
            String substr = str.substring(i,i+k);
            if(substr.compareTo(min) < 0)
                min = substr;
            
            if(substr.compareTo(max) > 0)
                max = substr;
        }
        System.out.println(min);
        System.out.println(max);
    }
}