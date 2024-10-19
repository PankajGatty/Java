public class loop{
	public static void  main(String[] args){
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println("left to right");

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("**************************");

		System.out.println("right to left");
		for(int i=arr.length-1;i>-1;i--){
			System.out.println(arr[i]);
		}
		System.out.println("**************************");

		
		// System.out.println("middle to left");
		// for(int i=9;i<arr.length;i--){
		// 	System.out.println(arr[i]);
		
		// }
	
	System.out.println("**************************");

		System.out.println("Skip element");
		for(int i=0,k=0;i<=arr.length;k++){
			System.out.println(arr[k]);
		}

	
	}


}