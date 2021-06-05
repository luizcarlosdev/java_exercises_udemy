import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int hours = scanner.nextInt();
		double value = scanner.nextDouble();
		
		double salary = hours * value;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", num, salary);
		
		scanner.close();

	}

}
