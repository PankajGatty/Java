
public class CarRunner extends Car{
	
	public CarRunner(String name,String engineType,int year,double price) {
		super(name,engineType,year,price);
	}
	public static void main(String[] args) {
		CarRunner car=new CarRunner("FERRARI","PETROL",2024,1000000);
		
		
		
		car.displayName();
		
		car.displayEngine();
		
		car.yearPrice();
		
		
	}

}
