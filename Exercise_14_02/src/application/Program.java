package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> payers = new ArrayList<>();
		double totalTaxes = 0.0;
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i +1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char opt = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double yearIncome = sc.nextDouble();
			
			if(opt == 'i') {
				System.out.print("Health expenditures: ");
				double healthCosts = sc.nextDouble();
				payers.add(new Individual(name, yearIncome, healthCosts));
			} else {
				System.out.print("Number of employees: ");
				int employeesQuantity = sc.nextInt();
				payers.add(new Company(name, yearIncome, employeesQuantity));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer payer : payers) {
			System.out.println(payer);
			totalTaxes += payer.taxCalculator();
		}
		
		System.out.println();
		System.out.println(String.format("TOTAL TAXES: $ %.2f", totalTaxes));
		
		sc.close();
	}

}
