// An English text needs to be encrypted using the following encryption scheme.
// First, the spaces are removed from the text. Let L be the length of this text.
// Then, characters are written into a grid, whose rows and columns have the following constraints:
//
// floorFunction <= rows <= columns <= ceilingFunction
//
// For example, the sentence s=if man was meant to stay on the ground god would have given us roots,
// after removing spaces is 54 characters long. SquareRoot of 54 is between 7 and 8, so it
// is written in the form of a grid with 7 rows and 8 columns.
// 
// ifmanwas
// meanttos
// tayonthe
// groundgo
// dwouldha
// vegivenu
// sroots
//
// Ensure that rows * columns >= L.
// If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows * columns.
// The encoded message is obtained by displaying the characters in a column, inserting a space, and
// then displaying the next column and inserting a space, and so on. For example, the encoded message
// for the above rectangle is:
//
// imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau
//
// You will be given a message to encode and print.
//
// Function Description
//
// Complete the encryption function in the editor below. It should return a single string composed as described.
//
// encryption has the following parameter(s):
//
// s: a string to encrypt

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static void encryption(String s) {
        String finalString = s.replaceAll("\\s+","");

        int rows = (int)Math.floor(Math.sqrt(finalString.length()));
        int columns = (int)Math.ceil(Math.sqrt(finalString.length()));
        int passes = 0;
        while(passes<columns){
            for(int i=passes; i<finalString.length(); i+=columns){
                System.out.print(finalString.charAt(i));
            }
            System.out.print(" ");
            passes++;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        encryption(s);

        scanner.close();
    }
}
