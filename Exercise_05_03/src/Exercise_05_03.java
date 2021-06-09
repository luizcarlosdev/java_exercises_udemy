import java.util.Scanner;

public class Exercise_05_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if((A > B && A % B == 0) || (B > A && B % A == 0)){
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}
		
		sc.close();

	}

}
