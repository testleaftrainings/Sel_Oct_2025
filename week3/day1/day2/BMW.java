package week3.day2;

public class BMW extends Car{
	
	public void turnOnAc() {
		System.out.println("Ac is turned on---->bmwclass");
	}
	public void voiceCommand() {
		System.out.println("voice cmd is enabled---->bmw class");
	}
	public static void main(String[] args) {
		BMW B=new BMW();
		B.applyBrake();
		B.applyGear();
		B.turnOnAc();
	}

}
