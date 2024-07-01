package car;

public class Truck extends Car {

	private double weight;
	
	public Truck(String arg1, int arg2, int arg3, String arg4, double arg5) {
		this.weight = arg5;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	} 

}
