// Calculate and print the factorial of a given integer.
// Note: Factorials of n>20 can't be stored even in a 64-bit long long variable. Big
// integers must be used for such calculations. We recommend solving this challenge
// using BigIntegers.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void extraLongFactorials(int n) {
        // Complete this function
        BigDecimal result = BigDecimal.ONE;
        while(n>0){
            result = result.multiply(BigDecimal.valueOf(n));
            n--;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }

}
