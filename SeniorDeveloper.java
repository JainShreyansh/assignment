package test;

public class SeniorDeveloper extends Developer {
	SeniorDeveloper() {
		setWorkingHours(super.getWorkingHours() - (super.getWorkingHours() / 5));
		setBaseSal(super.getBaseSal() + (super.getBaseSal() / 5));
		setVacationDays(super.getVacationDays() + 3);
	}
}
