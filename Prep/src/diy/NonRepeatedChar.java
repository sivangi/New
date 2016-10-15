package diy;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NonRepeatedChar {

	public static void main(String[] args) {

		String input = "tester is tested";
		System.out.println("The first non repeated character is :  " + findTheChar(input));
	}

	public static Character findTheChar(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
			System.out.println(entry);
		}

		return null;
	}
}
