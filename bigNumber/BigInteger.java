// Java BigInteger
// There will be two lines containing two numbers, a and b.
// a and b are non-negative integers and can have maximum 200 digits.
// Output two lines. The first line should contain a+b, and the second line should contain a*b.
// Don't print any leading zeros.



import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        BigInteger add = A.add(B);
        BigInteger multiply = A.multiply(B);
        System.out.println(add);
        System.out.println(multiply);
    }
}
