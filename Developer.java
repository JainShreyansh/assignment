package test;

public class Developer extends Employee {
	Developer() {
		this.workingHours = super.workingHours + (super.workingHours / 2);
		this.baseSal = super.baseSal + 10000;
		this.vacationDays = super.vacationDays;
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
}
