// Palindromes are strings that read the same from the left or right, for example madam or 0110.
//
// You will be given a string representation of a number and a maximum number of changes you can make.
// Alter the string, one digit at a time, to create the string representation of the largest number
// possible given the limit to the number of changes. The length of the string may not be altered,
// so you must consider 0's left of all higher digits in your tests. For example 0110 is valid, 0011 is not.
//
// Given a string representing the starting number and a maximum number of changes allowed, create
// the largest palindromic string of digits possible or the string -1 if it's impossible to create
// a palindrome under the contstraints.
// Difficulty: Medium
// SuccessRate: 52.46% (as of 6/9/18)

// This solution currently solves 27 of 33 test cases; currently failing 6 (none failing for timeout).

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the highestValuePalindrome function below.
    static String highestValuePalindrome(String s, int n, int k) {
        int i = 0;
        int j = s.length() - 1;
        char[] charArr = new char[s.length()];
        Map<Integer,Integer> indexes = new HashMap<Integer,Integer>();
        boolean palindrome = true;
        int m = 0;
        int p = s.length()-1;
        int r = 0;
        int t = s.length()-1;


        while (j > i) {
            if (s.charAt(i)!=s.charAt(j) && s.charAt(i)>s.charAt(j) && k>0) {
                    charArr[i] = s.charAt(i);
                    charArr[j] = s.charAt(i);
                    indexes.put(i,j);
                    k--;
                }
            if (s.charAt(i)!=s.charAt(j) && s.charAt(i)<s.charAt(j) && k>0) {
                charArr[i] = s.charAt(j);
                charArr[j] = s.charAt(j);
                indexes.put(j,i);
                k--;
            }
            if(s.charAt(i) == s.charAt(j)){
                charArr[i] = s.charAt(i);
                charArr[j] = s.charAt(i);
            }
            i++;
            j--;
        }
        if((s.length() % 2 )!=0){
            charArr[i] = s.charAt(i);
            indexes.put(i,j);
        }
        //to test what's in charArr
        // System.err.println("after first loop: ");
        // for(char c: charArr){
        //     System.err.print(c);
        // }


        while (p > m) {
            if(charArr[m]=='\u0000' || charArr[p]=='\u0000'){
                palindrome = false;
                break;
            }
            if(charArr[m]!=charArr[p]){
                palindrome = false;
                break;
            }
            m++;
            p--;
        }

        while (r<charArr.length && k>0){
            if(indexes.containsKey(r)){
                charArr[r]='9';
                charArr[indexes.get(r)]='9';
                k--;
            } else if(indexes.containsKey(t)){
                charArr[t]='9';
                charArr[indexes.get(t)]='9';
                k--;
            }
            else if(charArr[r]!='9' && k>=2){
                charArr[r]='9';
                charArr[t]='9';
                k-=2;
            }
            r++;
            t--;
        }

        // to test what's in charArr
        // System.err.println("after checking for palindrome in changed string: ");
        // for(char c: charArr){
        //     System.err.print(c);
        // }

        if(palindrome==false){
            return "-1";
        } else {
            String newString = "";
            for(char c: charArr){
                newString += c;
            }
            return newString;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String s = scanner.nextLine();

        String result = highestValuePalindrome(s, n, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
