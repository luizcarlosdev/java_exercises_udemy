import java.util.Scanner;

public class Exercise_06_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = n;
		
		if (n == 0) {
			fatorial = 1;
		} else {
			for (int i = n - 1; i > 0; i--) {
				fatorial *= i;
			}
		}
		
		System.out.println(fatorial);
		
		sc.close();

	}

}
