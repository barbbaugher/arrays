package arrays;

import java.util.Scanner;

public class AWordAndALetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String word = input.next();

		System.out.println("Enter a letter: ");
		String letter = input.next();

		if (word.contains(letter)) {
			System.out.println("Yep, it’s got one of those.");
		} else {
			System.out.println("So, sorry.");
		}

		input.close();

	}

}
