package com.xworkz.interfaces;

public class BangaloreTheater implements PVR,Cinepolicy {

	@Override
	public void Screen() {
		System.out.println("Bangalore Cinepolicy Screen No:5");
		
	}

	@Override
	public void foodCombo() {
		System.out.println("Bangalore Cinepolicy Food Combo Rs:999");
		
	}

	@Override
	public void offlineTicketPrice() {
		System.out.println("Bangalore PVR Offline Ticket Price is:400 ");
		
	}

	@Override
	public void onlineTicketPrice() {
		System.out.println("Bangalore PVR Offline Ticket Price is:350 ");
		
	}
	

}
