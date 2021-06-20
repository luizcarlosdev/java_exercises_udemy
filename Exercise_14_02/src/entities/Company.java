package entities;

public class Company extends TaxPayer {
	
	private int employeesQuantity;
	
	public Company(String name, double yearIncome, int employeesQuantity) {
		super(name, yearIncome);
		this.employeesQuantity = employeesQuantity;
	}
	
	public int getEmployeesQuantity() {
		return employeesQuantity;
	}
	
	public void setEmployeesQuantity(int employeesQuantity) {
		this.employeesQuantity = employeesQuantity;
	}
	
	@Override
	public double taxCalculator() {
		double tax = 0.0;
		if (employeesQuantity > 10) {
			tax = yearIncome * 0.14;
		} else {
			tax = yearIncome * 0.16;
		}
		return tax;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(": $ ");
		sb.append(String.format("%.2f", taxCalculator()));
		
		return sb.toString();
	}
}
