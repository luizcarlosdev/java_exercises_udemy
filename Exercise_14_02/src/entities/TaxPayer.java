package entities;

public abstract class TaxPayer {
	
	protected String name;
	protected double yearIncome;
	
	public TaxPayer(String name, double yearIncome) {
		this.name = name;
		this.yearIncome = yearIncome;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getYearIncome() {
		return yearIncome;
	}
	
	public void setYearIncome(double yearIncome) {
		this.yearIncome = yearIncome;
	}
	
	public abstract double taxCalculator();

}
