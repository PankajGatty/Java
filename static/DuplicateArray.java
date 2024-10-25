public class DuplicateArray{
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,1};
		int n=array.length;
		boolean value=findDuplicate(array,n);
		System.out.println(value);
				
	}
	
	public static boolean findDuplicate(int[] array,int n){
		for(int i=0;i<n;i++){
			for(int j =i+1;j<n;j++){
				if(array[i]==array[j]){

				return true;
			}
	}
}
	return false;

}
}