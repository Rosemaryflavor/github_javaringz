package car;

public class Lightcar extends Car {

	private double discountOffer;
	
	public Lightcar() {
		
	}
	
	public Lightcar(String arg1, int arg2, int arg3, String arg4) {
		this.discountOffer = arg5;
		super(arg1, arg2, arg3, arg4);
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
}
