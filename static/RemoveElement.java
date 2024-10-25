public class RemoveElement{
	public static void main(String[] args) {
		int[] array={1,2,4,5,6,7,8};
		int n=array.length;
		int[] value=RemoveArray(array,n,8);
		for(int i=0;i<value.length;i++){
			System.out.println(value[i]);

		}

	}

	public static int[] RemoveArray(int[] array,int n,int number){
		int count=0;
		for(int i=0;i<n;i++){
			if(array[i]==number){
				count++;
			}
		}

		int[] newarray=new int[n-count];
		int index=0;
		for(int i=0;i<n;i++){
			if(array[i]!= number){
					newarray[index]=array[i];
					index++;
				}
			}
		
		return newarray;

	}
}
