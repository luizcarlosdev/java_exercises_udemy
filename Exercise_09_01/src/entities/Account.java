package entities;

public class Account {
	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double value) {
		accountBalance += value;
	}
	
	public void withdraw(double value) {
		accountBalance -= (value + 5);
	}
	
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", accountNumber, accountHolder, accountBalance);
	}
}
