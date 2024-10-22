public class StringValues{
	public static void main(String[] args){
		//using literals

		String Hospital="Yenapoya";

		String Medical="Yenapoya";

		String Winner="Royal Challengers Bengaluru";

		String Winner1="Chennai Super Kings";

		String Topper="Allen";

		String RankHolder="Flash";

		String Songname="zara zara";

		String DanceStyle="HipHop";

		String DramaName="The Witch";


		// using .equals to comapre 
		System.out.println(Hospital.equals(Medical)); 

		System.out.println(Topper.equals(RankHolder));



		//using New Keyword.

		String Topper1=new String("Allen");

		String Hospitals=new String("Yenapoya");

		String Medicals=new String("KMC");

		String Winners=new String("Kolkatta Knight Riders");

		String Winners1=new String("Mumbai Indians");

		String RankHolders=new String("Savitar");

		String Songnames=new String("Nari Nari");

		String DanceForms=new String("Locking");

		String SkitName=new String("Squid Game");




		System.out.println(Topper==Topper1); //condition false bcz addresses are different

		System.out.println(Topper.equals(Topper1));  //condition true bcz here it checks values are same


		//String Reverse:

		String Movie="SEVEN OCEAN";

		char[] moviearray=Movie.toCharArray();

		String Moviename="";

		for(int i=moviearray.length-1;i>=0;i--){
			Moviename=Moviename+moviearray[i];
		}
		System.out.println(Moviename);
	}
}