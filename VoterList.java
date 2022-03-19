package myPackage;

import java.util.Scanner;

public class VoterList {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Please put your age to check are you eligible or not");
         age = sc.nextInt ();

        if (age >= 18) {
            System.out.println ("You are eligible to given vote");

        }
        else {
            System.out.println ("You are not eligible to given vote");
        }

    }
}
