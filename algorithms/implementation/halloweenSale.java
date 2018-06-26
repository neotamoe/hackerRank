// You wish to buy video games from the famous online video game store Mist.
//
// Usually, all games are sold at the same price,  p dollars. However, they are planning
// to have the seasonal Halloween Sale next month in which you can buy games at a cheaper
// price. Specifically, the first game you buy during the sale will be sold at p dollars,
// but every subsequent game you buy will be sold at exactly d dollars less than the cost
// of the previous one you bought. This will continue until the cost becomes less than
// or equal to m dollars, after which every game you buy will cost m dollars each.
//
// You have s dollars in your Mist wallet. How many games can you buy during the Halloween Sale?


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int gamesBought = 0;
        while(s>=p){
            if(s-p>=0){
                gamesBought++;
                s-=p;
            }
            if(p-d < m){
                p=m;
            } else {
                p-=d;
            }
        }
        return gamesBought;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] pdms = scanner.nextLine().split(" ");

        int p = Integer.parseInt(pdms[0]);

        int d = Integer.parseInt(pdms[1]);

        int m = Integer.parseInt(pdms[2]);

        int s = Integer.parseInt(pdms[3]);

        int answer = howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
