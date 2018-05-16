// Erica wrote an increasing sequence of n numbers (a[0],a[1],...,a[n-1]) in her
// notebook. She considers a triplet (a[i],a[j],a[k]) to be beautiful if:
// * i < j < k
// * a[j] - a[i] = a[k] - a[j] = d
//
// Given the sequence and the value of d, can you help Erica count the number of
// beautiful triplets in the sequence?

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
        int beautifulCount = 0;
        Set<Integer> numberset = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        for(int i=0; i<arr.length; i++){
            int temp = arr[i]+d;
            if(numberset.contains(temp)){
                if(numberset.contains(temp+d)){
                    beautifulCount++;
                }
            }
        }
        return beautifulCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
