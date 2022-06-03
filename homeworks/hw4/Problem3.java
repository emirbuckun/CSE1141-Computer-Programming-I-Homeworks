/* This program takes an input letter and outputs it in a diamond shape.
 *  
 * Student Name - No: Emir Büçkün - 150119024 */

package hw4;

import java.util.Scanner;

public class Pro3_150119024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get the letter
		System.out.print("Enter a Letter: ");
		String letter = input.nextLine();
		input.close();

		// Check the input of length is 1 and alphabetic
		if (letter.length() != 1 || !Character.isAlphabetic(letter.charAt(0))) {
			System.out.println("Invalid Input !");
			System.exit(1);
		}

		char[][] diamond = constructDiamond(Character.toUpperCase(letter.charAt(0)));

		printDiamond(diamond);
	}

	public static char[][] constructDiamond(char letter) {
		int max = 2 * (letter - 'A') + 1;
		char[][] diamond = new char[max][max];
		int mid = max / 2;

		for (int i = 0, k = max - 1; i < max; i++, k--) {
			for (int j = 0; j < max; j++) {
				if (i - mid <= 0)
					diamond[i][j] = (mid - i == j || mid + i == j) ? (char) ('A' + i) : '.';
				else
					diamond[i][j] = (mid - k == j || mid + k == j) ? (char) ('A' + k) : '.';
			}
		}

		return diamond;
	}

	// Print diamond
	public static void printDiamond(char[][] diamond) {
		for (int i = 0; i < diamond.length; i++) {
			for (int j = 0; j < diamond.length; j++) {
				System.out.print(diamond[i][j]);
			}
			System.out.println();
		}
	}
}
