// Day 28: RegEx, Patterns, and Intro to Databases\
// TASK: Consider a database table, Emails, which has the attributes First Name and Email ID.
// Given N rows of data simulating the Emails table, print an alphabetically-ordered list
// of people whose email address ends in gmail.com.
// INPUT: The first line contains an integer, N, total number of rows in the table.
// Each of the N subsequent lines contains 2 space-separated strings denoting a person's first name and email ID, respectively.
// OUTPUT: Print an alphabetically-ordered list of first names for every user with a gmail account. Each name must be printed on a new line.
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> namesWithGmail = new ArrayList<String>(N);
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            String myRegExString = "[a-z]+(@gmail.com)";

            // Create a Pattern object (compiled RegEx) and save it as 'p'
            Pattern p = Pattern.compile(myRegExString);

            // We need a Matcher to match our compiled RegEx to a String
            Matcher m = p.matcher(emailID);

            if(m.find()){
                namesWithGmail.add(firstName);
            }
        }
        namesWithGmail.stream().sorted().forEach(System.out::println);
    }
}
