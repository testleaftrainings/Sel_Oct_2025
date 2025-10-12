package week1.day2;

public class LearnIf {

	public static void main(String[] args) {
		
		int marks=90;
		
		//shortcut: type if and do ctrl+space
		//shortcut:execution:ctrl+fn+f11
		if (marks>50) {
			System.out.println("pass");
			
		}
		if (marks>70) {
			System.out.println("gradeA");
		} else {
			System.out.println("fail");
		}
		
		int marks1=95;
		if (marks1==80) {
			
			System.out.println("gradeo");
			
		} else if(marks1<50) {
			System.out.println("fail");
		}
		else if(marks1>95) {
			System.out.println("distinction");
		}
		
		  else { System.out.println("out of range"); }
		 
		
		
		

	}

}
