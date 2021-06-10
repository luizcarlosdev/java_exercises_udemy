import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0.00;
		
		if (salario < 0.00) {
			System.out.println("ERRO!");
		} else if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
		} else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + (1000 * 0.08);
		} else {
			imposto = (salario - 4500.00) * 0.28 + (1000 * 0.08) + (1500 * 0.18);
		}
		
		if (imposto > 0) {
			System.out.printf("R$ %.2f", imposto);
		}
		
		sc.close();

	}

}
