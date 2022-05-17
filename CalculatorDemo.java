package com.spring.apps.calculator;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.apps.calculator.beans.arithmeticoperations.BasicArithmeticOperations;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext ("applicationContextConfig");
		BasicArithmeticOperations operation = context.getBean("BasicArithmeticOperations", BasicArithmeticOperations.class);
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter preferred Operation: ");

		String input = scanner.next();

		switch (input) {
		case "+":
			System.out.println("Opeartion to be performed : " + input + " :Addition");
			operation.add();
			break;
		case "-":
			System.out.println("Opeartion to be performed : " + input + "  :Subtraction");
			operation.subtract();
			break;
		case "*":
			System.out.println("Opeartion to be performed : " + input + "  :Multiplication");
			operation.multiply();
			break;
		case "/":
			System.out.println("Opeartion to be performed : " + input + " :Division");
			operation.divide();
			break;
		default:
			System.out.println("Invalid Operation Entered");

		}
               System.out.println(operation);

		context.close();


	}

}
