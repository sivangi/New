package diy;

public class CountSpace {

	public static void main(String[] args) {

		String s = "This is a string,it is an example to count spaces between them";
		CountSpace.spaceInString(s);
	}

	public static void spaceInString(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ')
				count++;

		}
		System.out.println(count);

	}
}
