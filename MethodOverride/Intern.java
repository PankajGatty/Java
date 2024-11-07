

public class Intern extends Employee{
	int stipend;
	int extraAllowence;
	
	public Intern(String name,int baseSalary,int experience,int stipend,int extraAllowence) {
		super(name, baseSalary, experience);
		this.stipend=stipend;
		this.extraAllowence=extraAllowence;
		
	}
	//@override
	public void calculateSalary() {
		int totalPay=stipend+extraAllowence;
		System.out.println("***********INTERN DETAIL***********************");
		System.out.println("PAY FOR INTERN IS:"+totalPay);
	}
	
	//@override
	public void display() {
		
		System.out.println("STIPEND FOR INTERN IS:"+stipend);
		System.out.println("EXTRA ALLOWENCE FOR INTERN IS:"+extraAllowence);
		
	}
	

}
