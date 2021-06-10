import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0) {
			if (y == 0) {
				System.out.println(("Origem"));
			} else {
				System.out.println("Eixo X");
			}
		} else if (y == 0) {
			System.out.println("Eixo Y");
		} else if (x > 0) {
			if (y < 0) {
				System.out.println(("Q4"));
			} else {
				System.out.println("Q1");
			}
		} else {
			if (y < 0) {
				System.out.println("Q3");
			} else {
				System.out.println("Q2");
			}
		}
		
		sc.close();

	}

}
