import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int viralAdvertising(int n) {
        // Complete this function
        int start = 5;
        int liked = 0;
        for(int i=0; i<n; i++){
            liked += (int)Math.floor(start/2);
            start = (int)Math.floor(start/2)*3;
        }
        return liked;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
