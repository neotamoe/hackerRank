// Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        String meridian = s.substring(8);
        String hour = s.substring(0,2);
        String remaining = s.substring(2,8);
        if(hour.equals("12") && meridian.equals("AM")){
            return "00"+remaining;
        } else if(hour.equals("12") && meridian.equals("PM")){
            return "12"+remaining;
        }
        else if(meridian.equals("AM")){
            return s.substring(0,8);
        } else {
            int hourAsInt = Integer.parseInt(hour) + 12;
            return Integer.toString(hourAsInt) + remaining;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
