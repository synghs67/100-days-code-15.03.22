package myPackage;

public class PrimeNumber {

    public static boolean isPrime(int n){
        if (n <=1)
        return false;
        for (int i = 2; i < n / i ; i++) {
            if (n % i == 0)
                return false;

        }return true;
    }

    public static void main(String[] args) {
        if (isPrime ( 13 ))
        System.out.println ("Prime");
         else
                System.out.println ("Not prime");
         if (isPrime ( 15 ))
             System.out.println ("Prime");
         else
             System.out.println ("Not prime");

    }
}
