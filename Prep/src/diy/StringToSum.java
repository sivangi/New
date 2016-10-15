package diy;

public class StringToSum {

	public static void main(String[] args) {

		StringToSum.getSum();
	}

	public static int getSum() {
		String s = "3,8,9,10";

		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {

				sum = sum + Character.getNumericValue(s.charAt(i));
			}
		}

		System.out.println(sum);
		return sum;
	}
}
