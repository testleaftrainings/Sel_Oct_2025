package week7.day2;

public class LearnFinally {
public static void main(String[] args) {
	int x=8;
	int y=0;

		try {
			System.out.println(x/y);
		} 
		/*
		 * catch (ArithmeticException e) { System.out.println(e); }
		 */
		finally {
			System.out.println("finally done");
		}
		System.out.println("completed");
}
}
