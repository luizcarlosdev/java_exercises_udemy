package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d", i+1);
			
			System.out.println();
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idToIncrease = sc.nextInt();
		
		Employee employee = employees.stream().filter(e -> e.getId() == idToIncrease).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double increase = sc.nextDouble();
			employee.raiseSalary(increase);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
