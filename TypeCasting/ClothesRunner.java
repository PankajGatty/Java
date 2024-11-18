package com.xworkz.TypeCasting;

public class ClothesRunner {
	public static void main(String[] args) {
		Mens men=new Mens();//tight coupling
		ClotheShops clothe=men; //upcasting
		men.menclothe();
		men.mensFootware();
		ClotheShops men=new Mens();//loosely coupling
		men.menclothe();
	}

}
