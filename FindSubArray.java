package morePrograms;

public class FindSubArray {

	public static void main(String[] args) {

		FindSubArray.checkArrays(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4 });

	}

	static boolean checkArrays(int[] a, int[] b) {

		int index = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == b[0]) {

				for (int j = index; j < b.length; j++) {

					if (a[i] == b[j]) {

						count++;
						if (count == 1) {
							index = i;

						}

						if (count == b.length) {

						}
					}

				}

				System.out.println("The array contains the sub array at index " + index);
			}

		}
		return true;

	}
}
