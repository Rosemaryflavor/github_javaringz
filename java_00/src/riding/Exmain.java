package riding;

public class Exmain {

	public static void main(String[] args) {
		
		Ride ride = new Ride();
		
		ride.move();
		ride.moveRide(new Airplane());
		ride.moveRide(new Bike());
		ride.moveRide(new Bus());
		ride.moveRide(new Cycle());
		ride.moveRide(new Ship());
	}

}
