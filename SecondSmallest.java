	public class SecondSmallest{
		public static void main(String[] args){
			int[] Number={1,20,3,100,200,2,300};
			int result=secondSmallestElement(Number);
			System.out.println("Second Smallest Element is :"+result);

			int value=secondLargestElement(Number);
			System.out.println("Second Largest Element is :"+value);

		}

		public static int secondSmallestElement(int[] Number){
			int smallValue= Integer.MAX_VALUE;
			int secondSmallValue= Integer.MAX_VALUE;

			for(int i=1; i<Number.length; i++){
				if(Number[i]<smallValue){
					secondSmallValue=smallValue;
					smallValue=Number[i];
				}
				else if(Number[i]<secondSmallValue && Number[i]!=secondSmallValue ){
					secondSmallValue=Number[i];
				}
			}
			return secondSmallValue;
		}

		public static int secondLargestElement(int[] Number){
			int largestValue=Number[0];
			int secondLargest=Number[0];

			for(int i=0;i<Number.length	;i++){
				if(Number[i]>largestValue){
					secondLargest=largestValue;
					largestValue=Number[i];
				}
				else if(Number[i]>secondLargest && largestValue==secondLargest){
					secondLargest=Number[i];
				}
			}
			return secondLargest;
		}
	}