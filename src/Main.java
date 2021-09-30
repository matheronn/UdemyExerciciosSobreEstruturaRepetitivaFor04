import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double x = 0;
		double y = 0;
		double r = 0;

		for (int i = 0; i < n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();

			if (y == 0) {
				System.out.println("divisão impossivel");
			} else {
				r = x / y;
				System.out.printf("%.1f%n", r);
			}
		}
		sc.close();
	}
}
