package sayan.com;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int input;
        Scanner obj = new Scanner ( System.in );
        boolean isPrime;
        System.out.println ( "Enter the number" );
        input = obj.nextInt ();

        if (input < 2)
            isPrime = false;
        else
            isPrime = true;
        for (int i = 2; i < input / i; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println ( "Prime number" );
        else
            System.out.println ( "Not prime" );


    }
}
