package test;

public class Employee {
	private int workingHours;
	private double baseSal;
	private int vacationDays;

	Employee() {
		this.workingHours = 40;
		this.baseSal = 50000;
		this.vacationDays = 10;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public void printDetails() {
		System.out.println("Working hours : " + workingHours);
		System.out.println("Base Salary   : " + baseSal);
		System.out.println("Vacation Days : " + vacationDays);
	}
}
