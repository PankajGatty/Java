public class Employee{
	static String comapanyName;
	static String companyLocation;
	static int no_of_employees;
	String employeeName;
	int employeeId;
	double salary;
	String department;

	static{
		  comapanyName="Siemens";
		  companyLocation="Bengaluru";
		  no_of_employees=100;
		}
	

	public Employee(String employeeName,int employeeId,double salary,String department){

		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.salary=salary;
		this.department=department;

	}

	public void display(){
		System.out.println("Company Name:"+comapanyName);
		System.out.println("Company Location:"+companyLocation);
		System.out.println("No.of.Employees:"+no_of_employees);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Salary :"+salary);
		System.out.println("Department :"+department);

	}


}