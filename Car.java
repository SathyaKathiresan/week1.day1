package week1.day1;

public class Car {
	
	public void applyBrake() {
		System.out.println("Brake function gets executed");
	}

	public void applyGear() {
		System.out.println("Gear functionality");
	}
	
	public void swictchOnAC() {
		System.out.println("AC functions");
	}
	
	public void applyAccelerate() {
		System.out.println("Accelerator");
	}
	
	public static void main(String[] args) {
		
		Car objCar = new Car();
	
		objCar.applyBrake();
		objCar.applyGear();
		objCar.applyAccelerate();
		objCar.swictchOnAC();
	

	}
	


}


