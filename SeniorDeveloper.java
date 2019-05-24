package test;

public class SeniorDeveloper extends Developer {
	SeniorDeveloper() {
		this.workingHours = super.workingHours - (super.workingHours / 5);
		this.baseSal = super.baseSal + (super.baseSal / 5);
		this.vacationDays = super.vacationDays + 3;
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
