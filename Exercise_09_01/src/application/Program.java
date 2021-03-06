package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDepositValue);
		} else {
			account = new Account(accountNumber, accountHolder);
		}
		
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
