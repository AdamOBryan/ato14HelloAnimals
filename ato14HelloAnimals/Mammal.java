package ato14HelloAnimals;
public class Mammal extends Animal {
	
	public Mammal (String age, String color, int weight, int minimumWeight){
		super(age, color, "Mammal", weight, minimumWeight);
	}

	public void run(){
		super.weight --;
	}
	
}
