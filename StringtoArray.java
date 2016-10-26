package diy;

import java.util.Arrays;
import java.util.List;

public class StringtoArray {

	public static void main(String[] args) {

		String example = "One,Two,Three,Four,Five";

		System.out.println("String example :" + example);

		String[] array = example.split(",");

		List<String> list = Arrays.asList(array);

		System.out.println(list);

	}
}
