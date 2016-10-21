package diy;

public class ExponentOf2 {

	public static void main(String[] args) {

		System.out.println(expOf2(8));
	}

	public static boolean expOf2(int num) {

		while (num > 1) {

			if (num % 2 != 0) {

				return false;
			}

			num = num / 2;

		}

		return true;
	}

}
