package diy;

public class PingPong {

	public static void main(String[] args) {

		PingPong.pingPong();

	}

	public static boolean pingPong() {

		int num = 0;

		for (int i = 0; i < 50; i++) {

			if (num % 3 == 0) {

				System.out.println("Ping");

				if (num % 5 == 0) {

					System.out.println("Pong");

				}

				if ((num % 3 != 0) && (num % 5 != 0)) {

					System.out.println("PingPong");

				}

			}

		}
		return false;
	}
}
