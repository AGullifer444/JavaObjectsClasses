package differenceObjectsClasses;

class Cat {
	//attributes
	String color;
	String name;
	//Constructor
	public Cat (String color, String name) {
		this.color = color;
		this.name = name;	
	}
	//method
	void purr()
	 {
		System.out.println("I have a " + color + " cat. Her name is " + name + " and she purrs often.");
	}
}

public class Main {

	public static void main(String[] args) {
		//create object using constructor
		Cat myCat = new Cat ("calico", "Snipurr");
		myCat.purr();
	}
}
