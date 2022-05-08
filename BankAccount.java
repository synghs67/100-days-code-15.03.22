package com.bank;

public class BankAccount {
    private String acHolder;
    private int acNum;
    private double acBalance;

    public BankAccount(String acHolder, int acNum, double acBalance) {
        this.acHolder = acHolder;
        this.acNum = acNum;
        this.acBalance = acBalance;
    }

    public BankAccount() {
        this.acHolder = "SaYan";
        this.acNum = 99326633;
        this.acBalance = 13200;
    }

    public String getAcHolder() {
        return acHolder;
    }

    public void setAcHolder(String acHolder) {
        this.acHolder = acHolder;
    }

    public int getAcNum() {
        return acNum;
    }

    public void setAcNum(int acNum) {
        this.acNum = acNum;
    }

    public double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(double acBalance) {
        this.acBalance = acBalance;
    }

    public  double deposit (double amount) {

        this.setAcBalance ( this.getAcBalance () + amount );
        return  acBalance;
    }

    public double  withdraw ( double amount ) {
        this.setAcBalance ( this.getAcBalance () - amount );
        return acBalance;
    }

    @Override
    public String toString(){

        return "BankAccount [accHolder=" + acHolder + ", accNum=" + acNum + ", accBalance=" + acBalance + ']';
    }


}
