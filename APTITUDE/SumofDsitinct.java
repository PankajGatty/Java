public class SumofDsitinct{
	public static void main(String[] args) {
		int[] arrA={1,1,2,3,4,5,6,7,8,8};

		int sum=0;

		for(int i =0;i<arrA.length-1;i++){
			for(int j=0;j<arrA.length;j++){

			if(arrA[i]!=arrA[j]){
				sum=arrA[i]+arrA[j];
			}	

			
		}

		}
		

		System.out.println("sum of 2 number is"+sum);

	}
}