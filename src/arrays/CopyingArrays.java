package arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		int[] firstArray = new int[10];
		int[] secondArray = new int[10];
		
		firstArray[0] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[1] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[2] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[3] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[4] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[5] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[6] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[7] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[8] = (int) (Math.random() * (100 - 1) + 1);
		firstArray[9] = -7;

		System.out.print("Array 1: ");

		for (int idxFirstArray = 0; idxFirstArray < firstArray.length; idxFirstArray++) {
			System.out.print(firstArray[idxFirstArray] + "  ");
		}

		System.out.print("\nArray 2: ");
		
		secondArray[0] = firstArray[0];
		secondArray[1] = firstArray[1];
		secondArray[2] = firstArray[2];
		secondArray[3] = firstArray[3];
		secondArray[4] = firstArray[4];
		secondArray[5] = firstArray[5];
		secondArray[6] = firstArray[6];
		secondArray[7] = firstArray[7];
		secondArray[8] = firstArray[8];
		secondArray[9] = (int) (Math.random() * (100 - 1) + 1);

		for (int idxSecondArray = 0; idxSecondArray < secondArray.length; idxSecondArray++) {
			System.out.print( secondArray[idxSecondArray] + "  ");
		}
	}
}
