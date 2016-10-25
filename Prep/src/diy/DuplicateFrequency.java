package diy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFrequency {

	public static void main(String[] args) {

		String text = "this is a string it is a long string it might have duplicates this string can be fixed";

		List<String> list = Arrays.asList(text.split(" "));

		Set<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(list, word));
		}
	}

}
