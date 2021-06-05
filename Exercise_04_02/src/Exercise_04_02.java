import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double raio = scanner.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f", area);
		
		scanner.close();

	}

}
