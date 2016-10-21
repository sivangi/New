package diy;

public class LinearSearch {

	public static int linearSearch(int arr[], int key) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {

				return i;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] array = { 3, 45, 67, 89, 23, 40, 0 };

		int searchKey = 45;

		System.out.println("Key "  +searchKey+ " found at index "   +  linearSearch(array, searchKey));
	}

}
