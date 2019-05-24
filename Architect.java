package test;

public class Architect extends Employee {
	Architect() {
		this.workingHours = super.workingHours;
		this.baseSal = super.baseSal * 3;
		this.vacationDays = super.vacationDays * 2;
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
