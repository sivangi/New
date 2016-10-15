package diy;

public class AlphaNumericString {

	public static void main(String[] args) {

		String s = "hello7hi89ko";

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))) {

				sum = sum + Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
