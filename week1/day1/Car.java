package week1.day1;

public class Car {

	public void driverCar() {
		System.out.println("Driving car");
	}
	
	public String driverCar1() {
		return "Driving Myself";
		
	}
	
	public void applyBrake() {
		System.out.println("Applying Brake");
	}
	
	public String applyBrake1() {
		return "Braked";
		
	}
	
	public void soundHorn() {
		System.out.println("Sounds Good");
	}
	
	public int soundHorn1() {
		return 123456;
		
	}
	
	public void isPunchutre() {
		System.out.println("True");
	}
	
	public boolean isPuncture1() {
		return false;
		
	}

	public static void main(String[] args) {
		Car c =new Car();
		c.applyBrake();
		String applyBrake1 = c.applyBrake1();
		System.out.println(applyBrake1);
		c.driverCar();
		String driverCar1 = c.driverCar1();
		System.out.println(driverCar1);
		c.isPunchutre();
		boolean puncture1 = c.isPuncture1();
		System.out.println(puncture1);
		c.soundHorn();
		int soundHorn1 = c.soundHorn1();
		System.out.println(soundHorn1);
	}
}
