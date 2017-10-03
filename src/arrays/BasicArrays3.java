package arrays;

public class BasicArrays3 {

	public static void main(String[] args) {
		int[] oneThousand = new int[1000];

		for (int idx = 0; idx < oneThousand.length; idx++) {
			int randomNum = (int) (Math.random() * (99 - 10) + 10);
			System.out.print(randomNum + "  ");
		}
	}
}
