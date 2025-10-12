package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		/*
		 * Switch case works based on the commonExpression
		 * shortcut:type:switch and do ctrl+space 
		 */

		String browser="firefox";
		switch (browser) {
		case "Chrome":
			System.out.println("launch the chrome browser");
			break;
			
		case "Edge":
			System.out.println("launch the Edge browser");
			break;
		case "Safari":
			System.out.println("launch the safari browser");
			break;
			default:
				System.out.println("open IE");
				
				
			
		}
	}

}
