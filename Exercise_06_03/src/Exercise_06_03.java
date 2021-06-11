import java.util.Scanner;

public class Exercise_06_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int option = 0;
		
		while (option != 4) {
			option = sc.nextInt();
			
			switch(option) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
			}
		}
		
		sc.close();

	}

}
