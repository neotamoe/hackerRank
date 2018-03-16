// Given Maria's array of scores for a season of n games, find and print the number of times she
// breaks her record for most and least points scored during the season.
//
// Note: Assume her records for most and least points at the start of the season are
// the number of points scored during the first game of the season.
// Print two space-seperated integers describing the respective numbers of times her best
// (highest) score increased and her worst (lowest) score decreased.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] breakingRecords(int[] score) {
        // Complete this function
        int high = score[0];
        int low = score[0];
        int highCount = 0;
        int lowCount = 0;
        int[] records = new int[2];
        for (int i=1; i<score.length; i++) {
            if(score[i]<low){
                low = score[i];
                lowCount++;
            }
            if (score[i]>high){
                high = score[i];
                highCount++;
            }
        }
        records[0]=highCount;
        records[1]=lowCount;
        return records;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
