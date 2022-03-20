package myPackage;

import java.util.Scanner;

public class SumOfTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Entered first number");
        int firstNum = sc.nextInt ();

        System.out.println ("Entered second number");
        int secondNum = sc.nextInt ();

           sc.close ();

          num_Sum ( firstNum , secondNum );
          int total =  subtract ( firstNum , secondNum );
        System.out.println (" Subtract of two number is  : " + total);

    }
    public  static void num_Sum (int a , int b) {
        int sum = a + b;
        System.out.println ("Sum of two number : " + sum);
    }
    public static int subtract ( int c , int d){
        int sub = c - d;
        return sub;
    }
}
