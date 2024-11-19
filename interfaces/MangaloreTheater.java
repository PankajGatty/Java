package com.xworkz.interfaces;

public class MangaloreTheater implements PVR,Cinepolicy {

	@Override
	public void Screen() {
		System.out.println("Mangalore Cinepolicy Screen No:1");
		
	}

	@Override
	public void foodCombo() {
		System.out.println("Mangalore Cinepolicy Food Combo Rs:599");
		
	}

	@Override
	public void offlineTicketPrice() {
		System.out.println("Mangalore PVR Offline Ticket Price is:200 ");
		
	}

	@Override
	public void onlineTicketPrice() {
		System.out.println("Mangalore PVR Offline Ticket Price is:250 ");
		
	}
	
}
