package week1.day2;

public class LearnMethod {
	
	//syn:accessmodifier returntype mtdname
	int noOfLearners=60;
	public void add() {
		int a=6;
		int b=2;
		System.out.println(a+b);
	}
	
	public void sub() {
		int a=6;
		int b=2;
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		//syn:classname object=new classname();
		LearnMethod lm=new LearnMethod();
		lm.add();
		lm.sub();
		System.out.println(lm.noOfLearners);
		
	}

}
