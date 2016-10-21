package diy;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayListToArray.arrayListToArray();

	}

	public static void arrayListToArray() {

		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("Lion");
		arrlist.add("Tiger");
		arrlist.add("Girrafe");
		arrlist.add("Monkey");
		arrlist.add("Elephant");

		System.out.println(arrlist);

		String[] array = new String[arrlist.size()];

		for (int i = 0; i < arrlist.size(); i++) {

			array[i] = arrlist.get(i);
		}

		for (String animals : array) {

			System.out.println(animals);

		}

	}

}
