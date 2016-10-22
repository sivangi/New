package diy;

public class SpaceToString {

	public static void spaceToString() {

		String str = "Computer";

		StringBuilder result = new StringBuilder();

		{
			for (int i = 0; i < str.length(); i++) {

				if (i > 0) {

					result.append(" ");
				}

				result.append(str.charAt(i));
			}

			System.out.println(result.toString());
		}
	}

	public static void main(String[] args) {

		SpaceToString.spaceToString();
	}
}
