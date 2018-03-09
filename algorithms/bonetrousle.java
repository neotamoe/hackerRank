// Papyrus the skeleton went to buy some pasta from the store. The store's inventory is
// bare-bones and they only sell one thing — boxes of uncooked spaghetti! The store
// always stocks exactly k boxes of pasta, and each box is numbered sequentially from 1 to k.
// This box number also corresponds to the number of sticks of spaghetti in the box,
// meaning the first box contains 1 stick, the second box contains 2 sticks, the third box
// contains 3 sticks, …, and the kth box contains k sticks.
//
// During each trip to the store, Papyrus likes to buy exactly n sticks of spaghetti by
// purchasing exactly b boxes (no more, no less).
// Given the values of n, k, and b for T trips to the store, determine which boxes
// Papyrus must purchase during each trip. For each trip, print a single line of b distinct
// space-separated integers denoting the box number for each box of spaghetti Papyrus
// purchases (recall that the store only has one box of each kind). If it's not possible
// to buy sticks of spaghetti by purchasing b boxes, print -1 instead.

// COMMENT:  Work in progress!  This passes the first test, but has run-time errors
// and does not pass remaining tests.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int trips = scanner.nextInt();
        for(int i=0; i<trips; i++){
            int n = scanner.nextInt();  // numberToBuy
            int k = scanner.nextInt();  // boxesInStock
            int b = scanner.nextInt(); // boxesToBuy
            int totalAvailable = getTotalAvailable(k);
            if(totalAvailable<n){
                System.out.println("-1");
            } else {
                findAddends(n, k, b);
            }

        }
    }

    public static int getTotalAvailable (int boxesInStock) {
        int totalAvailable = 0;
        for(int j=1; j<=boxesInStock; j++){
            totalAvailable += j;
        }
        return totalAvailable;
    }

    public static void findAddends (int numberToBuy, int boxesInStock, int boxesToBuy){
        String result = "";
        int sum = 0;
        int boxCount = 0;
        for(int i=boxesInStock; i>0; i--){
            if(i<=numberToBuy-sum && boxCount<boxesToBuy && sum+i<=numberToBuy){
                if(boxCount+1==boxesToBuy-1 && sum+i==numberToBuy){
                    continue;
                } else {
                    sum+=i;
                    boxCount++;
                    result += i + " ";
                }
            }
        }
        System.out.println(result);
    }
}
