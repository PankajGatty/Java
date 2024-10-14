public class Bank{
	String account_holder;
	int account_number;
	int balance;
	String account_type;
	String branch;


	public Bank(){
		System.out.println("\n");
		System.out.println("*****************************");
		System.out.println("No Parameterized Constructor");
		System.out.println("*****************************");
		System.out.println("\n");
	}

	public Bank(String account_holder,int account_number,int balance,String account_type,String branch){
		this.account_holder=account_holder;
		this.account_number=account_number;
		this.balance=balance;
		this.account_type=account_type;
		this.branch=branch;
	}

	public static void deposit(){
		

	}
	public static void withdraw(){

	}
	public void BankDetails(){
		System.out.println("*******************************************");
		System.out.println("Account holder name:"+account_holder);
		System.out.println("Account Number:"+account_number);
		System.out.println("Account balance:"+balance);
		System.out.println("Account Type:"+account_type);
		System.out.println("Account Branch:"+branch);
		System.out.println("*******************************************");
		System.out.println("\n");

	}


}