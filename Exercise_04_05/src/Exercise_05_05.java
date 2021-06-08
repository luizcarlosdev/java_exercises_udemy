import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// Ler dados da peça 01
		int codigo01 = sc.nextInt();
		int qtd01 = sc.nextInt();
		double valor01 = sc.nextDouble();
		
		// Ler dados da peça 02
		int codigo02 = sc.nextInt();
		int qtd02 = sc.nextInt();
		double valor02 = sc.nextDouble();
		
		double valorTotal = (qtd01 * valor01) + (qtd02 * valor02);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		sc.close();

	}

}
