package weeklyCodingTest;

import java.util.Scanner;

public class PerfectNumber {

	public int findPerfect(int number) {

		int sum = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {

				sum = sum + i;
			}
		}
		if (sum == number) {

			System.out.println(number + " this is a perfect number");

		} else {
			System.out.println(number + " this number is not perfect");
		}
		return sum;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number ");
		int number = scan.nextInt();

		scan.close();

		PerfectNumber perf = new PerfectNumber();
		perf.findPerfect(number);
	}
}
