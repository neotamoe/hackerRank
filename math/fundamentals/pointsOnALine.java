// Given n two-dimensional points in space, determine whether they lie on some vertical
// or horizontal line. If yes, print YES; otherwise, print NO.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String isOnLine(Map coordinates){
        String result = "NO";
        Set keys = coordinates.keySet();
        if(keys.size()==1){
            return result = "YES";
        } else {
            Collection<Integer> values = coordinates.values();
            Integer[] valuesArray = new Integer[values.size()];
            Iterator it = values.iterator();
            for(int j=0; j<values.size(); j++) {
                valuesArray[j] = (int)it.next();
            }

            Integer first = valuesArray[0];
            for(int i=1; i<valuesArray.length; i++){
                if(valuesArray[i]==first){
                    // do nothing
                } else {
                    return result = "NO";
                }
                if (i==valuesArray.length-1 && valuesArray[i]==first){
                    result = "YES";
                }
            }

        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Map<Integer, Integer> coordinates = new HashMap();
        for (int nItr = 0; nItr < n; nItr++) {
            String[] xy = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xy[0]);

            int y = Integer.parseInt(xy[1]);
            coordinates.put(x,y);
        }

        String result = isOnLine(coordinates);

        System.out.println(result);

        scanner.close();
    }
}
