// NOTE: NOT YET FINISHED--WIP 7/8/18
// passing first few cases, not passing remaining tests
// Akash and Akhil are playing a game. They have N balls numbered from 0 to N-1. Akhil
// asks Akash to reverse the position of the balls, i.e., to change the order from say,
// 0,1,2,3 to 3,2,1,0. He further asks Akash to reverse the position of the balls N times,
// each time starting from one position further to the right, till he reaches the last ball.
// So, Akash has to reverse the positions of the ball starting from 0th position, then from
// 1st position, then from 2nd position and so on. At the end of the game, Akhil will ask
// Akash the final position of any ball numbered K. Akash will win the game, if he can answer.
// Help Akash.
//
// Input Format
// The first line contains an integer T, i.e., the number of the test cases.
// The next T lines will contain two integers N and K.
//
// Output Format
// Print the final index of ball K in the array.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int reverser (int n, int k){
        if(k==0){
            return 1;
        } else if (k==1 && n>3){
           return 3;
        } else if(k==1 && n<=3){
            return 2;
        } else if (k<n/2){
            return (k+1)*2;
        } else {  //if (k>=n/2)
            return (n-k) + (k-1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=0; i<t; i++){
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            System.out.println(reverser(n, k));

        }

        scanner.close();


    }
}
