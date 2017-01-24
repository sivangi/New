package diyAgain;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter the size of the Pyramid you want :");

		int size = scnr.nextInt();

		NumberPattern.printNumbers(size);

		System.out.println("Enter the length");
		int length = scnr.nextInt();

		NumberPattern.upsideDown(length);

		scnr.close();
	}

	public static int printNumbers(int size) {

		for (int i = 0; i <= size; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i);
			}
			System.out.println();
		}
		return size;
	}

	public static int upsideDown(int length) {

		for (int i = length; i >= 1; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print(i);
			}

			System.out.println();

		}

		return length;

	}

}
