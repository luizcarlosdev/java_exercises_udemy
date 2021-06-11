import java.util.Scanner;

public class Exercise_06_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 2002;
		
		int guess = sc.nextInt();
		
		while (guess != password) {
			System.out.println("Senha Invalida");
			guess = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
