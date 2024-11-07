

public class Employee {
	String name;
	int baseSalary;
	int experience;
		
	

	public Employee(String name,int baseSalary,int experience) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.experience=experience;

}
	public void calculateSalary() {
		System.out.println("***********EMPLOYEE DETAIL***********************");
		System.out.println("Calculating salary for :"+name);
		
	}
	
	public void display() {
		
		System.out.println("NAME:"+name);
		System.out.println("BASE SALARY:"+baseSalary);
		System.out.println("EXPERIENCE:"+experience);
		System.out.println("*************************************************");
		
	}
}
