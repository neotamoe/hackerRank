// You are given a class Solution and its main method in the editor. Your task is to
// create a class Prime. The class Prime should contain a single method checkPrime.
//
// The locked code in the editor will call the checkPrime method with one or more
// integer arguments. You should write the checkPrime method in such a way that the
// code prints only the prime numbers.
//
// Read the code given in the editor carefully. Do not use method overloading!
// 
// Note: You may get a compile time error in this problem due to the statement below:
//   BufferedReader br=new BufferedReader(new InputStreamReader(in));
// This was added intentionally, and you have to figure out a way to get rid of the error.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

import static java.lang.System.in;

class Prime {

    void checkPrime (int ... x) {
        boolean isPrime = false;
        String output = "";

        for(int k:x){
            if(k<=1){
                // not prime, do nothing
            } else if (k==2 || k==3) {
                output = output + k + " ";
            } else {
                for(int i=2; i<=Math.sqrt(k); i++){
                    if(k%i==0){
                        // do nothing, k is not prime
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                        continue;
                        // output = output + k + " ";
                    }
                }
                if(isPrime){
                    output = output + k + " ";
                }
            }
        }
        System.out.println(output);

    }
}

public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());

		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
