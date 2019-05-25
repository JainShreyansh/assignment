package test;

public class Developer extends Employee {
	Developer() {
		setWorkingHours(super.getWorkingHours() + (super.getWorkingHours() / 2));
		setBaseSal(super.getBaseSal() + 10000);
		setVacationDays(super.getVacationDays());
	}
}
