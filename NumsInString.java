package diyAgain;

import java.util.Scanner;

public class NumsInString {

	public String addNums(String s) {

		int count = 1;
		String[] str = s.split(" ");

		for (String num:str){

			System.out.print(num+ count++ + " ");

		}
		return s;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string :");

		String s = scan.nextLine();

		scan.close();

		NumsInString num = new NumsInString();

		num.addNums(s);

	}

}
