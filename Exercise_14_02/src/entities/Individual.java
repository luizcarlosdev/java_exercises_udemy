package entities;

public class Individual extends TaxPayer {

	private double healthCosts;
	
	public Individual(String name, double yearIncome, double healthCosts) {
		super(name, yearIncome);
		this.healthCosts = healthCosts;
	}
	
	public double getHealthCosts() {
		return healthCosts;
	}
	
	public void setHealthCosts(double healthCosts) {
		this.healthCosts = healthCosts;
	}

	@Override
	public double taxCalculator() {
		double tax = 0.0;
		if (yearIncome < 20000) {
			tax = yearIncome * 0.15;
		} else {
			tax = yearIncome * 0.25;
		}
		
		if (healthCosts > 0.0) {
			tax -= healthCosts * 0.5;
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
