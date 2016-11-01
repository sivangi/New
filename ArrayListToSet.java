package diy;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToSet {

	public static void main(String[] args) {

		ArrayList<String> language = new ArrayList<String>();

		language.add("Java");
		language.add("Ruby");
		language.add("Javascript");
		language.add("Python");
		language.add("C++");
		language.add("Angular");
		language.add("Java");

		System.out.println("Languages before converting to set " + language.size());

		System.out.println(language);

		HashSet<String> langSet = new HashSet<String>(language);

		System.out.println("Languages after converting to set " + langSet.size());

		System.out.println(langSet);

	}

}
