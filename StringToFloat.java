package diy;

public class StringToFloat {

	public static void main(String[] args) {

		Float fObj1 = new Float("100.564");
		System.out.println(fObj1);

		String str1 = "100.476";
		Float fObj2 = Float.valueOf(str1);
		System.out.println(fObj2);

		String str2 = "76.39";
		float f = Float.parseFloat(str2);
		System.out.println(f);

	}
}
