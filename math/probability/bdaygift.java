// Isaac has to buy a new HackerPhone for his girlfriend Amy. He is exploring the shops
// in the town to compare the prices whereupon he finds a shop located on the first floor
// of a building, that has a unique pricing policy. There are N steps leading to the shop.
// A numbered ball is placed on each of the steps.
// The shopkeeper gives Isaac a fair coin and asks him to toss the coin before climbing
// each step. If the result of the toss is a ‘Heads’, Isaac should pick up the ball, else
// leave it and proceed to the next step.
//
// The shopkeeper then asks Isaac to find the sum of all the numbers he has picked up
// (let’s say S). The price of the HackerPhone is then the expected value of S. Help Isaac
// find the price of the HackerPhone.
//
// Input Format
// The first line of the input contains an integer N, the number of steps. N lines 
// follow, which are the numbers written on the ball on each step.
//
// Output Format
// A single line containing expected value.
//
// Note : Expected value must be printed as a decimal number having exactly one digit
// after decimal. It is guaranteed that the correct answer will have at most one digit after decimal.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static double solve(int[] balls) {
        double sum = 0;
        for(int i=0; i<balls.length; i++){
            sum += (double)balls[i]/2;
        }
        return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int ballsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] balls = new int[ballsCount];

        for (int ballsItr = 0; ballsItr < ballsCount; ballsItr++) {
            int ballsItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            balls[ballsItr] = ballsItem;
        }

        double result = solve(balls);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
