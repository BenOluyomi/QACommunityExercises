package Scanners;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Excersise 1
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int num1 = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the second number");
		
		int num2 = scan2.nextInt();
		
		Scanner op = new Scanner(System.in);
		System.out.println("Enter the operator");
		String operator = op.next();
		
		if(operator.equals("+")) {
			
			System.out.println(add(num1, num2));
			
		} else if(operator.equals("-")) {
			System.out.println(sub(num1, num2));
			
		} else if(operator.equals("*")) {
			System.out.println(mult(num1, num2));
			
		} else if(operator.equals("/")) {
			System.out.println(div(num1, num2));
			
		}
		
		//Exercise 2
		
		
	}
	
	
	public static int add(int a, int b) {
		int result = a+b;
		
		return result;
	}
	public static int sub(int a, int b) {
		int result = a -b;
		
		return result;
	}
	public static int mult(int a, int b) {
		int result = a *b;
	
		return result;
	}
	public static double div(int a, int b) {
		double result = a/b;
		
		return result;
	}

}
