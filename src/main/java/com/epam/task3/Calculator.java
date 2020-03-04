package com.epam.task3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int x = 0,y = 0;
		Operations calculator = new Operations();
		System.out.println("Calculator Operations");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		System.out.println("Exit");
		while(true) {
			Scanner sc = new Scanner(System.in);
			try {
				
			int choice = sc.nextInt();
			System.out.println("Enter your choice option");
			switch(choice) {
			case 1:
				System.out.println("Enter the number one");
				x = sc.nextInt();
				System.out.println("Enter the number two");
				y = sc.nextInt();
				System.out.println("Addition of two numbers is = " + calculator.Addition(x,y));
				break;
			case 2:
				System.out.println("Enter the number one");
				x = sc.nextInt();
				System.out.println("Enter the number two");
				y = sc.nextInt();
				System.out.println("Subtraction of two numbers is = " + calculator.Subtraction(x,y));
				break;
		case 3:
			System.out.println("Enter the number one");
			x = sc.nextInt();
			System.out.println("Enter the number two");
			y = sc.nextInt();
			System.out.println("Multiplication of two numbers is = " + calculator.Multiplication(x,y));
			break;
	case 4:
		System.out.println("Enter the number one");
		x = sc.nextInt();
		System.out.println("Enter the number two");
		y = sc.nextInt();
		System.out.println("Division of two numbers is = " + calculator.Division(x,y));
		break;
	default:
			System.out.println("The number choosen is out of range");
			break;
	}
			}catch(Exception e) {
				System.out.println("Option is Invalid");
				
			}
		}

	}
}