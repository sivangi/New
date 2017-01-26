package diyAgain;

import java.util.Scanner;

public class FloydTriangle {

	public int makeTriangle(int size) {

		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}

			System.out.println(" ");
		}

		return size;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size you want");

		int n = scan.nextInt();
		scan.close();

		FloydTriangle fit = new FloydTriangle();

		fit.makeTriangle(n);

	}
}
