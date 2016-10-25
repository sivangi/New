package diy;

import java.util.Scanner;

public class MultiplicationTable {

	public static void multiTable() {

		int n;

		System.out.println("Enter an integer to print its multiplication table ");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		System.out.println("Multiplication table of " + n + "is  :");

		for (int i = 1; i <= 10; i++) {

			System.out.println(n + "*" + i + "=" + (n * i));

		}
	}

	public static void main(String[] args) {

		MultiplicationTable.multiTable();

	}
}
