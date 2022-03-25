package myPackage;

public class Main {
    public static void main(String[] args) {
        int x = 10 , y = 10;
        if (++x > 11 & ++y <10 ){
            x++;
        }else {
            y++;
        }
        System.out.println (x + " " + y);

        x= 10 ; y = 10;

         if (++x > 11 && ++y <10){
             x++;
         }else {
             y++;
         }
        System.out.println (x + " " + y );
    }
}
