// Priyanka works for an international toy company that ships by container. Her task
// is to the determine the lowest cost way to combine her orders for shipping.
// She has a list of item weights. The shipping company has a requirement that all
// items loaded in a container must weigh less than or equal to 4 units plus the weight
// of the minimum weight item. All items meeting that requirement will be shipped in one container.
// What is the smallest number of containers that can be contracted to ship the items
// based on the given list of weights?
//
// Input Format:
// The first line contains an integer n, the number of orders to ship. 
// Next line will contain n integers, w1,w2,...,wn, representing the orders in a weight array.
//
// Output Format:
// Return the integer value of the number of containers Priyanka must contract ot ship all of the toys.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the toys function below.
    static int toys(int[] w) {
        int containers = 1;
        Arrays.sort(w);
        int upper = w[0]+4;
        for(int i=0; i<w.length; i++){
            if(w[i]<=upper){
                continue;
            } else {
                upper = w[i]+4;
                containers++;
            }
        }
        return containers;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] w = new int[n];

        String[] wItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int wItem = Integer.parseInt(wItems[i]);
            w[i] = wItem;
        }

        int result = toys(w);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
