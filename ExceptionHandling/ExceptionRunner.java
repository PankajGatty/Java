package com.xworkz.ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionRunner {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			FileInputStream runner = new FileInputStream("C:/Users//PANKAJ GATTY//Desktop//Java//abstraction//Animal.java");

		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found Exception ");
			e.printStackTrace();
		}
		catch(IOException eio) {
			System.out.println("IOException ");
			eio.printStackTrace();
		}
		
		
}
}
