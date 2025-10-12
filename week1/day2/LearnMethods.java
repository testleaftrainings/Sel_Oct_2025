package week1.day2;

public class LearnMethods {
	//syn:accessmodifier returntype mtdname(arguments)
	
	
	public void addTwoNumbers(int a,float b){
		System.out.println(a+b);
	}
	
	private int noOfBicycles(){
		return 3;
	}
	
	String bicycleData(String brandName,String colour){
		return brandName+" "+colour;
	}
	
	public static void main(String[] args) {
		LearnMethods lm1=new LearnMethods();
		lm1.addTwoNumbers(6, 7.7f);
		System.out.println(lm1.bicycleData("honda", "red"));
		int noOfBicycles = lm1.noOfBicycles();//ctr+2,enter L
		System.out.println(noOfBicycles);
	}
}
