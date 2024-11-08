public class SecondMax{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int second_max;

		if((a>b && a<c)||(a>c && a<b)){
			second_max=a;
		}
		else if((b>a && b<c)||(b>c && b<a)){
			second_max=b;
		}
		else{
			second_max=c;
		}
		System.out.println("Second Max value is:"+second_max);
	}
}