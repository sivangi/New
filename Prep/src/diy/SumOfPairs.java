package diy;

public class SumOfPairs {

	static void findThePairs(int inputArr[], int inputNumber) {
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

		for (int i = 0; i < inputArr.length; i++) {
			for (int j = i + 1; j < inputArr.length; j++) {
				if (inputArr[i] + inputArr[j] == inputNumber) {
					System.out.println(inputArr[i] + " + " + inputArr[j] + " = " + inputNumber);
				}
			}
		}
	}

	public static void main(String[] args) {
		findThePairs(new int[] { 5, 6, 7, 4, 9 }, 13);
	}
}