package diy;

public class AreTwoArraysEqual {

	public static void checkArrays() {

		int[] array1 = { 1, 2, 3, 4, 5, 6 };

		int[] array2 = { 3, 5, 6, 8, 9, 9, 0 };

		if (array1.length == array2.length) {

			for (int i = 0; i < array1.length; i++) {

				if (array1[i] != array2[i]) {

					System.out.println("Two Arrays are equal");
				}
			}
		} else {

			System.out.println("Two Arrays are not equal");
		}
	}

	public static void main(String[] args) {

		AreTwoArraysEqual.checkArrays();
	}

}
