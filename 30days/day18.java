// Comment: woohoo!  my first work with stacks and queues in Java
// Day 18: Queues and Stacks
// To solve this challenge, we must first take each character in s, enqueue it in
// a queue, and also push that same character onto a stack. Once that's done, we
// must dequeue the first character from the queue and pop the top character off the
// stack, then compare the two characters to see if they are the same; as long as
// the characters match, we continue dequeueing, popping, and comparing each character
// until our containers are empty (a non-match means s isn't a palindrome).
// See more detailed instructions at:
// https://www.hackerrank.com/challenges/30-queues-stacks/problem

import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    Queue<Character> queue = new LinkedList<Character>();
    Stack<Character> stack = new Stack();

    // A void pushCharacter(char ch) method that pushes a character onto a stack.
    void pushCharacter(char ch){
        stack.push(ch);
    }

    // A void enqueueCharacter(char ch) method that enqueues a character in the queue instance variable.
    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    // A char popCharacter() method that pops and returns the character at the top of the stack instance variable.
    char popCharacter() {
        return stack.pop();
    }

    // A char dequeueCharacter() method that dequeues and returns the first character in the queue instance variable.
    char dequeueCharacter() {
        return queue.remove();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
