// Write a program to print string "hello world" once take two variable a=3, b=0
// run a loop print every number once
// print "b is great" if b=a and "b is a looser" if b =0
//
package myPackage;

public class Log {
    public static void main(String[] args) {
        System.out.println ("hello world");
         int a = 3 , b = 0;


        for ( b  = 0; b <5 ; System.out.println (b++) ) {
          //  b++;

            if (b == a ) {
                System.out.println ( "B is great " );

            } else if(b == 0){
                System.out.println (" B is looser");

            }
            //System.out.println (b);



    }
}
}
