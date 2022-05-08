package com.bank;

import java.net.StandardSocketOptions;

public class Bank {
    public static void main(String[] args) {
        BankAccount bAc1 = new BankAccount (  );
        System.out.println ("Welcome To bank check your updated  Balance");
        bAc1.deposit ( 300 );
        System.out.println ("Update balance" + bAc1);
        bAc1.withdraw ( 500 );
        System.out.println ("Update balance after withdraw" + bAc1);
        BankAccount bAc2 = new BankAccount ("SYN" , 663368 , 12100);
        bAc2.deposit ( 400 );
        System.out.println ("Obj2 balance" + bAc2);
        bAc2.withdraw ( 200 );
        System.out.println (" After withdraw obj2 balance " + bAc2  );
    }
}
