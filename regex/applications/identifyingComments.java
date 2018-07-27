// Jack wants to build an IDE on his own. Help him build a feature which identifies the comments,
// in the source code of computer programs. Assume, that the programs are written either in C, C++
// or Java. The commenting conventions are displayed here, for your convenience. At this point of
// time you only need to handle simple and common kinds of comments. You don’t need to handle nested
// comments, or multi-line comments inside single comments or single-comments inside multi-line comments.
// 
// Your task is to write a program, which accepts as input, a C or C++ or Java program and
// outputs only the comments from those programs. Your program will be tested on source codes
// of not more than 200 lines.
//
// Output Format
// From the program given to you, remove everything other than the comments.
//
// Precautions
// Do not add any leading or trailing spaces. Remove any leading white space before comments,
// including from all lines of a multi-line comment. Do not alter the line structure of multi-line
// comments except to remove leading whitespace. i.e. Do not collapse them into one line.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p = Pattern.compile("(//|/\\*)(.*?(?=$))");
        while(scanner.hasNextLine()){
            Matcher m = p.matcher(scanner.nextLine());
            if(m.find()){
                System.out.println(m.group(0).trim());
                if(m.group(1).equals("/*") && !m.group(0).substring(m.group(0).length()-2).equals("*/")){
                    String checkNext = scanner.nextLine();
                    while(!checkNext.substring(checkNext.length()-2).equals("*/")){
                        System.out.println(checkNext.trim());
                        if(scanner.hasNextLine()){
                         checkNext = scanner.nextLine();
                        }
                    }
                    System.out.println(checkNext.trim());
                }
            }
        }
    }
}
