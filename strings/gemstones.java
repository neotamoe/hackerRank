// John has collected various rocks. Each rock has various minerals embeded in it. Each
// type of mineral is designated by a lowercase letter in the range ascii[a-z]. There
// may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if
// it occurs at least once in each of the rocks in John’s collection.
//
// Given a list of minerals embedded in each of John’s rocks, display the number of
// types of gemstones he has in his collection.
//
// Input Format
// The first line consists of an integer n, the number of rocks.
// Each of the next n lines contains a string where each letter represents an occurence of a mineral in the current rock.
//
// Output Format
// Print the number of types of gemstones in John’s collection. If there are none, print 0.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        Set<Character> temp = new HashSet<Character>();
        for(int i=0; i<arr.length-1; i++){
            if(i==0){
                temp = arr[i].chars().mapToObj(e->(char)e).collect(Collectors.toSet());
            }
            Set<Character> temp2 = arr[i+1].chars().mapToObj(e->(char)e).collect(Collectors.toSet());
            temp.retainAll(temp2);
            System.err.println(temp);
        }
        return temp.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
