package myPackage;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int n;
        boolean isPrime;
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Entre number to find prime or not  " );
         n = sc.nextInt ();
         if (n <2 )
             isPrime = false;
         else
             isPrime = true;
        for (int i = 2; i < n / i; i++) {
            if (n % i == 0){
                isPrime = false;
                break;

            }

        }


        if (isPrime)
            System.out.println ( n + "  is prime number ");
        else
            System.out.println (n + "  is not prime number  ");

    }
}
