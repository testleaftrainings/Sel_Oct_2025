package week7.day2;

public class LeanExceptionHandling {
	public static void main(String[] args) {
		int x=8;
		int y=0;
		int num[]= {4,5,6,3,2,1};
		
			try {
				System.out.println(x/y);
				System.out.println(num[6]);
			} 
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				
				System.out.println(num[6]);
			} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("done");
	}

}
