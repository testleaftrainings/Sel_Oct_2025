package week4.day1;

public interface RBI {
	/**
	 * 1)creates the method only till version 1.7 but after that by using default
	 * and static we can implement the methods in interface
	 * 2)it is not possible to crate an object
	 * 
	 */
	
	public void Kyc();
	public default void withDrawalLimit() {
		System.out.println("withDrawal limit is Rs 10000");
	}
	public static void bankBalance() {
		System.out.println("balance is 2000");
	}
		
	
	

}
