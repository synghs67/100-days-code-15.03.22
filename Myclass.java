package com.sayan;

import java.util.Scanner;

public class Myclass {
    public static void main(String[] args) {
        // Variable declaration
        int[] data = new int[] {10,12,13,15,18,19,20,45,50,66,78,99,109,44};
        int input;
        int low,mid,high;
        Scanner obj = new Scanner ( System.in );
        boolean isFound = false;

        // Take input form user
        System.out.println ("Enter the number for search");
        input = Integer.parseInt ( obj.nextLine () );

        // Initialize variable
         low = 0;
         high = data.length;
         mid = (low + high)/2;

         // logic
        while (true){
            if (input==data[mid]){
                System.out.println ("Number found at index"+ mid);
                isFound = true;
                break;
            }
            else if(input<data[mid] ) {

               high = mid;
            }
            else {
                low = mid;

            }
            mid = (low + high)/2;
        }


    }
}
