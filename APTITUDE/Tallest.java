public class Tallest{
	public static void main(String[] args) {
		int arr[]={1800,1900,5000,10000,50000};
		int max=arr[0];
		for(int i =4;i<arr.length;i=i+4){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Tallest height of mountain"+max);
	}
	
}