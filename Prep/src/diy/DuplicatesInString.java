package diy;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

		Set<String> duplicate = new HashSet<>();

		for (String name : names) {
			if (duplicate.add(name) == false) {
				System.out.println("The duplicate in the string is : " + name);
			}
		}

	}

}
