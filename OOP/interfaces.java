// Interfaces: (this was the same problem as day 19 in 30 days)
// A Java interface can only contain method signatures and fields. The interface
// can be used to achieve polymorphism.

import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum (int n) {
       int sum = 0;
        int divisor = 0;
        ArrayList<Integer> sumDivisors = new ArrayList<Integer>();
        if(n==1){
            sum = 1;
        } else {
            for (int i = 1; i < n/2; i++){
                if(n%i == 0){
                    divisor = n/i;
                    if(!sumDivisors.contains(i)){
                        sumDivisors.add(i);
                    }
                    if(!sumDivisors.contains(divisor)){
                        sumDivisors.add(divisor);
                    }
                }
            }
            sum = sumDivisors.stream().map(i -> i).mapToInt(Integer::intValue).sum();
        }
        return sum;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
