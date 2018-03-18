// Anna and Brian order n items at a restaurant, but Anna declines to eat any of the kth item
// (where 0<=k<n) due to an allergy. When the check comes, they decide to split the cost
// of all the items they shared; however, Brian may have forgotten that they didn't
// split the kth item and accidentally charged Anna for it.
//
// You are given n, k, the cost of each of the n items, and the total amount of money
// that Brian charged Anna for her portion of the bill. If the bill is fairly split,
// print Bon Appetit; otherwise, print the amount of money that Brian must refund to Anna.
// It is guaranteed that the amount will always be an integer.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        int kthItem = scanner.nextInt();
        int[] foodItems = new int[numberOfItems];
        for(int i=0; i<numberOfItems; i++){
            foodItems[i]=scanner.nextInt();
        }
        int annaWasCharged = scanner.nextInt();
        int annaShouldPay = 0;
        for(int j=0; j<foodItems.length; j++){
            if(j!=kthItem){
                annaShouldPay+=foodItems[j];
            }
        }
        annaShouldPay=annaShouldPay/2;
        if(annaWasCharged==annaShouldPay){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(annaWasCharged-annaShouldPay);
        }
    }
}
