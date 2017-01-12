package ato14HelloAnimals;
public class Animal {
	String age = "";
	String color = "";
	String type = "";
	int weight = 0;
	int minimumWeight = 0;

	public Animal(String age, String color, String type, int weight, int minimumWeight){
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
	
	public void eat(){
		weight++;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setWeight(int newWeight){
		weight = newWeight;
	}
	
	public void output(){
		System.out.println(
				"Age: " + age + "\n" +
				"Color: " + color + "\n" +
				"Type: " + type + "\n" +
				"Weight: " + weight + "\n" +
				"Minimum Weight: " + minimumWeight + "\n"
				);
	}

	public void move(){
		weight--;
		if(type =="Bird") weight --;
		if(weight < minimumWeight){
			System.out.println("This animal is below its minimum weight.");
		}
	}
	
} // end Animal Class
