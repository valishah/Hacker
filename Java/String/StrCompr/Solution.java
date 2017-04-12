import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner s = new Scanner(System.in);
        String S=s.next();
        int k = s.nextInt();
        int start = 0;
        int end = k;
        int length = S.length();
        Stack stack = new Stack();
        while(start <= length-k){
            stack.add(S.substring(start,end));
            start++;
            end++;
        }
        Collections.sort(stack);
        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());
    }
}
