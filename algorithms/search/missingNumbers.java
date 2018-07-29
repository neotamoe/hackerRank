// Numeros the Artist had two lists that were permutations of one another. He was very proud. Unfortunately, while transporting them from one exhibition to another, some numbers were lost out of the first list. Can you find the missing numbers?
//
// Notes
// If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
// You have to print all the missing numbers in ascending order.
// Print each missing number once, even if it is missing multiple times.
// The difference between maximum and minimum number in the second list is less than or equal to 100.

// NOTE: One of the constraints was that xMax - xMin < 101.  There were clever answers in the discussion
// that capitalized on this constraint, but I was not able to get this code to pass the last test and unable
// at this time to debug to find the problem.  Submitting as is to keep this my own solution.
// Last test case involved 100000 numbers in the first list.  This final version was created to try and
// optimize for the final test case.  Earlier versions were variations on this version.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m = Integer.parseInt(scanner.nextLine());

        int[] brr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        Arrays.sort(brr);
        Set<String> missing = new TreeSet();
        int aIndex = 0;

        for(int i=0; i<brr.length; i++){
            if(brr[i]==arr[aIndex]){
                aIndex++;
            } else {
                missing.add(String.valueOf(brr[i]));
            }
        }
        System.out.println(String.join(" ", missing));
    }
}
