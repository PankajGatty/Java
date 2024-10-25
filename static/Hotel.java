public class Hotel{
	static String hotelName;
	static String hotelLocation;
	static int totalRooms;
	String guestName;
	int roomNumber;
	String checkInDate;
	String checkOutDate;

	static{
		hotelName="Karavali";
		hotelLocation="Mangalore";
		totalRooms=10;
	}

	public  Hotel(String guestName,int roomNumber,String checkInDate,String checkOutDate){
		this.guestName=guestName;
		this.roomNumber=roomNumber;
		this.checkInDate=checkInDate;
		this.checkOutDate=checkOutDate;
	}

	public void status(){
		System.out.println("Hotel Name:"+hotelName);
		System.out.println("Hotel Location:"+hotelLocation);
		System.out.println("Total Rooms:"+totalRooms);
		System.out.println("Guest Name:"+guestName);
		System.out.println("Room Number:"+roomNumber);
		System.out.println("Check In:"+checkInDate);
		System.out.println("Check Out:"+checkOutDate);

	}


	

}