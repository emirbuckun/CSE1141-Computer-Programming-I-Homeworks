/* This program draws the coordinate system and some geometric
 * shapes that are line, parabola and circle on the console screen.
 * I used x and y values in the coordinate system that range in [-10,10].
 * 
 * Student Name - Student ID: Emir BÜÇKÜN - 150119024 */

package hw3;

import java.util.Scanner;

public class HW3_150119024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get user's choice
		System.out.println("Which shape would you like to draw?");
		System.out.println(" 1. Line");
		System.out.println(" 2. Parabola");
		System.out.println(" 3. Circle");
		System.out.println(" 4. Exit");
		int choice = input.nextInt();
		System.out.println();

		int a, b, c;
		if (choice == 1) { // Draw a line
			System.out.println("Line formula is y = ax + b");
			System.out.print("Please enter coefficients a and b:");
			a = input.nextInt();
			b = input.nextInt();
			
			for (int y = 11; y > -11; y--) {
				if (y != 11)
					System.out.println();
				for (int x = -10; x < 11; x++) {

					if ((x * a) + b == y) { // Print '*' for points on the line
						System.out.print("*");
					} else { // Draw the coordinate system
						
						if (y == 11) { // Write just 'y' at the middle of the first row
							if (x != 0)
								System.out.print(" ");
							if (x == 0)
								System.out.print("y");
						}

						if (y != 11 && y != 0) { // Draw '|' for each row at the middle
							if (x != 0)
								System.out.print(" ");
							if (x == 0)
								System.out.print("|");
						}

						if (y == 0) { // Draw x-axis
							if (x != 0)
								System.out.print("-");
							if (x == 0)
								System.out.print("|");
							if (x == 10)
								System.out.print("x");
						}
					}
				}
			}
		}

		else if (choice == 2) { // Draw a parabola
			System.out.println("Parabola formula is y = ax^2 + bx + c");
			System.out.print("Please enter coefficients a, b and c:");
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();

			for (int y = 11; y > -11; y--) {
				if (y != 11)
					System.out.println();
				for (int x = -10; x < 11; x++) { // Draw coordinate system

					if ((x * x * a) + (b * x) + c == y) { // Print '*' for points on the parabola
						System.out.print("*");
					} else { // Draw the coordinate system
						
						if (y == 11) { // Write just 'y' at the middle of the first row
							if (x != 0)
								System.out.print(" ");
							if (x == 0)
								System.out.print("y");
						}

						if (y != 11 && y != 0) { // Draw '|' for each row at middle
							if (x != 0)
								System.out.print(" ");
							if (x == 0)
								System.out.print("|");
						}

						if (y == 0) { // Draw x-axis
							if (x != 0)
								System.out.print("-");
							if (x == 0)
								System.out.print("|");
							if (x == 10)
								System.out.print("x");
						}
					}
				}
			}
		}

		else if (choice == 3) { // Draw a circle
			System.out.println("Circle formula is (x-a)^2 + (y-b)^2 = r^2");
			System.out.print("Please enter center's coordinates (a,b) and radius:");
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();

			for (int y = 11; y > -11; y--) {
				if (y != 11)
					System.out.println();
				for (int x = -10; x < 11; x++) { // Draw coordinate system

					if (((x-a) * (x-a)) + ((y-b) * (y-b)) == (c * c)) { // Print '*' for point on the circle
						System.out.print("*");
					} else { // Draw the coordinate system
						
						if (y == 11) { // Write just 'y' at the middle of the first row
							if (x != 0)
								System.out.print(" ");
							if (x == 0)
								System.out.print("y");
						}

						if (y != 11 && y != 0) { // Draw '|' for each row at middle
							if (x != 0)
								System.out.print(" ");
							if (x == 0)
								System.out.print("|");
						}

						if (y == 0) { // Draw x-axis
							if (x != 0)
								System.out.print("-");
							if (x == 0)
								System.out.print("|");
							if (x == 10)
								System.out.print("x");
						}
					}
				}
			}
		}
		
		input.close();
	}
}