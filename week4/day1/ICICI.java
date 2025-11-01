package week4.day1;

public class ICICI extends SingaporeBank {

	
	public void Kyc() {
		System.out.println("DrivingLicense");
		
	}

	
	public void cibilScore() {
		System.out.println("-1");
		
	}
	public static void main(String[] args) {
		ICICI IC=new ICICI();
		IC.convertCurrrency();
		IC.cibilScore();
	}

}
