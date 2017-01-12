package ato14HelloAnimals;

import java.util.Vector;

public class HelloAnimals {

	public static void main(String[] args) {
		
		Vector<Animal> zoo = new Vector<Animal>();
		
		zoo.addElement(new Fish("three", "red", 8, 2));
		zoo.addElement(new Fish("two", "blue", 6, 1));
		zoo.addElement(new Mammal("seven", "brown", 22, 12));
		zoo.addElement(new Mammal("ten", "white", 40, 25));
		zoo.addElement(new Bird("one", "orange", 12, 9));
		zoo.addElement(new Bird("twenty", "teal", 17, 10));

		for(Animal a : zoo){
			a.eat();
			a.move();
		}
		
		for(Animal a : zoo){
			a.output();
		}
		
	}//end main

}// end HelloAnimals class
