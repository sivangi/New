package weeklyCodingTest;

public class LeaderElements {

	public void printLeaders(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			int j;
			for (j = i + 1; j < size; j++) {
				if (arr[i] <= arr[j])
					break;
			}
			if (j == size)
				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		LeaderElements lead = new LeaderElements();
		int arr[] = new int[] { 6, 9, 15, 1, 11, 3, 10 };
		int n = arr.length;
		lead.printLeaders(arr, n);
	}
}
