// TASK: Using Regex, we can easily match or search for patterns in a text. Before
// searching for a pattern, we have to specify one using some well-defined syntax.
// In this problem, you are given a pattern. You have to check whether the syntax of
// the given pattern is valid.
// Note: In this problem, a regex is only valid if you can compile it using the
// Pattern.compile method.
// OUTPUT: For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
import java.util.Scanner;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0) {
        String pattern = in.nextLine();
        //Write your code
        Pattern pattern1;
        try {
            pattern1 = Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {  // case of illegal pattern
            System.out.println("Invalid");
        }
      }
   }
}
