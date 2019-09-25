using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] arrGiven) {
        int lonelyInteger = -1;
        if(arrGiven.Count() == 1){
            lonelyInteger = arrGiven[0];
            return lonelyInteger;
        }
        Array.Sort(arrGiven);
        for (int i = 0; i <= arrGiven.Count()-1; i++) 
        {
            if(i+1 < arrGiven.Count()-1){
                if(arrGiven[i] == arrGiven[i+1])
                {
                    i++;
                } 
                else 
                {
                    lonelyInteger = arrGiven[i];
                    return lonelyInteger;
                }
            } else {
                lonelyInteger = arrGiven[i];                
            }
        }
        return lonelyInteger;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int n = Convert.ToInt32(Console.ReadLine());

        int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), aTemp => Convert.ToInt32(aTemp))
        ;
        int result = lonelyinteger(a);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}

// https://www.hackerrank.com/challenges/lonely-integer/problem