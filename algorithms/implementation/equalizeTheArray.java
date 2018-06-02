// Karl has an array of integers. He wants to reduce the array until all remaining
// elements are equal. Determine the fewest number of elements to delete to reach his goal.
//
// For example, if his array is arr=[1,2,2,3], we see that he can delete the 2 elements
// 1 and 3 leaving arr=[2,2]. He could also delete both twos and either the 1 or the 3,
// but that would take 3 deletions. The minimum number of deletions is 2.
//
// Input Format
// The first line contains an integer n, the number of elements in arr. 
// The next line contains n space-separated integers arr[i].

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> counters = new HashMap();
        for(int i=0; i<arr.length; i++){
            if(counters.containsKey(arr[i])){
                int tempCurrent = counters.get(arr[i]);
                counters.put(arr[i], tempCurrent+=1);
            } else {
                counters.put(arr[i],1);
            }
        }
        int max = counters.values().stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();

        return arr.length-max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
