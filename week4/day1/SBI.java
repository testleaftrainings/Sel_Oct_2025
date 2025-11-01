package week4.day1;

public class SBI extends Axis implements RBI,HDFC {

	@Override
	public void Kyc() {
		System.out.println("Aadhar card");
		
	}
	public void goldLoan() {
		System.out.println("interest rate is 5%");
	}
	
	public static void main(String[] args) {
		SBI SB=new SBI();
		SB.Kyc();
		SB.withDrawalLimit();
		SB.housingLoan();
		SB.crditCard();
	}
	@Override
	public void crditCard() {
		System.out.println("limit is 50,000");
		
	}
	

}
