/* This program calculates the compound monthly interest. 
 * The program asks user to enter value of principle, 
 * annual interest rate and time and finally calculates the compound interest.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw1;

import java.util.Scanner;

public class Pro2_150119024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get required variables from user
		System.out.print("Enter initial principle balance: ");
		double balance = input.nextDouble();
		System.out.print("Enter yearly interest rate (Ex: 9.45): ");
		double yearlyInterestRate = input.nextDouble();
		System.out.print("Enter monthly time periods (Ex: 8): ");
		double period = input.nextInt();

		// Calculate total interest and balance
		double monthlyInterestRate = yearlyInterestRate / 12.0;
		double totalInterest = (balance * Math.pow(1 + monthlyInterestRate / 100.0, period)) - balance;
		double finalBalance = balance + totalInterest;

		// Print the results
		System.out.println();
		System.out.println("Initial balance " + balance);
		System.out.println("Montly interest rate: " + (int) (monthlyInterestRate * 100) / 100.0);
		System.out.println("Total compound interest: " + (int) (totalInterest * 100) / 100.0);
		System.out.println("Final balance: " + (int) (finalBalance * 100) / 100.0);
		input.close();
	}
}
