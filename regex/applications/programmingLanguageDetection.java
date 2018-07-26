// We are trying to hack together a smart programming IDE. Help us build a feature which auto-detects
// the programming language, given the source code. There are only three languages which we are
// interested in "auto-detecting": Java, C and Python.
// 
// You are provided the source code for programs - or partial code snippets, but you do
// not know which language they are in. For each test, try to detect which language the
// source code is in.
//
// INPUT FORMAT
// Source code of a program, or a code snippet, which might be in C, Java or Python.
//
// OUTPUT FORMAT
// Just one line containing the name of the Programming language which you have detected:
// either C or Java or Python.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String code = "";
        while(scanner.hasNextLine()){
            code += scanner.nextLine() + " ";
        }
        Pattern p = Pattern.compile(".*(import\\sjava\\.)|(#include)|(print[\\s(]).*");
        Matcher m = p.matcher(code);
        if(m.find()){
            if(m.group(1)!=null && m.group(1).equals("import java.")){
                System.out.println("Java");
            } else if (m.group(2)!=null && m.group(2).equals("#include")){
                System.out.println("C");
            } else {
                System.out.println("Python");
            }
        }
    }
}
