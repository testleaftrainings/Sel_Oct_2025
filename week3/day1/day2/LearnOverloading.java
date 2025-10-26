package week3.day2;

public class LearnOverloading {
	/**
	 * overloading:
	 * -if the method signature is same but with different input arguments
	 * 
	 */
	
	public void add() {
		int a=10;
		int b=8;
		System.out.println(a+b);
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		LearnOverloading lo=new LearnOverloading();
		lo.add();
	}

}
