/* This program  converts the date, which is given in days, to 
 * “Year: <years>, Mount: <mounts>, Day: <days>” format.
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw1;

import java.util.Scanner;

public class Pro1_150119024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get number of day from user and calculate years, months and remaining days
		System.out.print("Number of days: ");
		int days = input.nextInt();
		int year = days / 365;
		int month = (days % 365) / 31;
		int remainingDay = (days % 365) % 31;
		
		// Print the results
		System.out.println("Year: " + year + ", " + "Month: " + month + ", " + "Day: " + remainingDay);
		input.close();
	}
}
