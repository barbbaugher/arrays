package arrays;

public class Delimiter {

	public static void main(String[] args) {
		String source = "apple, banana, coconut, dragon fruit";
		String[] elements = source.split(", ");

		System.out.println(elements[0]); // prints "apple"
		System.out.println(elements[1]); // prints "banana"
		System.out.println(elements[2]); // prints "coconut"
		System.out.println(elements[3]); // prints "dragon fruit"

	}

}
