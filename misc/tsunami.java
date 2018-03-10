// https://www.hackerrank.com/contests/womens-codesprint-5/challenges/tsunami/problem
// Comment: This passes 5 of the 25 cases.  It times out on the remaining 20.
// I optimized where I knew I could, but stopped at this point.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numberOfIslands = Integer.parseInt(scanner.nextLine());

        Island[] islands = new Island[numberOfIslands];
        Island island;

        for(int i=0; i<numberOfIslands; i++){
            String[] islandDeets = scanner.nextLine().split(" ");
            islands[i] = new Island(Integer.parseInt(islandDeets[0].trim()), Integer.parseInt(islandDeets[1].trim()));
        }

        int queries = Integer.parseInt(scanner.nextLine());
        for(int j=0; j<queries; j++){
            String[] islandAlert = scanner.nextLine().split(" ");
            int affectedIsland = Integer.parseInt(islandAlert[1].trim());

            if(islandAlert[0].equals("d")){

                island =
                    Arrays.stream(islands)
                    .filter(p -> p.id==affectedIsland)
                    .findFirst().get();

                island.drowned=true;

            } else {
                if (islands[affectedIsland-1].drowned) {
                    System.out.println("DROWNED");
                } else {

                    Optional<Island> matchingIsland = Arrays.stream(islands)
                        .filter(p -> p.id > islands[affectedIsland-1].id)
                        .filter(p -> p.height > islands[affectedIsland-1].height)
                        .filter(p -> p.drowned == false)
                        .min((p1, p2) -> Integer.compare(p1.id, p2.id));

                    island = matchingIsland.orElse(null);
                    if(island != null){
                        System.out.println(island.id);
                    } else {
                        System.out.println("IMPOSSIBLE");
                    }

                }
            }
        }
    }

    static class Island {
        public int id;
        public int height;
        public boolean drowned;

        public Island(int id, int height){
            this.id = id;
            this.drowned = false;
            this.height = height;
        }

    }

}
