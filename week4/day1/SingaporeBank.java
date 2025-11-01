package week4.day1;

public abstract class SingaporeBank implements RBI {
	
	/**
	 * abstract class will not force to add the unimlemented methods of interface.
	 * -bec here it can have both implemented and unimplemented methods
	 * -partial abstraction
	 * -cannot create an object
	 */
	private int speed=20;
	public void convertCurrrency() {
		System.out.println("in dollars");
	}
	public abstract void cibilScore();

}
