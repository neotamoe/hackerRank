// Given a line of text which possibly contains the latitude and longitude of a point, can you
// use regular expressions to identify the latitude and longitude referred to (if any)?
//
// Input Format
// * The first line contains an integer N, which is the number of tests to follow.
// * This is followed by N lines of text. Each line contains a pair of co-ordinates which possibly
//   indicate the latitude and longitude of a place.
//
// Constraints 
// * 1 <= N <= 100
// * The latitude and longitude, if present will always appear in the form of (X, Y)
//   where X and Y are decimal numbers.
// * For a valid (latitude, longitude) pair: -90<=X<=+90 and -180<=Y<=180.
// * They will not contain any symbols for degrees or radians or N/S/E/W. There may or may not
//   be a +/- sign preceding X or Y.
// * There will be a space between Y and the comma before it.
// * There will be no space between X and the preceding left-bracket, or between Y and the
//   following right-bracket.
// * There will be no unnecessary zeros (0) before X or Y.
//
// Output Format
// "Valid" where X and Y are the latitude and longitude which you found to be a valid (latitude,longitude) pair.
// If the given pair of numbers are not a valid (latitude,longitude) pair, output "Invalid".

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Pattern p = Pattern.compile("\\([+-]?([0-9]([\\.][0-9]{1,})?|[1-8][0-9]([\\.][0-9]{1,})?|90([\\.][0]{1,})?)[,]\\s[+-]?([0-9]([\\.][0-9]{1,})?|[1-9][0-9]([\\.][0-9]{1,})?|1[0-7][0-9]([\\.][0-9]{1,})?|180([\\.][0]{1,})?)\\)");

        for(int i=0; i<lines; i++){
            Matcher m = p.matcher(scanner.nextLine());
            if(m.find()){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
