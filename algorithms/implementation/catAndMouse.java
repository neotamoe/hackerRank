// Two cats and a mouse are at various positions on a line. You will be given their starting
// positions. Your task is to determine which cat will reach the mouse first, assuming the
// mouse doesn't move and the cats travel at equal speed. If the cats arrive at the same
// time, the mouse will be allowed to move and it will escape while they fight.
//
// You are given q queries in the form of x, y, and z representing the respective positions
// for cats A and B, and for mouse C. Complete the function catAndMouse to return the
// appropriate answer to each query, which will be printed on a new line.
//
// If cat A catches the mouse first, print Cat A.
// If cat B catches the mouse first, print Cat B.
// If both cats reach the mouse at the same time, print Mouse C as the two cats fight
// and mouse escapes.


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {


    /*
     * Complete the catAndMouse function below.
     */
    static String catAndMouse(int x, int y, int z) {
        /*
         * Write your code here.
         */
        String winner = "";
            if(Math.abs(y-z)>Math.abs(x-z)){
                winner = "Cat A";
            } else if (Math.abs(y-z)<Math.abs(x-z)){
                winner = "Cat B";
            } else {
                winner = "Mouse C";
            }

        return winner;
    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scan.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scan.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0].trim());

            int y = Integer.parseInt(xyz[1].trim());

            int z = Integer.parseInt(xyz[2].trim());

            String result = catAndMouse(x, y, z);

            bw.write(result);
            bw.newLine();
        }

        bw.close();
    }
}
