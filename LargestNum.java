package diy;

public class LargestNum {

	public static void main(String[] args) {

		int[] num = new int[] { 30, 15, 20, 33, 5, 90, 92 };

		int largest = num[0];

		for (int i = 0; i < num.length; i++) {

			if (num[i] > largest)
				largest = num[i];
		}

		System.out.println(largest);
	}
}
