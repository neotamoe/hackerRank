// Day 23: BST Level-Order Traversal

// A level-order traversal, also known as a breadth-first search, visits each level
// of a tree's nodes from left to right, top to bottom. You are given a pointer, root,
// pointing to the root of a binary search tree. Complete the levelOrder function
// provided in your editor so that it prints the level-order traversal of the binary
// search tree.
// OUTPUT: Print the data value of each node in the tree's level-order traversal as a single
 // line of N space-separated integers.

// Helpful tutorial at: https://www.hackerrank.com/challenges/30-binary-trees/tutorial


import java.util.*;
import java.io.*;
class Node{
  Node left,right;
  int data;
  Node(int data){
      this.data=data;
      left=right=null;
  }
}
class Solution{
  static void levelOrder(Node root){
      //Write your code here
    Queue<Node> rootQueue = new LinkedList<Node>();
    if(root != null) {
        rootQueue.add(root);
    }
    while(rootQueue != null) {
      root = rootQueue.remove();
      System.out.print(root.data + " ");

      if(root.left != null) {
          rootQueue.add(root.left);
      }
      if(root.right != null) {
          rootQueue.add(root.right);
      }

    }
  }

  public static Node insert(Node root,int data){
    if(root==null){
      return new Node(data);
    }
    else{
      Node cur;
      if(data<=root.data){
          cur=insert(root.left,data);
          root.left=cur;
      }
      else{
          cur=insert(root.right,data);
          root.right=cur;
      }
      return root;
    }
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    Node root=null;
    while(T-->0){
        int data=sc.nextInt();
        root=insert(root,data);
    }
    levelOrder(root);
  }
}
