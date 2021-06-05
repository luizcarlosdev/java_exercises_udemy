import java.util.Scanner;

public class Exercise_04_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num01 = scanner.nextInt();
		int num02 = scanner.nextInt();
		
		System.out.printf("SOMA = %d", num01 + num02);
		
		scanner.close();

	}

}
