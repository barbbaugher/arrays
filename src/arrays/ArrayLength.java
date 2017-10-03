package arrays;

public class ArrayLength {

	public static void main(String[] args) {
		int[] cupValues = new int[5];
		int numberOfCups = cupValues.length;
		System.out.println(numberOfCups); // prints "5"

		cupValues = new int[2];
		System.out.println(cupValues.length); // prints "2"
		
		for (int idx = 0; idx < cupValues.length; idx++) {
			System.out.println("Value at index" + idx + " is " + cupValues[idx]);
		}

	}

}
