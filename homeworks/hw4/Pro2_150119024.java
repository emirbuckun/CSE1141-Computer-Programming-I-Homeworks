/* This program will determine whether or not a given 
 * credit card number is valid per the Luhn formula.
 *  
 * Student Name - No: Emir Büçkün - 150119024 */

package hw4;

import java.util.Scanner;

public class Pro2_150119024 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// Get the credit card number
		String cardNumber = input.nextLine();
		input.close();

		// Check the input of length is not 1 or less
		if (cardNumber.length() <= 1) {
			System.out.println("Invalid Input !");
			System.exit(1);
		}

		// Check the all input characters are not non-digit characters
		for (int i = 0; i < cardNumber.length(); i++) {
			if (!Character.isDigit(cardNumber.charAt(i)) && cardNumber.charAt(i) != ' ') {
				System.out.println("Invalid Input !");
				System.exit(2);
			}
		}

		// Invoke the validate method
		if (validateNumber(cardNumber))
			System.out.println("Number is Valid");
		else
			System.out.println("Number is Invalid");
	}

	public static boolean validateNumber(String number) {
		int intCount = 0;
		char[] numberArray = new char[number.length()];
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) != ' ') {
				numberArray[intCount] = number.charAt(i);
				intCount++;
			}
		}

		// Print DNumber
		System.out.print("DNumber:");
		for (int i = 0; i < intCount; i++) {
			if (intCount % 2 == 0)
				System.out.print(i % 2 == 1 ? "_" : numberArray[i]);
			else
				System.out.print(i % 2 == 0 ? "_" : numberArray[i]);
		}
		System.out.println();
		
		// Print LNumber
		int[] intArray = new int[intCount];
		
		System.out.print("LNumber:");
		for (int i = 0; i < intCount; i++) {
			int value = Integer.parseInt(String.valueOf(numberArray[i]));
			if (intCount % 2 == 0) {
				if (i % 2 == 0) {
					intArray[i] = value * 2 > 9 ? value * 2 - 9 : value * 2;
				}
				else
					intArray[i] = value;
			}
			else
				if (i % 2 == 1) {
					intArray[i] = value * 2 > 9 ? value * 2 - 9 : value * 2;
				}
				else
					intArray[i] = value;
			
			
			System.out.print(intArray[i]);
		}
		System.out.println();
		
		// Calculate the sum all of the digits
		int sum = 0;
		
		for (int i = 0; i < intCount; i++) {
			sum += intArray[i];
		}
		
		// If the sum is evenly divisible by 10, then the number is valid
		if (sum % 10 == 0)
			return true;
		return false;
	}
}
