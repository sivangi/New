package diy;

public class LengthOfAString {

	public static void lengthOfAString() {

		String str = "This is a string";

		int counter = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetter(str.charAt(i)))
				counter++;

		}

		System.out.println("The length of the string is " + counter + " letters");

	}

	public static void main(String[] args) {

		LengthOfAString.lengthOfAString();
	}

}
