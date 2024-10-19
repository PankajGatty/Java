public class Movies{
	//here we creating array and storing 
	//STORE OPERATIONS.
	static MovieTickets[] arr=new MovieTickets[8];
	public static void main(String[] args){
		MovieTickets movie= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);
		MovieTickets movie1= new MovieTickets("KGF","Cini Policy","H09","12:30 PM",200,true);
		MovieTickets movie2= new MovieTickets("TENET", "PVR", "F4", "2:30 PM", 230, false);
		MovieTickets movie3 = new MovieTickets("INCEPTION", "INOX", "A5", "3:00 PM", 250, false);
		MovieTickets movie4 = new MovieTickets("AVATAR", "Cinepolis", "B12", "6:45 PM", 300, true);
		MovieTickets movie5 = new MovieTickets("DUNE", "PVR", "C3", "1:00 PM", 180, true);
		MovieTickets movie6 = new MovieTickets("JOKER", "INOX", "H7", "9:15 PM", 220, false);
		MovieTickets movie7 = new MovieTickets("INTERSTELLAR", "Cinepolis", "G5", "4:00 PM", 270, true);
		MovieTickets movie8 = new MovieTickets("THE DARK KNIGHT", "PVR", "E9", "11:30 AM", 250, true);


		savedTickets(movie);
		savedTickets(movie1);
		savedTickets(movie2);
		savedTickets(movie3);
		savedTickets(movie4);
		savedTickets(movie5);
		savedTickets(movie6);
		savedTickets(movie7);
		savedTickets(movie8);	



		// Searching for a movie by name
        MovieTickets foundMovie = searchMovie("war");
        

        // updating a show time
        updateShowTime("KGF","1:30 PM");

        //delete a movie
        
        deleteMovie("LUCIA");
        

	

	// for(int i=0;i<arr.length;i++){
	// 	if(arr[i]!=null)
	// 		{
	// 			arr[i].MovieTicketsDetails();
	// 		}
	// }
}
public static boolean savedTickets(MovieTickets ticketDetails){
	for(int i=0;i<arr.length;i++){
		if(arr[i]==null){
			arr[i]=ticketDetails;
			return true;
		}

	}
	System.out.println("no  such movie exist");
	return false;
}

public static MovieTickets searchMovie(String movieName){
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=null){
			if(arr[i].movieName.equals (movieName)){

				arr[i].movieName=movieName;
				System.out.println("movie found");
				arr[i].MovieTicketsDetails();

				return arr[i];
			}
		}
	}
	return null;
}

public static boolean updateShowTime(String movieName,String showTime){
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=null){
			if(arr[i].movieName.equals(movieName)){
				System.out.println("Before updated");
				arr[i].MovieTicketsDetails();
				arr[i].showTime=showTime;
				System.out.println("After updated");
				arr[i].MovieTicketsDetails();
				return true;
			}
		}

	}
return false;


	}

public static boolean deleteMovie(String movieName){
    for(int i=0;i<arr.length;i++){
    	if(arr[i]!=null){
    		if(arr[i].movieName.equals(movieName)){
    			System.out.println("Deleting Movie:"+movieName);
    			arr[i]=null;
    			System.out.println("Movie Deleted Successfully");
    			return true;

    		}
    	}

    }
    System.out.println("ERROR FOUND WHILE DELETING \n MOVIE NOT FOUND");
    return false;

}
}