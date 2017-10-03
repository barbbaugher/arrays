package arrays;

import java.util.Scanner;

public class FourPeers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your classmate's name: ");
		String peerOne = input.next();

		System.out.println("Enter another classmate's name: ");
		String peerTwo = input.next();

		System.out.println("Enter a third classmate's name: ");
		String peerThree = input.next();

		System.out.println("Enter a fourth classmate's name: ");
		String peerFour = input.next();

		char[] letterPeerOne = peerOne.toCharArray();
		char[] letterPeerTwo = peerTwo.toCharArray();
		char[] letterPeerThree = peerThree.toCharArray();
		char[] letterPeerFour = peerFour.toCharArray();

		System.out.println("The first letter of " + peerOne + "'s name is " + letterPeerOne[0]);
		System.out.println("The first letter of " + peerTwo + "'s name is " + letterPeerTwo[0]);
		System.out.println("The first letter of " + peerThree + "'s name is " + letterPeerThree[0]);
		System.out.println("The first letter of " + peerFour + "'s name is " + letterPeerFour[0]);

		input.close();

	}

}
