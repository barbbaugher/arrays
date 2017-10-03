package arrays;

public class LettersInMyName {

	public static void main(String[] args) {
		String name = "Baugher";
		
		char[] letters = name.toCharArray();
		System.out.println("Letters in my name:");
		
		for (int idx = 0; idx < letters.length; idx++) {
			System.out.println(letters[idx]);
		}

	}

}
