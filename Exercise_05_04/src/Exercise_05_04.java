import java.util.Scanner;

public class Exercise_05_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int totalHoras = 0;
		
		if(horaInicial < horaFinal) {
			totalHoras = horaFinal - horaInicial;
		} else if (horaInicial > horaFinal) {
			totalHoras = (24 - horaInicial) + horaFinal;
		} else {
			totalHoras = 24;
		}
		
		System.out.printf("O JOGO DUROU %d HORAS", totalHoras);
		
		sc.close();

	}

}
