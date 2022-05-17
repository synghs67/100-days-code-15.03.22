package com.spring.apps.calculator.beans.arithmeticoperations;

public class BasicArithmeticOperations {
 private int num1;
 private int num2;
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}
public BasicArithmeticOperations() {
	super();
	// TODO Auto-generated constructor stub
}
public BasicArithmeticOperations(int num1, int num2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
}

 
 public void add () {
	 System.out.println("Add the two number" + (num1 + num2) );
	 
 }
 public void subtract() {
	 if (num1 >= num2)
	 System.out.println(num1 - num2);
	 else 
		 System.out.println(num2 - num1);
 }
 public void multiply () {
	 if (num1 == 0 || num2 ==0)
		 System.out.println("0");
	 else 
		 System.out.println(num1 * num2);
	 
 }
 
 public void divide () {
	 try {
	 System.out.println(num1 / num2);
	 } catch (ArithmeticException e){
		 System.out.println("Dividing by zero operation can't happen");
		 
	 }
        
   
 }
 @Override
 public String toString() {
 	return "BasicArithmeticOperations [num1=" + num1 + ", num2=" + num2 + "]";
 }
	
	
}
