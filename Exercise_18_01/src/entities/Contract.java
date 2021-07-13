package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contract {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private int number;
	private Date date;
	private double totalValue;
	
	public Contract(int number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nNumber: ");
		sb.append(number);
		sb.append("\nDate: ");
		sb.append(sdf.format(date));
		sb.append("\nTotal value: ");
		sb.append(totalValue);
		
		return sb.toString();
	}
}
