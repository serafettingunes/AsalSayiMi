import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		for (;;) {
			asalMiMethod();
		}

	}

	public static void asalMiMethod() {

		Scanner in = new Scanner(System.in);
		System.out.print("Bir say� giriniz: ");
		boolean asalMi = false;

		int x = in.nextInt();
		if (x == 2) {
			asalMi = true;

		}

		for (int i = 2; i < x; i++) {

			if (x % i == 0) {
				asalMi = false;
				break;
			} else {
				asalMi = true;

			}

		}

		if (asalMi) {
			System.out.println(x + " Say�s� Asal Say�d�r");
		} else {
			System.out.println(x + " Say�s� Asal De�ildir!!!");
		}
	}
}
