package march16Assignment1;

class Animal{
	//variables of animal class.................
	int legs;
	String typeOfEater;
	
	//methods of variable class..............
	 public static void eat() {
		 System.out.println("I eat");
	 }
	 
//		constructor without parameters
		Animal(){
			this.legs=4;
			this.typeOfEater="Omnivores";
		}
	
//      paramatrized constructor 
public Animal(int legs, String typeOfEaters) {
	this.legs = legs;
	this.typeOfEater = typeOfEaters;
}

//	 getters and setters of animal class...........

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getTypeOfEaters() {
		return typeOfEater;
	}
	public void setTypeOfEaters(String typeOfEaters) {
		this.typeOfEater = typeOfEaters;
	}
	
	public String toString() {
		return "Animal [legs=" + legs + ", typeOfEater=" + typeOfEater +"]";
	}	 	 
}

public class March16Assignment {

	public static void main(String[] args) {
//		objects of animal class
		Animal dog=new Animal();//directly assigning values.................
		System.out.println("For dogs:: ");
		dog.legs=4;
		dog.typeOfEater="Omnivores";
		dog.eat();                 //using static method...................
		System.out.println("legs: "+dog.legs);
		System.out.println("typeOfEater: " +dog.typeOfEater);
		System.out.println();
		
		System.out.println("For cats:: ");
		Animal cat=new Animal();//using constructor without parameters............
		System.out.println(cat);
		System.out.println();
		
		System.out.println("For cow:: ");
		Animal cow=new Animal();//using setter and getter...........
		cow.setLegs(4);
		cow.setTypeOfEaters("Herbivores");
		System.out.println("Legs: "+cow.getLegs());
		System.out.println("TypeOfEaters: "+cow.getTypeOfEaters());
		System.out.println();
		
		System.out.println("For elephant:: "); //using paramatrized constructor................
		Animal elephant=new Animal(4,"herbivores");
        System.out.println(elephant);
		
		

	}

}
