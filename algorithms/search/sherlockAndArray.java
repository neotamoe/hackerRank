// Watson gives Sherlock an array of integers. His challenge is to find an element of the 
// array such that the sum of all elements to the left is equal to the sum of all elements
// to the right. For instance, given the array arr=[5,6,8,11], 8 is between two subarrays that
// sum to 11. If your starting array is [1], that element satisfies the rule as left and right sum to 0.
//
// You will be given arrays of integers and must determine whether there is an element that meets the criterion.
//
// Function Description
// Complete the balancedSums function in the editor below. It should return a string, either YES
// if there is an element meeting the criterion or NO otherwise.
// balancedSums has the following parameter(s):
//   * arr: an array of integers

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {
        if(arr.size()==1){
            return "YES";
        } else {
            int index=0;
            int frontSum = 0;
            int backSum = 0;
            while(index<arr.size()){
                for(int i=0; i<arr.size(); i++){
                    if(i<index){
                        frontSum+=arr.get(i);
                    } else if(i>index){
                        backSum +=arr.get(i);
                    }
                }
                if(frontSum==backSum){
                    return "YES";
                } else {
                    frontSum = 0;
                    backSum = 0;
                    index++;
                }
            }
            return "NO";
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());

        IntStream.range(0, T).forEach(TItr -> {
                int n = Integer.parseInt(scanner.nextLine());

                List<Integer> arr = Stream.of(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = balancedSums(arr);

                System.out.println(result);

        });

    }
}
