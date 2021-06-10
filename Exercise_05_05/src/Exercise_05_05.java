import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int item = sc.nextInt();
		int qtd = sc.nextInt();
		
		if(item == 1) {
			System.out.printf("Total: R$ %.2f", qtd * 4.0);
		} else if(item == 2) {
			System.out.printf("Total: R$ %.2f", qtd * 4.5);
		} else if(item == 3) {
			System.out.printf("Total: R$ %.2f", qtd * 5.0);
		} else if(item == 4) {
			System.out.printf("Total: R$ %.2f", qtd* 2.0);
		} else if(item == 5) {
			System.out.printf("Total: R$ %.2f", qtd * 1.5);
		} else {
			System.out.println("Entrada inválida!");
		}
		
		sc.close();

	}

}
