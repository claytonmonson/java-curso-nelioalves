package entities;

public class EmployeeExercise96 {

	private int id;
	private String name;
	private double salary;

	public EmployeeExercise96(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		this.salary += this.salary * (percentage / 100.0);
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary );
	}
}
