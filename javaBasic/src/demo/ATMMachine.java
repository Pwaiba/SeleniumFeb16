
package demo;

import java.util.Scanner;

public class ATMMachine {
	
public static void main(String[]args) {
	int correctPIN = 1234; 
	System.out.println("Please enter your PIN - ");
	
	Scanner Keyboard = new Scanner (System.in);
	int enterdPIN = Keyboard.nextInt();
	
	
	while(enterdPIN  != correctPIN) {   // 'while Loop' use when user is not sure how many times need to print
		System.out.println("The number you have enterd is incorrect. Please try again");	
		enterdPIN = Keyboard.nextInt();
		
		}

	System.out.println("WelCome to ABC Bank");
}
	
	
	
	
	
	
	
}
