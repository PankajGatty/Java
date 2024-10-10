public class MethodOverloading{
	public static void main(String[] args){
		addition(10,20);
		addition(10,20,30);
		addition(10,20,30,40);
		System.out.println ("**************************");
		carDetail(547854); 
		carDetail("BMW");
		System.out.println ("**************************");
		carDetail(547854,"BMW");
		carDetail("BMW",547854);
		System.out.println ("**************************");
		sumOfDigits(1,2,3,4,5);

	}
	//change the no.of parameters
	public static void addition(int number1,int number2){
		System.out.println("Adding 2 number:"+(number1+number2));
	}
	public static void addition(int number1,int number2,int number3){
		System.out.println("Adding 3 number:"+(number1+number2+number3));
	}
	public static void addition(int number1,int number2,int number3,int number4){
		System.out.println("Adding 4 number:"+(number1+number2+number3+number4));
	}

	//change the no.of data type
	public static void carDetail(int registerNo){
		System.out.println("CarDetails Regno:"+registerNo);
	}
	public static void carDetail(String name){
		System.out.println("Car Name:"+name);
	}

	//change the order of the parameter
	public static void carDetail(int registerNo,String name){
		System.out.println("CarDetails:"+registerNo+" ,"+name);
	}

	public static void carDetail(String name,int registerNo){
		System.out.println("CarDetails:"+name+" ,"+registerNo);
	}



	public static void sumOfDigits(int... Digits){
		int sum=0;
		for(int index=0;index<Digits.length;index++){
			sum=sum+Digits[index];	
		}
		System.out.println("sum of digits is:"+sum);
	}



}