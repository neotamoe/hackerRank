// Julius Caesar protected his confidential information by encrypting it using a cipher.
// Caesar's cipher shifts each letter by a number of letters. If the shift takes you past
// the end of the alphabet, just rotate back to the front of the alphabet. In the case of
// a rotation by 3, w, x, y and z would map to z, a, b and c.
//
// Original alphabet:      abcdefghijklmnopqrstuvwxyz
// Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
//
// Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
//
// Function Description
// Complete the caesarCipher function in the editor below. It should return the encrypted string.
//
// caesarCipher has the following parameter(s):
// s: a string in cleartext
// k: an integer, the alphabet rotation factor
//
// Input Format
// The first line contains the integer, n, the length of the unencrypted string.
// The second line contains the unencrypted string, s.
// The third line contains k, the number of letters to rotate the alphabet by.
//
// Constraints
// * 1 <= n <= 100
// * 0 <= k <= 100
// * s is a valid ASCII string without any spaces.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int actualRotations = k%26;
        String cipher = "";
        if(k==0){
            cipher = alphabet;
        } else {
            cipher = alphabet.substring(actualRotations) + alphabet.substring(0,actualRotations);
        }
        String result = "";
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i)) && Character.isLowerCase(s.charAt(i))){
                int origIndex = alphabet.indexOf(s.charAt(i));
                result += cipher.charAt(alphabet.indexOf(s.charAt(i)));
            } else if(Character.isLetter(s.charAt(i)) && Character.isUpperCase(s.charAt(i))){
                char lower = Character.toLowerCase(s.charAt(i));
                int origIndex = alphabet.indexOf(lower);
                result += Character.toUpperCase(cipher.charAt(origIndex));
            } else {
                result += s.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String s = scanner.nextLine();

        int k = scanner.nextInt();

        String result = caesarCipher(s, k);
        System.out.println(result);


        scanner.close();
    }
}
