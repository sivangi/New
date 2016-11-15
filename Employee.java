package diyAgain;

@SuppressWarnings("serial")
public class Employee implements java.io.Serializable {

	
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	

	public void sendMail() {

		System.out.println("Sending a mail to " + name + " " + address);
	}

}
