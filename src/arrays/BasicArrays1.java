package arrays;

public class BasicArrays1 {

	public static void main(String[] args) {
		String[] oneHundredThirteen = { "-113", "-113", "-113", "-113", "-113", "-113", "-113", "-113", "-113",
				"-113" };

		for (int idx = 0; idx < oneHundredThirteen.length; idx++) {
			System.out.println("Slot " + idx + " contains a " + oneHundredThirteen[idx]);
		}
	}
}
