package com.xworkz.TypeCasting;

public class Score {
	public static void main(String[] args) {
		byte halfCentury=50;
		short century=100;
		float avg=10.5f;
		float track=1000.50f;
		
		int rate=130;
		long longvalue=123456;
		long highestScore=10000000;
		double doublevalue=123578956.45;
		
		//upcasting
		System.out.println("********upcasting*************");
		int halfCentury1=halfCentury;
		System.out.println("int :"+halfCentury1);
		
		long century1=century;
		System.out.println("long :"+century1);
		
		double avg1=avg;
		System.out.println("double :"+avg1);
		
		double track1=track;
		System.out.println("double :"+track1);
		
		//downcasting
		System.out.println("\n********downcasting*************");
		byte rate1=(byte)rate;
		System.out.println("byte :"+rate1);
		short longvalue1=(short)longvalue;
		System.out.println("short :"+longvalue1);
		int highestScore1=(int)highestScore;
		System.out.println("int :"+highestScore1);
		float doublevalue1=(float)doublevalue;
		System.out.println("float :"+doublevalue1);
			
	}
}
