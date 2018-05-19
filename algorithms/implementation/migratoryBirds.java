// You have been asked to help study the population of birds migrating across the continent.
// Each type of bird you are interested in will be identified by an integer value. Each
// time a particular kind of bird is spotted, its id number will be added to your array of
// sightings. You would like to be able to find out which type of bird is most common given a
// list of sightings. Your task is to print the type number of that bird and if two or more
// types of birds are equally common, choose the type with the smallest ID number.
//
// Input Format
// The first line contains an integer denoting n, the number of birds sighted and reported in the array ar.
// The second line describes ar as n space-separated integers representing the type numbers of each bird sighted.
//
// Constraints
// It is guaranteed that each type is 1, 2, 3, 4, or 5.
//
// Output Format
// Print the type number of the most common bird; if two or more types of birds are equally
// common, choose the type with the smallest ID number.

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(map.containsKey(ar[i])){
                int current = map.get(ar[i]);
                map.put(ar[i], current+=1);
            } else {
                map.put(ar[i], 1);
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr]);
            ar[arItr] = arItem;
        }

        int result = migratoryBirds(arCount, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
