package diyAgain;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Man Smith";
		e.address = "375 Trimble Way";

		e.SSN = 5555;
		e.number = 101;

		try {

			FileOutputStream fos = new FileOutputStream("C:/Users/Shivangi/Desktop/questions.txt");

			ObjectOutputStream out = new ObjectOutputStream(fos);

			out.writeObject(e);
			fos.close();

			System.out.println("Serialised data is saved in document");

		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}

}
