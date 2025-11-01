package week4.day1;

public class Axis implements RBI{

	@Override
	public void Kyc() {
		System.out.println("PanCard");
		
	}
	public void housingLoan() {
		System.out.println("interest rate is 8%");
	}
	public static void main(String[] args) {
		Axis AX=new Axis();
		AX.Kyc();
		AX.housingLoan();
	}
	

}
