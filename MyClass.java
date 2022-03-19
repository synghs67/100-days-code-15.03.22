package myPackage;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        System.out.println ("Entered the first number ");
        int first = sc.nextInt ();
        System.out.println ("Entered the second number ");
        int second = sc.nextInt ();
        System.out.println ("Entered the third number ");
        int third = sc.nextInt ();
        int largest = largest(first,second,third);
        int smallest = smallest(first, second, third);
        System.out.println ( "Largest number is : " +largest);
        System.out.println ("Smallest number is : "+smallest);
        sc.close ();
    }

    private static int largest(int first, int second, int third) {
        int max = first;
        if (second> max) {
            max = second;
        }
         if (third>second){
            max = third;
        }
        return max;
    }

    private static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min){
            min = second;
        }
         if (third < second){
            min = third;
        }
         return min;
    }

}
