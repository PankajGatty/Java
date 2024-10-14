public class BankAccount{
	public static void main(String[] args){

		//Using Parameterized Constructor
		Bank bank =new Bank("Suresh",3578,30000,"SA","Kadri");
		Bank bank1 =new Bank("Ramesh",8521,35000,"SA","Ballalbhag");
		Bank bank2 =new Bank("Harry",7896,50000,"FD","Mangalore");
		Bank bank3 =new Bank("Pooja",1999,100000,"FD","Surathkal");
		Bank bank4 =new Bank("Akash",1090,80000,"RD","Bajpe");
		Bank bank5 =new Bank("Gautham",9512,40000,"CA","BC Road");
		Bank bank6 =new Bank("Sandra",5577,850000,"SA","Thokkottu");

		//using No Parameterized Constructor
		Bank bank7=new Bank();
		Bank bank8=new Bank();
		Bank bank9=new Bank();


		bank.BankDetails();  
		bank1.BankDetails();
		bank2.BankDetails();
		bank3.BankDetails();
		bank4.BankDetails();
		bank5.BankDetails();
		bank6.BankDetails();

	}
}