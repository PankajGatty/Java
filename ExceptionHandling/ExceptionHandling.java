package com.xworkz.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
	public static void main(String[] args){
		try {
			Class.forName("java.lang.String");
			FileInputStream file=new FileInputStream("C:/Users/PANKAJ GATTY/Desktop/Java/abstraction/Animal.java");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class Not Found Exception");
			e.printStackTrace();
		} 
		catch (IOException ex) {
			System.out.println("Input Output Exception");
			ex.printStackTrace();
		}
	}

}
