package diy;

import java.util.HashMap;
import java.util.Map.Entry;

public class AlphabetCounter {

	public static void main(String[] args) {

		HashMap<Character, Integer> count = new HashMap<Character, Integer>();

		String str = "Mississippi";

		for (int i = 0; i < str.length(); i++) {

			if (count.containsKey(str.charAt(i))) {

				count.put(str.charAt(i), count.get(str.charAt(i) + 1));
			} else {
				count.put(str.charAt(i), 1);

			}

			for (Entry<Character, Integer> enter : count.entrySet())
				System.out.println(enter.getKey() + ":" + enter.getValue());

		}
	}
}
