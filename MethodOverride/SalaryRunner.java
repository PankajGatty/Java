public class SalaryRunner {
	public static void main(String[] args) {
		Employee employee=new Employee("pankaj",10000,5);
		employee.calculateSalary();
		employee.display();
		
		
		Manager manager=new Manager("Alwin",100000,10,5000);
		manager.calculateSalary();
		manager.display();
		
		Intern intern=new Intern("Harry",10000,5,5000,500);
		intern.calculateSalary();
		intern.display();
	}

}
