package test;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("**********Employee Details***********");
		emp.printDetails();
		
		Developer dev = new Developer();
		System.out.println("**********Developer Details***********");
		dev.printDetails();
		
		SeniorDeveloper seniorDev = new SeniorDeveloper();
		System.out.println("**********Senior Developer Details***********");
		seniorDev.printDetails();
		
		Architect arc = new Architect();
		System.out.println("**********Architect Details***********");
		arc.printDetails();
	}

}
