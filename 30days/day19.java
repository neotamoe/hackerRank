// Day 19: Interfaces
// The AdvancedArithmetic interface and the method declaration for the abstract int
// divisorSum(int n) method are provided for you in the editor below. Write the Calculator
// class, which implements the AdvancedArithmetic interface. The implementation for the
// divisorSum method must be public and take an integer parameter, n, and return the
// sum of all its divisors.
//
// Note: Because we are writing multiple classes in the same file, do not use an access
// modifier (e.g.: public) in your class declaration (or your code will not compile);
// however, you must use the public access modifier before your method declaration for
// it to be accessible by the other classes in the file.

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

//Write your code here
class Calculator implements AdvancedArithmetic {
    //The implementation for the divisorSum method must be public and take an integer parameter, , and return the sum of all its divisors.
    public int divisorSum(int n){
        int sum = 0;
        int divisor = 0;
        ArrayList<Integer> sumDivisors = new ArrayList<Integer>();
        if(n==1){
            sum = 1;
        } else {
            for (int i = 1; i < n/2; i++){
                if(n%i == 0){
                    divisor = n/i;
                    if(!sumDivisors.contains(i)){
                        sumDivisors.add(i);
                    }
                    if(!sumDivisors.contains(divisor)){
                        sumDivisors.add(divisor);
                    }
                }
            }
            sum = sumDivisors.stream().map(i -> i).mapToInt(Integer::intValue).sum();
        }
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

      	AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
