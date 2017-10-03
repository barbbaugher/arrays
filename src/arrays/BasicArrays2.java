package arrays;

public class BasicArrays2 {

	public static void main(String[] args) {
		int[] ten = new int[10];
		
		for (int idx = 0; idx < ten.length; idx++) {
			int randomNum = (int) (Math.random()*(100 - 1) + 1);
			System.out.println("Slot " + idx + " contains a " + randomNum);
		}
	}
}
