package ato14HelloAnimals;
public class Bird extends Animal {

	public Bird (String age, String color, int weight, int minimumWeight){
		super(age, color, "Bird", weight, minimumWeight);
	}

	public void fly(){
		super.weight -= 2;
	}
	
}
