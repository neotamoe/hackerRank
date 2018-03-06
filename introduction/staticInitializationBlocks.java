// Java Static Initializer Block
// Static initialization blocks are executed when the class is loaded, and you
// can initialize static variables in those blocks.
// You are given a class Solution with a main method. Complete the given code so
// that it outputs the area of a parallelogram with breadth B and height H.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  static int B;
  static int H;
  static boolean flag;

  static{
      Scanner scanner = new Scanner(System.in);
      B = scanner.nextInt();
      H = scanner.nextInt();
      if (B<1 || H<1){
          flag = false;
          System.out.println("java.lang.Exception: Breadth and height must be positive");
      } else {
          flag = true;
      }

  }

  public static void main(String[] args){
 		if(flag){
 			int area=B*H;
 			System.out.print(area);
 		}

 	}//end of main

 }//end of class
