package ato14HelloAnimals;
public class Fish extends Animal {
	String age;
	String color;
	String type = "Fish";
	int weight;
	int minimumWeight;
	
	public Fish(String age, String color, int weight, int minimumWeight){
		super(age, color, "Fish", weight, minimumWeight);
	}


	public void swim(){
		super.weight --;
	}
	

}
