package diy;

public class FloatToNumPrimitive {

	public static void main(String[] args) {

		Float flo = new Float("10.50");

		byte b = flo.byteValue();
		System.out.println(b);

		short s = flo.shortValue();
		System.out.println(s);

		int i = flo.intValue();
		System.out.println(i);

		float f = flo.floatValue();
		System.out.println(f);

		double d = flo.doubleValue();
		System.out.println(d);

	}
}
