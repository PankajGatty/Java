public class Movies{
	//here we creating array and storing 
	//STORE OPERATIONS.
	static MovieTickets[] arr=new MovieTickets[8];
	public static void main(String[] args){
		MovieTickets movie= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);

		MovieTickets movie1= new MovieTickets("KGF","Cini Policy","H09","12:30 PM",200,true);
		MovieTickets movie2= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);
		MovieTickets movie3= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);
		MovieTickets movie4= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);
		MovieTickets movie5= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);
		MovieTickets movie6= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);
		MovieTickets movie7= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);
		MovieTickets movie8= new MovieTickets("LUCIA","PVR","K10","12:30 PM",200,true);



		savedTickets(movie);
		savedTickets(movie1);
		savedTickets(movie2);
		savedTickets(movie3);
		savedTickets(movie4);
		savedTickets(movie5);
		savedTickets(movie6);
		savedTickets(movie7);
		savedTickets(movie8);	
	

	for(int i=0;i<arr.length;i++){
		if(arr[i]!=null)
			{
				arr[i].MovieTicketsDetails();
			}
	}
}
public static boolean savedTickets(MovieTickets ticketDetails){
	for(int i=0;i<arr.length;i++){
		if(arr[i]==null){
			arr[i]=ticketDetails;
			return true;
		}

	}
	System.out.println("NO SPACES");
	return false;
}
}