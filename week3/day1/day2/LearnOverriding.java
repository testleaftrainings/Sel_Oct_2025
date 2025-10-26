package week3.day2;

public class LearnOverriding extends LearnOverloading {
	
	/**
	 * Overriding:
	 * -have the same signature and same input arguments
	 * -based on inheritance
	 */
	public void add() {
		int a=12;
		int b=6;
		System.out.println(a+b);
		super.add();
	}
	public void add(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		LearnOverriding lo=new LearnOverriding();
		lo.add();
	}

}
