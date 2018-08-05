// Flatland is a country with a number of cities, some of which have space stations. Cities
// are numbered consecutively and each has a road of 1km length connecting it to the next
// city. It is not a circular route, so the first city doesn't connect with the last city.
// Determine the maximum distance from any city to it's nearest space station.
//
// Input Format
// The first line consists of two space-separated integers, n and m.
// The second line contains m space-separated integers, the indices of each city having a space-station. These values are unordered and unique.
//
// Constraints
// * 1<=n<=10^5
// * 1<=m<=n
// * There will be at least 1 city with a space station.
// * No city has more than one space station.


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int number = 0;
        int maxD = 0;
        int tempMax = 0;
        while(number<n){
            tempMax = Integer.MAX_VALUE;
            for(int i=0; i<c.length; i++){
                if(Math.abs(number-c[i])<tempMax){
                    tempMax = Math.abs(number-c[i]);
                }
            }
            if(tempMax>maxD){
                maxD = tempMax;
            }
            number++;
        }
        return maxD;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
