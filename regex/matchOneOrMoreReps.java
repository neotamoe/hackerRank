// The + tool will match one or more repetitions of character/character class/group.
//
// w+ : It will match the character w  or more times.
// [xyz]+ : It will match the character x, y or z  or more times.
// \d+ : It will match any digit  or more times.
//
// Task
//
// You have a test string S.
// Your task is to write a regex that will match S using the following conditions:
//
// S should begin with 1 or more digits.
// After that, S should have 1 or more uppercase letters.
// S should end with 1 or more lowercase letters.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[\\d]+[A-Z]+[a-z]+$"); // Use \\ instead of using \

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
