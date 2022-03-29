package myPackage;

class Actor{
    int fact (int n){
        if (n== 1) return 1;

        int result = fact ( n - 1 ) * n;
  return result;
    }
}
class Factorial {
    public static void main(String[] args) {
      Actor fac = new Actor ();
        System.out.println (fac.fact(3));
        System.out.println (fac.fact ( 4 ));
    }
}
