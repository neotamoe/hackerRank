// You will be given two arrays of integers and asked to determine all integers that satisfy
// the following two conditions:
//
// 1) The elements of the first array are all factors of the integer being considered
// 2) The integer being considered is a factor of all elements of the second array
//
// These numbers are referred to as being between the two arrays.
// You must determine how many such numbers exist.
//
// Function Description
// Complete the getTotalX function in the editor below. It should return the number of
// integers that are betwen the sets.
//
// Function getTotalX has the following parameter(s):
//   * a: an array of integers
//   * b: an array of integers
//
// Input Format
// The first line contains two space-separated integers, n and m, the number of elements in array a
// and the number of elements in array b.
// The second line contains n distinct space-separated integers describing a[i] where 0<=i<n.
// The third line contains m distinct space-separated integers describing b[i] where 0<=j<m.


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(b);
        int smallest = b[0];
        List<Integer> divisors = new ArrayList();
        List<Integer> factors = new ArrayList();
        int greatestEven = 0;
        int greatestOdd = 0;
        int leastOdd = 99;
        int leastEven = 100;

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0 && a[i]>greatestEven){
                greatestEven = a[i];
            }
            if(a[i]%2!=0 && a[i]>greatestOdd){
                greatestOdd = a[i];
            }
            if(a[i]%2!=0 && a[i]<leastOdd){
                leastOdd = a[i];
            }
            if(a[i]%2==0 && a[i]<leastEven){
                leastEven = a[i];
            }
        }
        int greatestFactor = 0;
        if(greatestOdd==0){
            greatestFactor = greatestEven;
        } else if(greatestEven==0){
            greatestFactor = greatestOdd;
        } else {
            greatestFactor = leastOdd * leastEven;
        }

        int j=1;
        while(j*greatestFactor<=smallest){
            divisors.add(j*greatestFactor);
            j++;
        }

        Set<Integer> finalSet = new HashSet();
        for(int k=0; k<b.length; k++){
            for(int m=0; m<divisors.size(); m++){
                if(b[k]%divisors.get(m)!=0){
                    finalSet.add(divisors.get(m));
                }
            }

        }
        return divisors.size()-finalSet.size();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
