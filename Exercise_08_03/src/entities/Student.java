package entities;

public class Student {
	
	public String name;
	public double grade01;
	public double grade02;
	public double grade03;
	
	public double FinalGrade() {
		return grade01 + grade02 + grade03;
	}
	
	public void showResult() {
		System.out.printf("FINAL GRADE = %.2f%n", FinalGrade());
		if (FinalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.printf("FAILED\nMISSING %.2f POINTS", 60 - FinalGrade());
		}
	}

}
