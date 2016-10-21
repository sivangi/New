package diy;

import java.util.Scanner;

public class FindAverages {

	public static void main(String[] args) {

		FindAverages.findAverageScores();
	}

	public static void findAverageScores() {

		double scoreA;
		double scoreB;
		double scoreC;
		double average;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("The first score is :");
		scoreA = input.nextDouble();

		System.out.println("The second score is :");
		scoreB = input.nextDouble();

		System.out.println("The third score is :");
		scoreC = input.nextDouble();

		average = ((scoreA + scoreB + scoreC) / 3.0);

		System.out.println("The average score is :" + average);

	}
}
