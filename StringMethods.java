public class StringMethods{
	public static void main(String[] args){

		System.out.println("........................................\n");
		animeSeries("Naruto");
		System.out.println("........................................\n");
	
		dramaTitle("THE SEVEN OCEANS");
		System.out.println("........................................\n");
		
		Trimdata("      H2O         ");
		System.out.println("........................................\n");

		forestName("Amazon");
		System.out.println("........................................\n");

		firstNameLastName("Unni Krishna Mutturaj Selvan");
		System.out.println("........................................\n");

		blankspace("");
		System.out.println("........................................\n");

	}

	//INBUILT METHODS

	//1.toUpperCase 
	public static void animeSeries(String Anime){
		String AnimeSeries=Anime.toUpperCase();
		System.out.println("Before Using toUpperCase :"+Anime);
		System.out.println("After Using toUpperCase :"+AnimeSeries);
	}

	//2.toLowerCase
	public static void dramaTitle(String Drama){
		String Dramaname=Drama.toLowerCase();
		System.out.println("Before Using toLowerCase : "+Drama);
		System.out.println("After Using toLowerCase :"+Dramaname);
	}

	//3.Trim
	public static void Trimdata(String formula){
		String TrimValue=formula.trim();
		System.out.println("Before using Trim :"+formula);
		System.out.println("After using Trim :"+TrimValue);
	}

	//4.concat
	public static void forestName(String forestNames){
		String forestDetail	=forestNames.concat(" Jungle");
		System.out.println("Before using Concat :"+forestNames);
		System.out.println("After using Concat :"+forestDetail);

	}

	//5.split
	public static void firstNameLastName(String Name){
		String[] Names=Name.split(" ");
		System.out.println("Befor Split :"+Name);
		System.out.println("After Split :");
		System.out.println(Names[0]);
		System.out.println(Names[1]);
		System.out.println(Names[2]);
		System.out.println(Names[3]);

	}

	//6.isEmpty
	public static boolean blankspace(String blank){
		boolean blankValue=blank.isEmpty();
		System.out.println("Before using isEmpty result is :"+blank);
		System.out.println("After using isEmpty result is :"+blankValue);
		return blankValue;
	}

}