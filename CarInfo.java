public class CarInfo{
	public static void main(String[] args) {
		Cars car=new Cars();
		//object
		car.carName="Audi";
		car.noOfSeats=2;
		car.fuelType="Petrol";
		car.exhaustType="Single";
		car.carMilagePerKm=20;
		
		//object1
		Cars car1=new Cars();
		car1.carName="BMW";
		car1.noOfSeats=2;
		car1.fuelType="Petrol";
		car1.exhaustType="Dual";
		car1.carMilagePerKm=18;

		//object2
		Cars car2=new Cars();
		car2.carName="Ford";
		car2.noOfSeats=5;
		car2.fuelType="Disel";
		car2.exhaustType="Single";
		car2.carMilagePerKm=30;
		
		//object3
		Cars car3=new Cars();
		car3.carName="Jaguar";
		car3.noOfSeats=2;
		car3.fuelType="Petrol";
		car3.exhaustType="Dual";
		car3.carMilagePerKm=10;
		
		//object4
		Cars car4=new Cars();
		car4.carName="Porsche";
		car4.noOfSeats=2;
		car4.fuelType="Hybrid";
		car4.exhaustType="Dual";
		car4.carMilagePerKm=10;

		//object5
		Cars car5=new Cars();
		car5.carName="Nano";
		car5.noOfSeats=4;
		car5.fuelType="Disel";
		car5.exhaustType="Single";
		car5.carMilagePerKm=35;

		//object6
		Cars car6=new Cars();
		car6.carName="Swift";
		car6.noOfSeats=5;
		car6.fuelType="Disel";
		car6.exhaustType="Single";
		car6.carMilagePerKm=32;

		//object7
		Cars car7=new Cars();
		car7.carName="TATA Punch";
		car7.noOfSeats=5;
		car7.fuelType="Petrol";
		car7.exhaustType="Single";
		car7.carMilagePerKm=28;

		//object8
		Cars car8=new Cars();
		car8.carName="TATA Harrier";
		car8.noOfSeats=5;
		car8.fuelType="Hybrid";
		car8.exhaustType="Single";
		car8.carMilagePerKm=30;

		//object9
		Cars car9=new Cars();
		car9.carName="KIA";
		car9.noOfSeats=5;
		car9.fuelType="Petrol";
		car9.exhaustType="Single";
		car9.carMilagePerKm=30;


		//printing object
		car.carDetail();

		//printing object 1
		car1.carDetail();

		//printing object 2
		car2.carDetail();

		//printing object 3
		car3.carDetail();

		//printing object 4
		car4.carDetail();

		//printing object 5
		car5.carDetail();

		//printing object 6
		car6.carDetail();

		//printing object 7
		car7.carDetail();

		//printing object 8
		car8.carDetail();

		//printing object 9
		car9.carDetail();

	}

}