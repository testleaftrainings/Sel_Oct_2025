package week3.day1;

public class PrintIntersection {

	public static void main(String[] args) {
		int num[]= {3,4,5,6,7};//5
		int num1[]= {4,5,1,8,2,9};//6
		//output:4,5
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				
				if (num[i]==num1[j]) {//3==4,3==5,3==1
					//4==4
					System.out.println(num[i]);
				}
			}
			
		}
		
	}

}
