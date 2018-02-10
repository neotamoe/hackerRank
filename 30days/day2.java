// Day 2: Operators
// Given the meal price (base cost of a meal), tip percent (the percentage of the
// meal price being added as tip), and tax percent (the percentage of the meal price
// being added as tax) for a meal, find and print the meal's total cost.
//
// Note: Be sure to use precise values for your calculations, or you may end up
// with an incorrectly rounded result!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        double tipCost = meal_cost * (tip_percent / 100.0);
        double taxCost = meal_cost * (tax_percent / 100.0);
        double totalCost = Math.round(meal_cost + tipCost + taxCost);
        int totalCostInt = (int)totalCost;
        System.out.println("The total meal cost is " + totalCostInt + " dollars.");
    }


}
