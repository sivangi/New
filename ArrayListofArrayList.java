package diy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListofArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		// Addition of elements in ArrayList
		al.add("Cat");
		al.add("Dog");
		al.add("Text");
		al.add("Book");
		al.add("Plate");
		al.add("Steel");

		System.out.println("Original ArrayList Content: " + al);

		List<List<String>> outer = new ArrayList<List<String>>();
		List<String> inner1 = new ArrayList<String>();
		List<String> inner2 = new ArrayList<String>();
		List<String> inner3 = new ArrayList<String>();

		inner1.add("cat");
		inner1.add("dog");

		inner2.add("text");
		inner2.add("book");

		inner3.add("plate");
		inner3.add("steel");

		outer.add(inner1);
		outer.add(inner2);
		outer.add(inner3);

      Collections.sort(al);
		
		
		System.out.println(outer);
	}

}
