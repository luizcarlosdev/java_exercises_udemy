import java.util.Scanner;

public class Exercise_06_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			
			if(num2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(num1 / num2);
			}
		}
		
		sc.close();

	}

}
