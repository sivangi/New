package diyAgain;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number");

		int num = scan.nextInt();
		scan.close();

		ReverseNumber numba = new ReverseNumber();

		numba.reverseNum(num);

	}

	public int reverseNum(int n) {

		int reverse = 0;

		while (n != 0) {
			reverse = reverse * 10;

			reverse = reverse + n % 10;

			n = n / 10;

		}
		{
			System.out.println("The reversed number is " + reverse);

		}

		return reverse;

	}
}
