package diy;

public class FindSecondLargest {

	public static void main(String[] args) {

		int num[] = { 1, 23, 47, 81, 92, 88, 52, 48 };

		secondLargeNumber(num);
	}

	private static void secondLargeNumber(int[] num) {
		
		int largest = num[0];
		int secondLargest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];

			} else if (num[i] > secondLargest) {
				secondLargest = num[i];

			}
		}
		System.out.println("second largest in array is:" + secondLargest);

	}

}
