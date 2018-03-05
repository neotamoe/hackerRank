// Java has built-in mechanism to handle exceptions. Using the try statement we can test
// a block of code for errors. The catch block contains the code that says what to do if
// exception occurs.
// You will be given two integers x and y as input, you have to compute x/y. If x and y
// are not 32 bit signed integers or if y is zero, exception will occur and you have to
// report it. Read sample Input/Output to know what to report in case of exceptions.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e){
                System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }
}
