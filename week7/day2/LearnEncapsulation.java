package week7.day2;

public class LearnEncapsulation {
	
	private int ssn;
private String empName;
	
	public static void main(String[] args) {
		LearnEncapsulation le=new LearnEncapsulation();
		
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
