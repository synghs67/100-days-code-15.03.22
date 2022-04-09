package mypackage;

import java.util.Scanner;

public class Origin {
    public String bread;
    public int age;
   private String name;
   public String types;
   public static String saller = "Bose Company";

//    public Origin() {
//        this.bread = "Labrador";
//        this.age = 19;
//        this.name = "Tekka";
//        this.types = "Puppy";
//    }


    public void  setBread() {
        Scanner obj = new Scanner ( System.in );
        System.out.println ("Enter bread name");
        bread = obj.nextLine ();
       if (bread.equals ( "Labrador" ) ) {
           System.out.println ( "Found the match" );
       } else {
           System.out.println ("not found");
       }

    }

    public String setName(){
        if (bread.equals ( "Labrador" ))
            return "Tekka";
        else
            return "Not found";
    }
    public void setAge(){
        System.out.println (19 + "Days puppy");

    }
    public void  setTypes(){
        Scanner nw = new Scanner ( System.in );
        System.out.println ("Enter what types you want");
        types=nw.nextLine ();
        if (types.equals ( "Dog" )) {
            System.out.println ("Not avalavle");
        }
       else {

            System.out.println ("We sell puppy only please search about puppy");
        }
    }
    public static  void getSeller(){
        System.out.println (saller);
    }
    public static void getSeller(String name){
        System.out.println (name);
    }
}







