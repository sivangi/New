package diy;

import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {

		String[] arr = { "One", "Two", "Three", "Four", "Five" };
		String[] arrs = { "Five", "Six", "Seven", "Eight", "Nine", "Ten" };

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arrs.length; j++) {

				if (arr[i] == arrs[j]) {

					set.add(arr[i]);
				}
			}
		}

		System.out.println(set);
	}
}
