package com.xworkz.abstraction;

public class AnimalRunner {
	public static void main(String[] args) {
		Animal dog=new Dog();
		System.out.println("------DOG---------");
		dog.AnimalInfo();
		dog.Sound();
		dog.Eat();
		dog.Lifespan();
		Animal cat=new Cat();
		System.out.println("------CAT---------");
		cat.AnimalInfo();
		cat.Sound();
		cat.Eat();
		cat.Lifespan();
		Animal cow=new Cow();
		System.out.println("------COW---------");
		cow.AnimalInfo();
		cow.Sound();
		cow.Eat();
		cow.Lifespan();
		
	}

}
