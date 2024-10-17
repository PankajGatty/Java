public class MovieTickets{
	String movieName;
	String theaterName;
	String seatNumber;
	String showTime;
	double ticketPrice;
	boolean isBooked;

	public MovieTickets(String movieName,String theaterName,String seatNumber,String showTime,double ticketPrice,boolean isBooked)
	{
		this.movieName=movieName;
		this.theaterName=theaterName;
		this.seatNumber=seatNumber;
		this.showTime=showTime;
		this.ticketPrice=ticketPrice;
		this.isBooked=isBooked;
	}

	public void MovieTicketsDetails(){
		System.out.println("*********************");
		System.out.println("MOVIE NAME:"+movieName);
		System.out.println("THEATER NAME:"+theaterName);
		System.out.println("SEAT NUMBER:"+seatNumber);
		System.out.println("SHOW TIME:"+showTime);
		System.out.println("TICKET PRICE:"+ticketPrice);
		System.out.println("BOOK CONFIRMED:"+isBooked);
		System.out.println("*********************");
	}
}