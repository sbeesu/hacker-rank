import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        char[] a_chars = a.toLowerCase().toCharArray();
        Arrays.sort(a_chars);
        String a_sorted = new String(a_chars);
        char[] b_chars = b.toLowerCase().toCharArray();
        Arrays.sort(b_chars);
        String b_sorted = new String(b_chars);
        if(a_sorted.equals(b_sorted))
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}