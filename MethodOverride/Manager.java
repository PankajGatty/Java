

public class Manager extends Employee{
	int bonus;
	
	public Manager(String name,int baseSalary,int experience,int bonus) {
		super(name,baseSalary,experience);
		this.bonus=bonus;
		
	}

	//@overrirde
	public void calculateSalary() {
		int totalSalary=baseSalary+bonus;
		System.out.println("***********MANAGER DETAIL***********************/n");
		System.out.println("Calculating salary for :"+name);
		System.out.println("MANAGER TOTAL SALARY :"+totalSalary);
		System.out.println("BONUS  :"+bonus);
		
		
	}
	

}
