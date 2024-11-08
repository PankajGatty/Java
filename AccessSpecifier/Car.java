
public class Car {
	public String name;
	protected String engineType;
	int year;
	private double price;
	
	
	Car(){
		this.name="AUDI";
		this.engineType="PETROL";
		this.year=2020;
		this.price=200000;
		
	}
	
	public Car(String name,String engineType,int year,double price) {
		this.name=name;
		this.engineType=engineType;
		this.year=year;
		this.price=price;
		
	}
	
	public void displayName() {
		System.out.println("CAR NAME:"+name);
	}
	
	protected void displayEngine() {
		System.out.println("CAR ENGINE TYPE:"+engineType);
		
	}
	
	void displayYear() {
		System.out.println("YEAR :"+year);
	}
	
	private void displayPrice() {
		System.out.println("PRICE:"+price);
	}
	
	public void yearPrice() {
		displayYear();
		displayPrice();
	}
	
	
		

}
