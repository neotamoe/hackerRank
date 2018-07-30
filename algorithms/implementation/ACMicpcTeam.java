// There are a number of people who will be attending ACM-ICPC World Finals. Each of them
// may be well versed in a number of topics. Given a list of topics known by each attendee,
// you must determine the maximum number of topics a 2-person team can know. Also find out
// how many ways a team can be formed to know that many topics. Lists will be in the form
// of bit strings, where each string represents an attendee and each position in that string
// represents a field of knowledge, 1 if its a known field or 0 if not.
//
// For example, given three attendees’ data as follows:
// 10101
// 11110
// 00010
//
// These are all possible teams that can be formed:
// Members Subjects
// (1,2)   [1,2,3,4,5]
// (1,3)   [1,3,4,5]
// (2,3)   [1,2,3,4]
// In this case, the first team will know all 5 subjects. They are the only team that can be created knowing that many subjects.
//
// Input Format
// The first line contains two space-separated integers n and m, where n represents the number
// of attendees and m represents the number of topics.
// Each of the next n lines contains a binary string of length m. If the ith line’s jth character is 1, then the ith person knows the jth topic.
//
// Output Format
// On the first line, print the maximum number of topics a 2-person team can know.
// On the second line, print the number of ways to form a 2-person team that knows the maximum number of topics.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int[] result = new int[2];
        int maxSkills = 0;
        int teamsWithMax = 0;
        for(int i=0; i<topic.length; i++){
            for(int j=i+1; j<topic.length; j++){
                int index = 0;
                int tempSkills = 0;
                while(index<topic[i].length()){
                    if(topic[i].charAt(index)=='1' || topic[j].charAt(index)=='1'){
                        tempSkills++;
                    }
                    index++;
                }
                if(tempSkills==maxSkills){
                    teamsWithMax++;
                } else if(tempSkills>maxSkills){
                    maxSkills = tempSkills;
                    teamsWithMax = 1;
                }

            }
        }
        result[0] = maxSkills;
        result[1] = teamsWithMax;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
