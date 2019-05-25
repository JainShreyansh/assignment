package test;

public class Architect extends Employee {
	Architect() {
		setWorkingHours(super.getWorkingHours());
		setBaseSal(super.getBaseSal() * 3);
		setVacationDays(super.getVacationDays() * 2);
	}
}
