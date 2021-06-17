package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		Student[] rooms = new Student[n];
		
		System.out.print("How many rooms will be rented? ");
		int rent = sc.nextInt();
		
		for (int i = 0; i < rent; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rooms[room-1] = new Student(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		/*for (int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.printf("%d: %s, %s%n", i+1, rooms[i].getName(), rooms[i].getEmail());
			}
		}*/
		
		for (Student student : rooms) {
			if(student != null) {
				System.out.printf("%d: %s, %s%n", student.getRoom(), student.getName(), student.getEmail());
			}
		}
		
		sc.close();
	}

}
