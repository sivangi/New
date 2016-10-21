package diy;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElementsInArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Aster");
		al.add("BlueBell");
		al.add("EnglishDaisy");
		al.add("Dahlia");
		al.add("Carnation");

		System.out.println("Before swapping,the ArrayList is" + al);

		Collections.swap(al, 2, 4);

		for (String s : al) {
			System.out.println("After swapping,the ArrayList is " + s);
		}

	}
}
