package diy;

public class PrintPyramid {

	public static void printPyramid() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if (j <= i) {

					System.out.print("*");

				} else
					System.out.print("");

			}

			System.out.println();
		}

	}

	public static void main(String[] args) {

		PrintPyramid.printPyramid();
	}
}
