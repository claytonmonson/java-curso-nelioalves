package entities;

public class Student {

	private String name;
	private double grade1;
	private double grade2;
	private double grade3;

	public Student(String name, double g1, double g2, double g3) {
		this.name = name;
		this.grade1 = g1;
		this.grade2 = g2;
		this.grade3 = g3;
	}

	public double finalGrade() {
		return this.grade1 + this.grade2 + this.grade3;
	}

	public String situation() {
		if (finalGrade() >= 60.0) {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade()) 
					+ "\nPASS";
		} else {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade())
					+ "\nFAILED"
					+ "\nMISSING " + String.format("%.2f", 60.0 - finalGrade()) + " POINTS";
		}
	}
	
}
