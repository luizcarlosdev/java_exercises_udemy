package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double initialDepositValue = 0.0;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		String initialDeposit = sc.nextLine();
		
		if (initialDeposit.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			initialDepositValue = sc.nextDouble();
		}
		
		Account account = new Account(accountNumber, accountHolder, initialDepositValue);
		
		System.out.println("\nAccount data:");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
