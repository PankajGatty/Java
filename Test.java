public class Test{
	public static void main(String [] args){
		 Shop();
		 AllCars();
		 Car("Audi");
		 Rating();
		 RentDays(2);
		 CarRate(5000,2);

	}

	public static void Car(String name){
		System.out.println("name:"+name);
	}

	public static void RentDays(int days){
		System.out.println("Rental Days:"+days);
	}
	public static void CarRate(int rate,int days){
		System.out.println("rate:"+rate*days);
	}

	public static void Shop(){
		System.out.println("*********Car Shops********");
	}

	public static void AllCars(){
		System.out.println("All cars Available");
	}

	public static void Rating(){
		System.out.println("Rating :5 star");
	}

}