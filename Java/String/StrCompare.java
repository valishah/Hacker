/**
     Given a string, find out the lexicographically smallest and largest substring of length .

     [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

     Input Format

     First line will consist a string containing english alphabets which has at most  1000 characters. 2nd line will consist an integer .

     Output Format

     In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

     Sample Input
     welcometojava
     3
     
     Sample Output
     ava
     wel


     Explanation

     Here is the list of all substrings of length :

     wel
     elc
     lco
     com
     ome
     met
     eto
     toj
     oja
     jav
     ava
     Among them ava is the smallest and wel is the largest.

 */



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
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
