public class BankAccount{
	static String bankName;
	static String branchName;
	static float interestRate ;
	String accountHolderName;
	int accountNumber;
	double balance;
	String accountType;

	static{
		bankName="State Bank Of India";
		branchName="Mangalore";
		interestRate=8.5f;
	}

	public BankAccount(String accountHolderName,int accountNumber,double balance,String accountType){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.accountType=accountType;
	}

	public void bankRender(){
		System.out.println("Bank Name:"+bankName);
		System.out.println("Branch Name:"+branchName);
		System.out.println("Interest Rate:"+interestRate);
		System.out.println("Account Holder Name:"+accountHolderName);
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Balance:"+balance);
		System.out.println("Account Type:"+accountType);

	}
}