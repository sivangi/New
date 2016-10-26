package diy;

import java.util.ArrayList;

public class ListsOfList {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("One");
		arr.add("Two");
		arr.add("Three");
		arr.add("Four");
		arr.add("Five");
		arr.add("Six");
		arr.add("Seven");
		arr.add("Eight");
		arr.add("Nine");
		arr.add("Ten");

		ArrayList<ArrayList<String>> listoflist = new ArrayList<ArrayList<String>>();
		listoflist.add(arr);

		for (ArrayList<String> s : listoflist) {

			System.out.println(s);
		}

	}

}
