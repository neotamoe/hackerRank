// The expression \w will match any word character.
// Word characters include alphanumeric characters (a-z, A-Z and 0-9) and underscores (_).
//
// \W matches any non-word character.
// Non-word characters include characters other than alphanumeric characters (a-z, A-Z and 0-9) and underscore (_).
//
// Task
// You have a test string S. Your task is to match the pattern xxxXxxxxxxxxxxXxxx
// Here x denotes any word character and X denotes any non-word character.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\w\\w\\w\\W\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w\\W\\w\\w\\w"); // Use \\ instead of using \

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
