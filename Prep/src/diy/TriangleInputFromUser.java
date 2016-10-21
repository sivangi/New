package diy;

import java.util.Scanner;

public class TriangleInputFromUser {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int opp;
		int hyp;
		int adj;

		System.out.println("Enter the sides");

		System.out.println("Hypotenuse: ");
		hyp = input.nextInt();

		System.out.println("Opposite side :");
		opp = input.nextInt();

		System.out.println("Adjacent side:");
		adj = input.nextInt();

		if ((opp == adj) && (adj == hyp)) {

			System.out.println("Its an Equilateral triangle");

		}

		else if ((opp == adj) || (opp == hyp)) {
			System.out.println("Its an Isoceles triangle");
		}

		else if ((opp != adj) & (adj != hyp)) {

			System.out.println("Its a Scalene triangle");
		}

	}

}
