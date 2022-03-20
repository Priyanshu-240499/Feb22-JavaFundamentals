package march14Assignment;

class Vehicle{
	int vehicleId;
	int numberOftyres;
	String Colour;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getNumberOftyres() {
		return numberOftyres;
	}
	public void setNumberOftyres(int numberOftyres) {
		this.numberOftyres = numberOftyres;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	
	Vehicle() {//constructor with no arguments
		
	}
	public Vehicle(int vehicleId, int numberOftyres, String colour) {//constructor with arguments
		
		this.vehicleId = vehicleId;
		this.numberOftyres = numberOftyres;
		Colour = colour;
	}
	
	public String toString() {
		return "[vehicleId=" + vehicleId + ", numberOftyres=" + numberOftyres + ", Colour=" + Colour + "]";
	}
	
	
}

public class Myclass {

	public static void main(String[] args) {
		Vehicle bike=new Vehicle();//using default constructor
		bike.vehicleId=12345;
		bike.numberOftyres=2;
		bike.Colour="Black";
		System.out.println("Vehicle id for bike: "+bike.getVehicleId());
		System.out.println("Number of tyres in bike: "+bike.numberOftyres);
		System.out.println("Colour of bike: "+bike.Colour);
		System.out.println();

		
		Vehicle car=new Vehicle(23456,4,"White");//using argument constructor
		System.out.println(car+ "\n");
		
		Vehicle truck=new Vehicle(34567,6,"Red");//using argument constructors
		System.out.println(truck);


	}

}
