package car;

public class Carmain {

	public static void main(String[] args) {
		// carEx1() method 선언
		// 기본 Car, 화물차 Truck, 경차 LightaCar 객체 생성 및 내용 확인

		carEx1();
	}

	private static void carEx1() {
		// 기본 Car
		Car c1 = new Car();
		c1.setModel("제네시스");
		c1.setWheel(4);
		c1.setSeat(4);
		c1.setFuel("휘발유");
		
	}

}
