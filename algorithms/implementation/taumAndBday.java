// Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts
// that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has
// to buy b black gifts and w white gifts.
//
// The cost of each black gift is bc units.
// The cost of every white gift is wc units.
// The cost of converting each black gift into white gift or vice versa is z units.
// Help Taum by deducing the minimum amount he needs to spend on Diksha’s gifts.
//
// Input Format
// The first line will contain an integer t, the number of test cases.
// The next t pairs of lines are as follows:
// - The first line contains the values of integers b and w.
// - The next line contains the values of integers bc, wc, and z.
//
// Constraints
// 1 <= t <= 10
// 0 <= b,w,bc,wc,z <= 10^9
//
// Output Format
// t lines, each containing an integer: the minimum amount of units Taum needs to spend on gifts.

// NOTE:  Though input was set up to be int, due to constraints inputs needed to be long.
// Return value also was initially set to be an int, but needed to be a BigInteger due to
// calculations being made.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {

    static BigInteger taumBday(long b, long w, long bc, long wc, long z) {
        if(wc==bc){
            BigInteger anumber = BigInteger.valueOf(b*bc);
            BigInteger bnumber = BigInteger.valueOf(w*wc);
            return anumber.add(bnumber);
        } else if (z>bc && z>wc) {
            BigInteger anumber = BigInteger.valueOf(b*bc);
            BigInteger bnumber = BigInteger.valueOf(w*wc);
            return anumber.add(bnumber);
        }else if (bc+z<wc){
            BigInteger anumber = BigInteger.valueOf(bc*b);
            BigInteger bnumber = BigInteger.valueOf((bc+z)*w);
            return anumber.add(bnumber);
        } else if (wc+z<bc){
            BigInteger anumber = BigInteger.valueOf(wc*w);
            BigInteger bnumber = BigInteger.valueOf((wc+z)*b);
            return anumber.add(bnumber);
        } else if (bc<wc+z && bc<wc) {
            BigInteger anumber = BigInteger.valueOf((bc)*b);
            BigInteger bnumber = BigInteger.valueOf(wc*w);
            return anumber.add(bnumber);
        } else if (wc<bc+z && wc<bc) {
            BigInteger anumber = BigInteger.valueOf((wc)*w);
            BigInteger bnumber = BigInteger.valueOf(bc*b);
            return anumber.add(bnumber);
        } else {
            return null;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");

            long b = Integer.parseInt(bw[0]);

            long w = Integer.parseInt(bw[1]);

            String[] bcWcz = scanner.nextLine().split(" ");

            long bc = Integer.parseInt(bcWcz[0]);

            long wc = Integer.parseInt(bcWcz[1]);

            long z = Integer.parseInt(bcWcz[2]);

            BigInteger result = taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
