// Backreference to a capturing group that match nothing is different from backreference to
// a capturing group that did not participate in the match at all.
//
// Capturing group that match nothing -> (b)?o\1
// Here, b? is optional and matches nothing.
// Thus, (b?) is successfully matched and capture nothing.
// o is matched with o and \1 successfully matches the nothing captured by the group.
//
// Capturing group that didn't participate in the match at all
// In most regex flavors (excluding JavaScript), (b)?o\1 fails to match o.
// Here, (b) fails to match at all. Since, the whole group is optional the regex engine does proceed to match o. 
// The regex engine now arrives at \1 which references a group that did not participate in the match attempt at all.
// Thus, the backreference fails to match at all.
//
// Task
// You have a test string S.
// Your task is to write a regex which will match S, with following condition(s):
//
// S consists of 8 digits.
// S may have "-" separator such that string S gets divided in 4 parts, with each part having exactly two digits.
// (Eg. 12-34-56-78)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[0-9]{2}(\\1)?[0-9]{2}(\\1)?[0-9]{2}(\\1)?[0-9]{2}$");

    }
}


class Regex_Test {

    public void checker(String Regex_Pattern){

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}
