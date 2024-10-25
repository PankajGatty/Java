public class EmployeeDetails{
	public static void main(String[] args) {

		//calling Employee.java
		System.out.println("....................................");
		Employee employee=new Employee("Allen",1001,40000,"IT");
		employee.display();

		//calling University.java

		System.out.println("\n....................................");
		University university=new University("Saavitar",01,"MCA",2024);
		university.showUniversityDetails();

		//calling BankAccount.java

		System.out.println("\n....................................");
		BankAccount bankaccount =new BankAccount("Benedict",85215,100000,"Saving Account");
		bankaccount.bankRender();

		//calling Hotel.java
		System.out.println("\n....................................");
		Hotel hotel =new Hotel("Roy",103,"25-10-24","26-10-24");
		hotel.status();

		//calling Student.java
		System.out.println("\n....................................");
		School school =new School("Raju",Grade.B,174713,"Sunanda");
		school.display();

	}
}