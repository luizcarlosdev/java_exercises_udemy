import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// Receber os 3 valores (A, B e C)
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		// Calcular as áreas
		double areaTriangulo = (A * C) / 2;
		double areaCirculo = Math.pow(C, 2) * 3.14159;
		double areaTrapezio = (A + B) * C / 2;
		double areaQuadrado = Math.pow(B, 2);
		double areaRetangulo = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f\n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
		
		sc.close();

	}

}
