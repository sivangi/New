package diy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String list = "Peony";

		List<String> original = new ArrayList<String>();

		original.add("Aster");
		original.add("BlueBell");
		original.add("Canna");
		original.add("Daisy");
		original.add("Peony");
		original.add("Vinca");

		System.out.println(original);

		Iterator<String> iter = original.iterator();

		while (iter.hasNext()) {

			if (list.equals(iter.next())) {

				iter.remove();
			}
		}
		System.out.println("After remove: ");
		System.out.println(original);
	}

}
