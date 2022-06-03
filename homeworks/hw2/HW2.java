/* This program calculates personal income tax based on 
 * the tax rates reported by The Turkish Revenue Administration.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw2;

import java.util.Scanner;

public class HW2_150119024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get the year and the income
		int year = input.nextInt();
		double income = input.nextDouble();
		
		// Check the year is defined or not
		if (year > 2020 || year < 2017) {
			System.out.print("Undefined year value!");
			System.exit(1);
		}

		// Check the income is bigger than zero or not
		if (income <= 0) {
			System.out.print("Income must be > 0!");
			System.exit(2);
		}
		
		// Compute tax
		double tax = 0;
		
		if (year == 2020) { // Compute tax for 2020
			
			if (income < 22000)
				tax = income * 0.15;
			else if (income < 49000)
				tax = 22000 * 0.15 + (income - 22000) * 0.20;
			else if (income < 180000)
				tax = 22000 * 0.15 + (49000 - 22000) * 0.20 + (income - 49000) * 0.27;
			else if (income < 600000)
				tax = 22000 * 0.15 + (49000 - 22000) * 0.20 + (180000 - 49000) * 0.27
				+ (income - 180000) * 0.35;
			else
				tax = 22000 * 0.15 + (49000 - 22000) * 0.20 + (180000 - 49000) * 0.27
				+ (600000 - 180000) * 0.35 + (income - 600000) * 0.40;			
			
		} else if (year == 2019) { // Compute tax for 2019
			
			if (income < 18000)
				tax = income * 0.15;
			else if (income < 40000)
				tax = 18000 * 0.15 + (income - 18000) * 0.20;
			else if (income < 148000)
				tax = 18000 * 0.15 + (40000 - 18000) * 0.20 + (income - 40000) * 0.27;
			else if (income < 500000)
				tax = 18000 * 0.15 + (40000 - 18000) * 0.20 + (148000 - 40000) * 0.27
				+ (income - 148000) * 0.35;
			else
				tax = 18000 * 0.15 + (40000 - 18000) * 0.20 + (148000 - 40000) * 0.27
				+ (500000 - 148000) * 0.35 + (income - 500000) * 0.40;
			
		} else if (year == 2018) { // Compute tax for 2018

			if (income < 14800)
				tax = income * 0.15;
			else if (income < 34000)
				tax = 14800 * 0.15 + (income - 14800) * 0.20;
			else if (income < 120000)
				tax = 14800 * 0.15 + (34000 - 14800) * 0.20 + (income - 34000) * 0.27;
			else
				tax = 14800 * 0.15 + (34000 - 14800) * 0.20 + (120000 - 34000) * 0.27
				+ (income - 120000) * 0.35;
			
		} else if (year == 2017) { // Compute tax for 2017

			if (income < 13000)
				tax = income * 0.15;
			else if (income < 30000)
				tax = 13000 * 0.15 + (income - 13000) * 0.20;
			else if (income < 110000)
				tax = 13000 * 0.15 + (30000 - 13000) * 0.20 + (income - 30000) * 0.27;
			else
				tax = 13000 * 0.15 + (30000 - 13000) * 0.20 + (110000 - 30000) * 0.27
				+ (income - 110000) * 0.35;
			
		}		
		
		// Print the results
		System.out.println("Income: " + (int) (income * 100) / 100.0);
		System.out.println("Tax amount: " + (int) (tax * 100) / 100.0);
		System.out.println("Income after tax: " + (int) ((income - tax) * 100) / 100.0);
		System.out.println("Real tax rate: " + (int) (((tax / income) * 100) * 100) / 100.0 + "%");

		input.close();
	}
}
