// Every submission at HackerRank has a field called language which indicates the programming
// language which a hacker used to code his solution.
//
// C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA: ERLANG:CLISP:LUA:BRAINFUCK:
// JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART: GROOVY:OBJECTIVEC
//
// Sometimes, error-prone API requests can have an invalid language field. Could you find out
// if a given submission has a valid language field or not?
//
// Input Format
// First line contains N. N API requests follow, each in a newline. Each request has an integer
// api_id and a string language which are the request parameters placed by the an API request.
//
// Constraints
// 1 <= N <= 100
// 10^4 <= api_id < 10^5
// a valid language is any of the languages listed above (case sensitive):
//
// Output Format
// For every api request given in input, print "VALID" if it has a valid language string in
// it or print "INVALID" otherwise.

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        // 10000 - 100000
        Pattern p = Pattern.compile("\\b(BASH|BRAINFUCK|C|CLISP|CLOJURE|CPP|CSHARP|D|DART|ERLANG|GO|GROOVY|HASKELL|JAVA|JAVASCRIPT|LUA|OBJECTIVEC|OCAML|PASCAL|PERL|PHP|PYTHON|R|RUBY|SBCL|SCALA)\\b");
        for(int i=0; i<lines; i++){
            String[] input = scanner.nextLine().split(" ");
            int id = Integer.parseInt(input[0]);
            if(id>=10000 && id<=100000){
                Matcher m = p.matcher(input[1]);
                if(m.find()){
                    System.out.println("VALID");
                } else {
                    System.out.println("INVALID");
                }
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
