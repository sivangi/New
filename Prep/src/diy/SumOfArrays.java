package diy;

public class SumOfArrays {

	public static void sumElements() {

		int[] num = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int sum = 0;

		for (int add : num) {

			sum = add + sum;

			System.out.println("The sum of elements" + sum);
		}
	}

	public static void main(String[] args) {

		SumOfArrays.sumElements();

	}

}
