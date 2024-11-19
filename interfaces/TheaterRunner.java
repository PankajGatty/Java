package com.xworkz.interfaces;

public class TheaterRunner {
	public static void main(String[] args) {
		MangaloreTheater movie=new MangaloreTheater();//tightly coupling
		movie.Screen();
		movie.foodCombo();
		movie.offlineTicketPrice();
		movie.onlineTicketPrice();
		System.out.println("*******************************************");
		BangaloreTheater movie1=new BangaloreTheater();//tightly coupling
		movie1.Screen();
		movie1.foodCombo();
		movie1.offlineTicketPrice();
		movie1.onlineTicketPrice();
	}

}
