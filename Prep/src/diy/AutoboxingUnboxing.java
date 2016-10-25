package diy;

public class AutoboxingUnboxing {

	public static void autoUnBox() {

		Integer auto = 100;

		int i = auto;

		System.out.println(i + " " + auto);

		Character box = 'a';

		char ch = box;

		System.out.println(ch + " " + box);

	}

	public static void main(String[] args) {

		AutoboxingUnboxing.autoUnBox();
	}

}
