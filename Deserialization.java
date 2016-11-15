package diyAgain;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {

		Employee e = null;
		try {

			FileInputStream fin = new FileInputStream("C:/Users/Shivangi/Desktop/questions.txt");

			ObjectInputStream in = new ObjectInputStream(fin);

			e = (Employee) in.readObject();

			in.close();
			fin.close();

		} catch (Exception exp) {
			System.out.println("Employee class not found");
			exp.printStackTrace();
			return;

		}

		System.out.println("Deserialized employee :");
		System.out.println("Name " + e.name);
		System.out.println("Address " + e.address);
		System.out.println("SSN " + e.SSN);
		System.out.println("Employee number " + e.number);

	}

}
