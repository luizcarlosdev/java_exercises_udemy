import java.util.Scanner;

public class Exercise_06_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtd = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < qtd; i++) {
			int num = sc.nextInt();
			
			if(num >= 10 && num <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
